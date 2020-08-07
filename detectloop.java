package data;

public class detectloop {


	    Node head;
	    class Node{
	        int data;
	        Node next;
	        Node(int x)
	        {
	            data = x;
	            next = null; 
	        }
	    }
	    public void push(int data) 
	    { 
	        Node node = new Node(data); 
	        node.next = head;  
	        head = node; 
	    } 
	    void detect_Loop() 
	    { 
	        Node slow_p = head, fast_p = head; 
	        int flag = 0; 
	        while (slow_p != null && fast_p != null && fast_p.next != null) { 
	            slow_p = slow_p.next; 
	            fast_p = fast_p.next.next; 
	            if (slow_p == fast_p) { 
	                flag = 1; 
	                break; 
	            } 
	        } 
	        if (flag == 1) 
	            System.out.println("Loop found"); 
	        else
	            System.out.println("Loop not found"); 
	    } 
	    public static void main(String [] args)
	    {
	        detectloop llist = new detectloop();
	         
	        llist.push(100); 
	        llist.push(40); 
	        llist.push(156); 
	        llist.push(107); 
	  
	        llist.head.next.next.next.next = llist.head; 
	  
	        llist.detect_Loop();
	    } 
	}
		 
	


