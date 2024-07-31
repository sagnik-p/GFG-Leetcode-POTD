class Solution {
    public ListNode mergeNodes(ListNode head)
    {
        int x=0;
        ListNode a=head;
        ListNode b=head;
        ListNode temp;
        while(b.next!=null)
        {
            if(a==b)
                b=b.next;
            // bring b to the next 0 node
            b=b.next;
            while (b.val != 0)
                b = b.next;
            // now b is at a 0 node, a is at previous 0 node;

            //now sum from a till b;
            temp=a;
            while (temp!= b) {
                x+= temp.val;
                temp = temp.next;
            }
            a.val=x;
            x=0;
            a.next=b;
            a=a.next; // a =b =0 node
        }

        temp=head;
        while(temp.next.val!=0)
            temp=temp.next;
        temp.next=null;
        return head;
    }
}