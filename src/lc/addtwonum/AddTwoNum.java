package lc.addtwonum;

/**
 * @author caitianxiang
 */
public class AddTwoNum {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //哑结点：带有头部哑节点的链表可以简化代码的逻辑。这种简化体现在我们循环链表时，我们的代码可以不用考虑第一个节点的特殊情况。
        ListNode result = new ListNode(0);
        ListNode res = result;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int a = (l1 != null) ? l1.val : 0;
            int b = (l2 != null) ? l2.val : 0;
            int sum =  a + b + carry;
            carry = sum / 10;
            res.next = new ListNode(sum % 10);
            res = res.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            res.next = new ListNode(carry);
        }
        return result.next;
    }

}
