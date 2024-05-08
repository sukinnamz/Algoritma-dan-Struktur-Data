package Pertemuan11;

public class SingleLinkedList {
    Node15 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node15 tmp = head;
            System.out.print("Isi Linked List \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;

            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input) {
        Node15 ndInput = new Node15(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node15 ndInput = new Node15();
        ndInput.data = input;
        if (!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node15 ndInput = new Node15(input, null);
        Node15 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int input) {
        Node15 ndInput = new Node15();
        // if (index > 0) {
        //     System.out.println("Perbaiki logikanya! " + "kalau indeksnya -1 bagaimana???");
        if (index == -1) {
            addFirst(input);
        } else {
            Node15 temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = new Node15(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
