package leetcode.easy;

import java.util.Scanner;

public class MergeTwoSortedLists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }
    public void input(Scanner scanner) {

        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        ListNode cur = list1;

        System.out.print("Enter the first list size : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            cur.next = new ListNode(scanner.nextInt());
            cur = cur.next;
        }

        System.out.print("Enter the second list size : ");
        n = scanner.nextInt();
        cur = list2;
        for (int i = 1; i <= n; i++) {
            cur.next = new ListNode(scanner.nextInt());
            cur = cur.next;
        }

        ListNode result = mergeTwoSortedLists(list1.next, list2.next);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public ListNode mergeTwoSortedLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode cur = result;
        while (list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }

            cur = cur.next;
        }

        if (list1 != null) {
            cur.next = list1;
        }

        if (list2 != null) {
            cur.next = list2;
        }

        return result.next;
    }

}
