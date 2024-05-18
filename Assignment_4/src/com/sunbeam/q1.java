package com.sunbeam;

public class q1
{
		static class Node{
			private int data;
			private Node next;
			public Node(int value) {
				data = value;
				next = null;
			}
		}
		
		private Node head;
	    private Node tail;
		public q1() 
	    {
			head = null;
	        tail=null;
		}
		
		public boolean isEmpty() {
			return head == null && tail == null;
		}

	    public void addFirst(int value)
	    {
	        Node newnode=new Node(value);
	        newnode.next = head;
	        head = newnode;
	    }

	    public void addLast(int value)
	    {
	        Node newnode=new Node(value);

	        if(isEmpty())
	        {
	            head=tail=newnode;
	        }

	        else
	        {
	            Node trav = head;
				while(trav.next != null)
	            {
	                trav=trav.next;
	            }
	            trav.next = newnode;
	            tail=newnode;
	        }

	    }
	    public void deleteFirst()
	    {
	        if(isEmpty())
	        {
				return;
	        }
	        else
	        {
	            head = head.next;
	        }
	        
	    }
	    public void deleteLast()
	    {
	        if(isEmpty())
			{	return; }

	        else if(head.next == null && tail.next==null)
			{	head =tail = null; }
	        else
	        {
	            Node trav = head;
				while(trav.next.next != null)
					trav = trav.next;

	                trav.next = null;
	                tail=trav;

	        }
	    }
	    public void display() 
	    {
			
			Node trav = head;
			System.out.print("List :: ");
			while(trav != null) {
				
				System.out.print(" " + trav.data);
				
				trav = trav.next;
			}
			System.out.println("");
		}
	}
