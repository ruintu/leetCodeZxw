package suanfa.leetcode;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 15:17 2021/2/9
 * @Modifued By:
 */
 public class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        //使用递归解决该问题

        return head;
    }

    //反转链表
    //重点就是：对于链表 其实就是记住 我前一个人是谁 我是谁 我后面的人是谁
    public ListNode reverseListNode(ListNode head){
        ListNode pre,cur,next;
        pre = null;
        cur = head;
        next = head;
        while(cur != null){
            next = cur.next;
            //反转链表
            cur.next = pre;

            pre = cur;
            cur = next;
        }
        return pre;
    }

    public ListNode reverseListNode2(ListNode head,ListNode tail){
        ListNode pre,cur,next;
        pre = null;
        cur = head;
        next = head;
        while(cur != tail){
            next = cur.next;
            //反转链表
            cur.next = pre;

            pre = cur;
            cur = next;
        }
        return pre;
    }

}