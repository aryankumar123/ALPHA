package LinkedList;

public class MergeLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    //print code for LL
    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node head1 = n1;
        head1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        Node m1 = new Node(3);
        Node m2 = new Node(4);
        Node m3 = new Node(6);
        Node m4 = new Node(8);
        Node m5 = new Node(9);
        Node head2 = m1;
        head2.next = m2;
        m2.next = m3;
        m3.next = m4;
        m4.next = m5;
        m5.next = null;
         
        //create head3 for merged list
            Node head3 = new Node(-1);
            Node ptr1 = head1;
            Node ptr2 = head2;
            Node ptr3 = head3;

            while(ptr1 !=null && ptr2 !=null){
                if(ptr1.data <= ptr2.data ){
                    ptr3.next = ptr1;
                    ptr1 = ptr1.next;
                    ptr3 = ptr3.next;
                    ptr3.next = null;
                }
                else{
                    ptr3.next = ptr2;
                    ptr2 = ptr2.next;
                    ptr3 = ptr3.next;
                    ptr3.next = null;
                }
            }
            while(ptr1 !=null){
                ptr3.next = ptr1;
                ptr1 = ptr1.next;
                ptr3 = ptr3.next;
                ptr3.next = null;
            }
            while(ptr2 !=null){
                ptr3.next = ptr2;
                ptr2 = ptr2.next;
                ptr3 = ptr3.next;
                ptr3.next = null;
            }

        

    //corner case
        if(head3.next == null){
            head3.data = -1;
            System.out.print(head3.data);
        }

    //print LL
        printList(head3);

    }
    
}
