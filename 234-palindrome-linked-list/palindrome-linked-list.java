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
class Solution {
    
    

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true; 

    
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalfHead = reverse(slow);

        
        ListNode firstHalfHead = head;
        ListNode temp = secondHalfHead; 
        while (secondHalfHead != null) {
            if (firstHalfHead.val != secondHalfHead.val) {
                reverse(temp); 
                return false;
            }
            firstHalfHead = firstHalfHead.next;
            secondHalfHead = secondHalfHead.next;
        }

        
        reverse(temp);
        return true;
    }

    
    private ListNode reverse(ListNode head) {
        ListNode prev = null, next = null, curr = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    
    
    
}

    