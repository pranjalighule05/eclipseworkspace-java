
class Node{
	int data;
	Node next;
	
	public Node(int d) {
		data=d;
		next=null;
	}
}
public class Singly_linked_list {
	Node head;
	
	void add(int data) {
	Node newNode= new Node(data);
		if (head==null) {
			head=newNode;
			}
		else {
			
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		}
	void show() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-");
			temp=temp.next;
			
		}
		System.out.println("Null");
	}
		
		public static void main(String args[]) {
			
			Singly_linked_list list = new Singly_linked_list();
			list.add(10);
			list.add(20);
			list.add(30);
			list.add(40);
			
			list.show();
		}
		
	}
	 
	


