public class Leetcode142 {
    public static MyLinkedList.ListNode detectCycle(MyLinkedList.ListNode head) {
        MyLinkedList.ListNode fast = head;
        MyLinkedList.ListNode slow = head;
        while(slow.next!=null && fast.next!=null && fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow) {
                MyLinkedList.ListNode start = head;
                MyLinkedList.ListNode same = slow;
                while (start!=same) {
                    start = start.next;
                    same = same.next;
                }
                return start;
            }
        }
        return null;
    }

    public static void main(String args[]) {
        MyLinkedList linkedList = new MyLinkedList();
        MyLinkedList.ListNode d = new MyLinkedList.ListNode(-4);
        MyLinkedList.ListNode c = new MyLinkedList.ListNode(0,d);
        MyLinkedList.ListNode b = new MyLinkedList.ListNode(2,c);
        MyLinkedList.ListNode a = new MyLinkedList.ListNode(3,b);
        d.next = a;
        linkedList.head = a;
        System.out.print(detectCycle(a).val);

        MyLinkedList linkedList2 = new MyLinkedList();
        MyLinkedList.ListNode e = new MyLinkedList.ListNode(1);
        MyLinkedList.ListNode f = new MyLinkedList.ListNode(2,e);
        e.next = f;
        System.out.print(detectCycle(e).val);
    }
}
