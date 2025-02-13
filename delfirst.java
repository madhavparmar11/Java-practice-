public class delfirst {
    private int size;

    delfirst() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void addLast(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.err.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.err.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondLastNode = lastNode;
            lastNode = lastNode.next;
        }
        secondLastNode.next = null;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        Node currNode = head;
        if (currNode == null) {
            System.out.println("List is empty");
            return;
        }
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        delfirst d = new delfirst();
        d.addLast("hero");
        d.addLast("goooo");
        d.addLast("world");

        System.out.println("Before deleting first node:");
        d.printList();
        System.out.println("Size: " + d.getSize());

        d.deleteFirst();
        System.out.println("After deleting first node:");
        d.printList();
        System.out.println("Size: " + d.getSize());

        d.deleteLast();
        System.out.println("After deleting last node:");
        d.printList();
        System.out.println("Size: " + d.getSize());
    }
}
