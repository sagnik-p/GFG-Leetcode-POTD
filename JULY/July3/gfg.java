class Solution {
    public Node removeAllDuplicates(Node head) {
        HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
        Node temp = head;
        while (head != null) {
            int key = head.data;
            if (table.containsKey(key))
                table.put(key, table.get(key) + 1);
            else {
                table.put(key, 1);
            }
            head = head.next;
        }
        head = temp;
        Iterator<Map.Entry<Integer, Integer>> iterator = table.entrySet().iterator();
        int x=0;
        while(temp!=null)
        {
            if(table.get(temp.data)!=1)
            {
                head = deleteNode(head,x);
            }
            else
            {
                x++;
            }
            temp=temp.next;
        }
        return head;
    }
    public Node deleteNode(Node head, int i) {
        if (head == null || i < 0) {
            return head;
        }
        if (i == 0) {
            return head.next; // Return the next node as the new head
        }
        Node current = head;
        for (int j = 0; current != null && j < i - 1; j++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            return head;
        }
        current.next = current.next.next;
        return head;
    }
}