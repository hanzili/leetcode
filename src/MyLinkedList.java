public class MyLinkedList {
    int size;
    ListNode head;
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public MyLinkedList() {
        this.size = 0;
        this.head = new ListNode();
    }

    public int get(int index) {
        if (index >= this.size) return -1;
        ListNode pointer = this.head;
        int counter = 0;
        while (pointer!=null) {
            if (counter==index) {
                return pointer.val;
            }
            pointer = pointer.next;
            counter++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        ListNode NewHead = new ListNode(val);
        if (this.size == 0) this.head = NewHead;
        else {
            NewHead.next = this.head;
            this.head = NewHead;
        }
        size++;
    }

    public void addAtTail(int val) {
        ListNode NewTail = new ListNode(val);
        if (this.size == 0) this.head = NewTail;
        else {
            ListNode pointer = head;
            while (pointer.next!=null) pointer = pointer.next;
            pointer.next = NewTail;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index<=0) addAtHead(val);
        else if (index==size) addAtTail(val);
        else {
            ListNode pointer = this.head;
            int counter = 0;
            ListNode NewNode = new ListNode(val);
            while (pointer.next!=null) {
                if (counter+1==index) {
                    NewNode.next = pointer.next;
                    pointer.next = NewNode;
                    size++;
                    break;
                } else {
                    pointer = pointer.next;
                    counter++;
                }
            }
        }
    }

    public void deleteAtIndex(int index) {
        if (index >= size || size == 0) return;
        if (size==1) {
            size = 0;
            this.head = null;
            return;
        }
        if (index==0) {
            this.head = head.next;
            size--;
            return;
        }
        ListNode pointer = this.head;
        int counter = 0;
        while(pointer!=null) {
            if (counter+1==index) {
                if (pointer.next!=null) pointer.next = pointer.next.next;
                size--;
                break;
            } else {
                pointer = pointer.next;
                counter++;
            }
        }
    }

    public static void displayLinkedList(MyLinkedList linkedList) {
        ListNode pointer = linkedList.head;
        while(pointer!=null) {
            System.out.print(pointer.val + ", ");
            pointer = pointer.next;
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        displayLinkedList(linkedList);
        linkedList.deleteAtIndex(0);
        //linkedList.addAtTail(3);
        //linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
        //linkedList.get(1);            //返回2
        //linkedList.deleteAtIndex(0);  //现在链表是1-> 3
        //linkedList.get(0);            //返回3

        //["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
        //[[],[1],[3],[1,2],[1],[0],[0]]

       // ["MyLinkedList","addAtHead","deleteAtIndex"]
        //[[],[1],[0]]
    }
}

