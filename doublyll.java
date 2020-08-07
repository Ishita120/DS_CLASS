package data;

public class doublyll {


		  
	    
		  
	    class Node{  
	        int data;  
	        Node previous;  
	        Node next;  
	  
	        public Node(int data) {  
	            this.data = data;  
	        }  
	    }  
	  
	      
	    Node head, tail = null;  
	  
	  
	    public void addNode(int data) {  
	      
	        Node newNode = new Node(data);  
	  
	       
	        if(head == null) {  
	       
	            head = tail = newNode;  
	            
	            head.previous = null;  
	         
	            tail.next = null;  
	        }  
	        else {  
	            
	            tail.next = newNode;  
	        
	            newNode.previous = tail;  
	          
	            tail = newNode;  
	           
	            tail.next = null;  
	        }  
	    }  
	  
	 
	    public void display() {  
	       
	        Node current = head;  
	        if(head == null) {  
	            System.out.println("empty");  
	            return;  
	        }  
	        System.out.println("Nodes are: ");  
	        while(current != null) {  
	 
	  
	            System.out.print(current.data + " ");  
	            current = current.next;  
	        }  
	    }  
	  
	    public static void main(String[] args) {  
	  
	        doublyll List = new doublyll();  
	         
	        List.addNode(11);  
	        List.addNode(21);  
	        List.addNode(31);  
	        List.addNode(41);  
	        List.addNode(51);  
	  
	        
	        List.display();  
	    }  
	}


