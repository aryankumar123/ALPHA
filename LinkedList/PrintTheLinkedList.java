package LinkedList;

public class PrintTheLinkedList {
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
        printList(head);
    }
}

