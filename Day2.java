// Question:
// Delete Node in a Linked List
// .

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // take given node and point it to next node while updating value too

        node.val = node.next.val;
        node.next = node.next.next;
    }
}