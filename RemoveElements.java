/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    /**
     * @param head a ListNode
     * @param val an integer
     * @return a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // Write your code here
        
        while (head!=null && head.val==val)
            head=head.next;
        if (head==null)
            return null;
        ListNode p = head;
        ListNode q = p.next;
        while(q!=null)
        {
            if(q.val==val)
            {
                q=q.next;
                p.next=q;
                
            }
            else
            {
                p=q;
                q=q.next;
            }
        }
        return head;
    }
}