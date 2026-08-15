/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;

class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null)
            return null;

        HashSet<Integer> set = new HashSet<>();

        ListNode current = head;
        ListNode previous = null;

        while (current != null) {

            if (set.contains(current.val)) {

                previous.next = current.next;

            } else {

                set.add(current.val);
                previous = current;
            }

            current = current.next;
        }

        return head;
    }
}