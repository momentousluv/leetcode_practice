package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedList_83 {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList_83 removeDuplicatesFromSortedList_83 = new RemoveDuplicatesFromSortedList_83();

        ListNode inputListNode1 = new ListNode(1);
        ListNode inputListNode2 = new ListNode(1);
        ListNode inputListNode3 = new ListNode(2);
        ListNode inputListNode4 = new ListNode(3);
        ListNode inputListNode5 = new ListNode(3);
        inputListNode1.next = inputListNode2;
        inputListNode1.next.next = inputListNode3;
        inputListNode1.next.next.next = inputListNode4;
        inputListNode1.next.next.next.next = inputListNode5;

        ListNode listNode = removeDuplicatesFromSortedList_83.deleteDuplicates(inputListNode1);

        while (listNode != null) {
            System.out.println("listNode.val: " + listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return null;
        }

        ListNode tempListNode = head;

        while(tempListNode.next != null) {
            if(tempListNode.val == tempListNode.next.val) {
                tempListNode.next = tempListNode.next.next;
            }
            else {
                tempListNode = tempListNode.next;
            }
        }

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}