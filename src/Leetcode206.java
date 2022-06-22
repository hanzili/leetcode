public class Leetcode206 {
    int size;
    MyLinkedList.ListNode head;

    public Leetcode206() {
        this.size = 0;
        this.head = new MyLinkedList.ListNode();
    }

    public MyLinkedList.ListNode reverseList(MyLinkedList.ListNode head) {
        MyLinkedList.ListNode prev = null;
        MyLinkedList.ListNode cur = head;
        MyLinkedList.ListNode next;
        while(cur!=null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
