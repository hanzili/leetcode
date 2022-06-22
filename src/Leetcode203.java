import java.util.List;

public class Leetcode203 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head==null) return null;
        while (head.val == val) {
            head = head.next;
            if (head==null) return null;
        }
        ListNode prev = head;
        ListNode pointer;
        if (prev.next!=null) pointer = prev.next;
        else return prev;
        while (pointer.next!=null) {
            if (pointer.val==val) {
                prev.next = pointer.next;
                pointer = pointer.next;
            }
            else {
                prev = prev.next;
                if (pointer.next!=null) pointer = pointer.next;
                else return head;
            }
        }
        if (pointer.val==val) prev.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(1,c);
        ListNode e = new ListNode(2,d);
        ListNode result = removeElements(e,1);
        int num = 0;
        while(result.next!=null) {
            System.out.println(num +" "+ result.val);
            result = result.next;
            num++;
        }
        System.out.println(num +" "+ result.val);
    }
}
