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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){return head;}
        ListNode current;
        ListNode tail = null;
        Boolean swapped ;
        do{
            current = head;
            swapped = false;
            while(current.next != tail){
                if(current.val> current.next.val) {//현재값이 다음 값보다 크면
                    int temp = current.val;//현재값을 임시에 넣고
                    current.val = current.next.val;//다음 값을 현재값에 넣는다
                    current.next.val = temp;
                    swapped = true;
                }
                current = current.next;
            }
            tail = current;
        } while (swapped);
        return head;
    }   
}
