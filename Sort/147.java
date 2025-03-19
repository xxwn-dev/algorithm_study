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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        //더미노드 생성
        ListNode dummy = new ListNode(0);
        ListNode current = head;

        while(current != null){
            ListNode prev = dummy;  //마지막 노드 추적
            ListNode next = dummy.next;//삽입될 위치 검색

            while(next != null && current.val > next.val){//포인터를 옆으로 옮김
                prev = next;
                next = next.next;
            }
            //current에는 더미 다음 값을, 더미의 다음 값에는 current값을 넣는다.
            ListNode tmp = current.next;//tmp는 current를 다음 노드로 이동시키는데 사용한다.
            current.next = next;// current를 원래 연결 리스트에서 분리, 연결
            prev.next = current;//current 노드를 정렬된 부분의 위치에 삽입
            current = tmp;//current 는 두번째 노드를 가리키게 됨(분리된 current 뒷부분을 다시 넣어줌)
        }
        return dummy.next; 
    }
}
