/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	       	ListNode l3 = new ListNode(99);
	        ListNode root=l3;
	        int tmp=0;
	        int flag=0;
	        while(l1!= null || l2!=null)
	        {
	        	if(l1==null && l2!=null)
	        		l1=new ListNode(0);
	        	else if(l1!=null && l2==null)
	        		l2=new ListNode(0);
	        	tmp=l1.val+l2.val;
	        	if(tmp+flag<10)
	        	{
	        		l3.next=new ListNode(tmp+flag);
	        		l3=l3.next;
	        		flag=0;
	        	}
	        	else
	        	{
	        		l3.next=new ListNode((tmp+flag)%10);
	        		l3=l3.next;
	        		flag=1;
	        	}
	        	l1=l1.next;
	        	l2=l2.next;
	        }
        	if(flag==1)
        	{
        		l3.next=new ListNode(flag);
        	}
			return root.next;
    }
}