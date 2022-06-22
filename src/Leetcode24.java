public class Leetcode24 {
    public static MyLinkedList.ListNode swapPairs(MyLinkedList.ListNode head) {
        MyLinkedList.ListNode prev = null;
        MyLinkedList.ListNode pointer = head;
        MyLinkedList.ListNode nextPointer;
        MyLinkedList.ListNode next;
        MyLinkedList.ListNode newHead = null;
        int count = 1;
        if (head==null) return null;
        if (head.next == null) return head;
        while (pointer!=null && pointer.next!=null) {
            nextPointer = pointer.next;
            if (count == 1) newHead = nextPointer;
            next = nextPointer.next;
            nextPointer.next = pointer;
            if (prev!=null) prev.next = nextPointer;
            pointer.next = next;
            prev = pointer;
            pointer = pointer.next;
            count++;
        }
        return newHead;
    }
    public static void displayLinkedList(MyLinkedList linkedList) {
        MyLinkedList.ListNode pointer = linkedList.head;
        while(pointer!=null) {
            System.out.print(pointer.val + ", ");
            pointer = pointer.next;
        }
        System.out.print("\n");
    }

    public static void main(String args[]) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtTail(1);
        linkedList.addAtTail(2);
        linkedList.addAtTail(3);
        linkedList.addAtTail(4);
        displayLinkedList(linkedList);
        swapPairs(linkedList.head);
        displayLinkedList(linkedList);
    }
}
