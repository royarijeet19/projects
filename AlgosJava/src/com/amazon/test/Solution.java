package com.amazon.test;

class ListNode
{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


class Solution 
{
    public static void main(String[] args) 
    {       
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
//        ListNode node8 = new ListNode(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
//        node7.next = node8;


        ListNode node = reverseSecondHalf(node1);

        while (node != null)
        {
            System.out.println(node.val);
            node = node.next;
        }

    }

    public static ListNode reverseSecondHalf(ListNode start)
    {   
        ListNode temp = start; int count = 0;
        while(temp != null) {
        	temp = temp.next;
        	count ++;
        }
        
        int midPrev = count/2;
        
        ListNode temp2 = start;
        while(midPrev-- > 1) {
        	temp2 = temp2.next;
        }
        
        temp2.next = reverseList(temp2.next);
        
        return start;
        

    }

	private static ListNode reverseList(ListNode start) {
		// TODO Auto-generated method stub
		ListNode prev = null; ListNode currNext = null;
		while(start != null) {
			currNext = start.next;
			start.next = prev;
			prev = start;
			start = currNext;
		}
		
		return prev;
	}
}