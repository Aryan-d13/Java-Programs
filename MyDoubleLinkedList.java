public class MyDoubleLinkedList 
{
    Node head;
    Node tail;
    class Node
    {
        Node prev;
        String data;
        Node next;
        Node(String data)
        {
            this.prev = null;
            this.next = null;
            this.data = data;
        }
    }
    
    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        tail = newNode;
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null)
            currNode = currNode.next;
        currNode.next = newNode;
        newNode.prev = currNode;
    }
    public void printList()
    {
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }
        Node curNode = head;
        while(curNode != null)
        {
            System.out.print(curNode.data+"-->");
            curNode = curNode.next;
        }
        System.out.println("null");
    }
    public void printListInReverse()
    {

    }
    public static void main(String[] args)
    {
        MyDoubleLinkedList list = new MyDoubleLinkedList();

        list.addFirst("is");
        list.addLast("a List");
        list.addFirst("This");

        list.printList();
    } 
}
