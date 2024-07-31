class Solution {
    public int findTheWinner(int n, int k)
    {
        CircularLinkedList cll=new CircularLinkedList();
        for(int i=1;i<=n;i++)
            cll.addNode(i);
        Node current=cll.head;
        while(cll.head!=cll.tail)
        {
            for(int j=1;j<k;j++)
                current=current.nextNode;
            cll.deleteNode(current.value);
            current=current.nextNode;
        }
        return cll.head.value;
    }
}
class Node {

    int value;
    Node nextNode;

    public Node(int value) {
        this.value = value;
    }
}
class CircularLinkedList {
    Node head = null;
    Node tail = null;
    public void addNode(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            tail.nextNode = newNode;
        }

        tail = newNode;
        tail.nextNode = head;
    }
    public void deleteNode(int valueToDelete) {
        Node currentNode = head;
        if (head == null) { // the list is empty
            return;
        }
        do {
            Node nextNode = currentNode.nextNode;
            if (nextNode.value == valueToDelete) {
                if (tail == head) { // the list has only one single element
                    head = null;
                    tail = null;
                } else {
                    currentNode.nextNode = nextNode.nextNode;
                    if (head == nextNode) { //we're deleting the head
                        head = head.nextNode;
                    }
                    if (tail == nextNode) { //we're deleting the tail
                        tail = currentNode;
                    }
                }
                break;
            }
            currentNode = nextNode;
        } while (currentNode != head);
    }
}