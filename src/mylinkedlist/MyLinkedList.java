package mylinkedlist;

public class MyLinkedList {
    private Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count += 1;
            temp = temp.next;
        }
        return count;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void deleteFist() {
        Node temp = head.next;
        head.next = null;
        head = temp;
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.display();
        System.out.println();
        System.out.println(linkedList.length());
        linkedList.deleteFist();
        linkedList.display();
    }
}
