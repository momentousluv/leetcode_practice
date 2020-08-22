package leetcode;

import java.util.List;

public class MergeTwoSortedLists_21 {
    public static void main(String[] args) {
        MergeTwoSortedLists_21 mergeTwoSortedLists_21 = new MergeTwoSortedLists_21();
        ListNode firstListNode = new ListNode();
        ListNode secondListNode = new ListNode();

        firstListNode.value = 1;
        firstListNode.next = new ListNode(2);
        firstListNode.next.next = new ListNode(4);

        secondListNode.value = 1;
        secondListNode.next = new ListNode(3);
        secondListNode.next.next = new ListNode(4);

        ListNode listNode = mergeTwoSortedLists_21.mergeTwoLists(firstListNode, secondListNode);

        while(listNode.next != null) {
            System.out.println("listNode.value: " + listNode.value);
            listNode = listNode.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode tempListNode = listNode;

        while(l1 != null || l2 != null) {
            tempListNode.next = new ListNode();
            tempListNode = tempListNode.next;

            if(l2 == null) {
                System.out.println("l2 is null: " + l1.value);
                tempListNode.value = l1.value;
                l1 = l1.next;
            }
            else if(l1 == null) {
                System.out.println("l1 is null: " + l2.value);
                tempListNode.value = l2.value;
                l2 = l2.next;
            }
            else {
                System.out.println("l1.value: " + l1.value + ", l2.value: " + l2.value);
                if(l1.value <= l2.value) {
                    tempListNode.value = l1.value;
                    l1 = l1.next;
                }
                else {
                    tempListNode.value = l2.value;
                    l2 = l2.next;
                }

            }
        }

        return listNode.next;
    }

    static class ListNode {
        int value;

        ListNode next;

        ListNode() {

        }

        ListNode(int value) {
            this.value = value;
        }

        ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
}
