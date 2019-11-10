package leetcode;

/**
 * Created by my on 2019/11/10.
 * 需要巩固练习迭代法和递归的实现链表拼接
 */
public class Question21 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 这里采用的是迭代法做的。需要再巩固练习。
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        //定义一个虚拟头结点
        ListNode temp = new ListNode(-1);

        ListNode dummyHead = temp;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1=l1.next;
            }else{
                temp.next = l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        //当l1或l2为空时，挂接不为空的
        if(l1!=null){
            temp.next=l1;
        }
        if(l2!=null){
            temp.next=l2;
        }
        //返回虚拟头结点后面的链表
        return dummyHead.next;
    }
}

