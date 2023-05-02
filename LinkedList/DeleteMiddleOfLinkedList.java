package LinkedList;

public class DeleteMiddleOfLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;

        //check corner case
        if(head.next == null){
            head.data = -1;
            System.out.print(head.data);
        }

        //count number of nodes 
        Node ptr = head;
        int count = 0;
        while(ptr != null){
            ptr = ptr.next;
            count++;
        }

        //reach till n-1 node 
        ptr = head;
        int moves = count/2 - 1;
        while(moves != 0){
            ptr = ptr.next;
            moves--;
        }

        //delete the just next where are u current standing node
        ptr.next=ptr.next.next;

        printList(head);

    }
    
}
