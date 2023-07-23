class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}

public class MergeandSortLL {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.value <= l2.value) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        
        current.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
      
        ListNode node1 = new ListNode(75);
        ListNode node2 = new ListNode(53);
        ListNode node3 = new ListNode(36);
        ListNode node4 = new ListNode(10);
        ListNode node5 = new ListNode(38);
        ListNode node6 = new ListNode(94);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        
        ListNode node7 = new ListNode(65);
        ListNode node8 = new ListNode(92);
        ListNode node9 = new ListNode(15);
        ListNode node10 = new ListNode(58);
        ListNode node11 = new ListNode(24);
        ListNode node12 = new ListNode(83);

        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;

        
        ListNode mergedList = mergeTwoLists(node1, node7);

        // Print the output linked list
        System.out.println("Output:");
        printLinkedList(mergedList);
}
}