public class Leetcode0207 {
    public MyLinkedList.ListNode getIntersectionNode(MyLinkedList.ListNode headA, MyLinkedList.ListNode headB) {
        MyLinkedList.ListNode pointerA = headA;
        MyLinkedList.ListNode pointerB = headB;
        int counterA = 1;
        int counterB = 1;
        while(pointerA!=null){
            pointerA = pointerA.next;
            counterA++;
        }
        while(pointerB!=null) {
            pointerB = pointerB.next;
            counterB++;
        }
        pointerA = headB;
        pointerB = headA;
        int difference = counterA - counterB;
        while(difference!=0) {
            if (difference>0) {
                pointerB = pointerB.next;
                difference--;
            } else {
                pointerA = pointerA.next;
                difference++;
            }
        }
        while (pointerA!=pointerB) {
            pointerA = pointerA.next;
            pointerB = pointerB.next;
        }
        if (pointerA==null) return null;
        else return pointerA;
    }
}
