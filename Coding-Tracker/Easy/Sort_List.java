/*
 * Problem   : Sort List
 * Platform  : LeetCode
 * Difficulty: Easy
 * Language  : java
 * URL       : https://leetcode.com/problems/sort-list/submissions/2123533621/
 * Solved    : 2026-08-29
 */

/*
 * ── Problem Statement ────────────────────────────────────────────────
 * Given the head of a linked list, return the list after sorting it in ascending order.
 * 
 *  
 * Example 1:
 * 
 * Input: head = [4,2,1,3]
 * Output: [1,2,3,4]
 * 
 * 
 * Example 2:
 * 
 * Input: head = [-1,5,3,4,0]
 * Output: [-1,0,3,4,5]
 * 
 * 
 * Example 3:
 * 
 * Input: head = []
 * Output: []
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	The number of nodes in the list is in the range [0, 5 * 104].
 * 	-105 <= Node.val <= 105
 * 
 * 
 *  
 * Follow up: Can you sort the linked list in O(n logn) time and O(1) memory (i.e. constant space)?
 */

slow=slow.next;
        ListNode slow=head,fast=head.next;
        while(fast!=null && fast.next!=null){
        if(head==null || head.next==null) return head;
    static ListNode findMid(ListNode head){
class Solution {
 */
 * }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
/**
 * Definition for singly-linked list.
 * public class ListNode {