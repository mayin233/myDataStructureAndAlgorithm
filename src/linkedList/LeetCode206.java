package linkedList;

/**
 * 反转链表
 * Created by my on 2019/11/23.
 */
public class LeetCode206 {
     static class ListNode {

        int val;
        ListNode next;

        public ListNode() {

        }

        public ListNode(int x) {
            this.val = x;
        }

        public ListNode createLinkedList(int[] nums) {
            if (nums.length == 0) {
                return null;
            }
            ListNode head = new ListNode(nums[0]);
            //一定要找一个current节点挂接head
            ListNode current = head;
            for (int i = 1; i < nums.length; i++) {
                current.next = new ListNode(nums[i]);
                current = current.next;
            }
            return head;
        }

        public void printLinkedList(ListNode head) {
            ListNode cur = head;
            while (cur != null) {
                System.out.print(cur.val + "->");
                cur = cur.next;
            }
            System.out.print("null");
        }

        public void printReverseLinkedList(ListNode head){
            if(head == null){
                return ;
            }
            printLinkedList(head.next);
            System.out.println(head.val);
        }

         /**
          * 翻转链表
          * @param head
          * @return
          */
        public ListNode reverseLinkedList(ListNode head) {
            if(head == null){
                return null;
            }
            ListNode cur = head;
            ListNode pre = null;
            while (cur!=null){
                ListNode temp = cur.next;//先保存当前节点的next节点
                cur.next=pre;
                pre = cur;
                cur = temp;
            }

            return pre;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        ListNode listNode = new LeetCode206.ListNode();

        ListNode linkedList = listNode.createLinkedList(nums);
//        listNode.printLinkedList(linkedList);
        //翻转
        listNode.reverseLinkedList(linkedList);
        listNode.printReverseLinkedList(linkedList);
//        System.out.println(node.val);
    }


}
