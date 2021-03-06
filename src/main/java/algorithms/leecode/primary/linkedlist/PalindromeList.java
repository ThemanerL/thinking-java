package algorithms.leecode.primary.linkedlist;

/**
 * @author axin
 * @since 2019-09-29
 */
public class PalindromeList {

  /**
   * 第一步找到中点
   * 从中点开始将后续结点反转
   * 两遍开始next比较直到相遇
   *
   * @param head
   * @return
   */
  public static boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) {
      return true;
    }
    if (head.next.next == null) {
      return head.val == head.next.val;
    }
    ListNode one = head.next;
    ListNode two = head.next.next;


    while (two.next != null && two.next.next != null) {
      one = one.next;
      two = two.next.next;
    }
    //链表倒转
    ListNode pre = null;
    ListNode temp = null;
    while (one != null) {
      temp = one.next;
      one.next = pre;
      pre = one;
      one = temp;
    }
    ListNode tail = pre;
    //头尾比较
    while (head != null) {
      if (head.val != tail.val) {
        return false;
      }
      head = head.next;
      tail = tail.next;
    }
    return true;
  }

  public static void main(String[] args) {
    ListNode node7 = new ListNode(1);
    ListNode node6 = new ListNode(2);
    ListNode node5 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node3 = new ListNode(3);
    ListNode node2 = new ListNode(2);
    ListNode node1 = new ListNode(1);
    node6.next = node7;
    node5.next = node6;
    node4.next = node5;
    node3.next = node4;
    node2.next = node3;
    node1.next = node2;

    System.out.println("====" + isPalindrome(node1));
  }

}
