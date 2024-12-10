class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertAtEnd(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void updateNode(String val, int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                System.out.println("Index out of bounds");
                return;
            }
            temp = temp.next;
        }
        if (temp != null) {
            temp.data = val;
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public void removeFirstNode() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLastNode() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void removeAtIndex(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp.next == null) {
                System.out.println("Index out of bounds");
                return;
            }
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public void removeNode(String data) {
        if (head == null) return;
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && !temp.next.data.equals(data)) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public int sizeOfLL() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd("A");
        list.insertAtEnd("B");
        list.insertAtEnd("C");
        list.printLL();
        list.updateNode("D", 1);
        list.printLL();
        list.removeFirstNode();
        list.printLL();
        list.removeLastNode();
        list.printLL();
        list.removeAtIndex(0);
        list.printLL();
        list.insertAtEnd("E");
        list.insertAtEnd("F");
        list.printLL();
        list.removeNode("E");
        list.printLL();
        System.out.println("Size of Linked List: " + list.sizeOfLL());
    }
}
