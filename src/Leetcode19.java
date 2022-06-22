public class Leetcode19 {
    public static MyLinkedList.ListNode removeNthFromEnd(MyLinkedList.ListNode head, int n) {
        MyLinkedList.ListNode slowPointer = head;
        MyLinkedList.ListNode fastPointer = head;
        int counter = 1;
        if (head==null) return null;
        if (head.next==null) return null;
        while (counter!=(n+1)) {
            fastPointer = fastPointer.next;
            counter++;
        }
        if (fastPointer==null) {
            head = head.next;
            return head;
        }
        while (fastPointer.next!=null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        // fastPointer and slowPointer never point to null
        // fastPointer is always after slowPointer
        if (slowPointer.next!=null) {
            slowPointer.next = slowPointer.next.next;
        }
        return head;
    }

    public static void main(String args[]) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtTail(1);
        linkedList.addAtTail(2);
        removeNthFromEnd(linkedList.head,2);
    }

}
