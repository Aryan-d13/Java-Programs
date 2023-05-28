 class MySingleLinkedList{
    Node head;
    private int size;
    MySingleLinkedList()
    {
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void reverseLinkedList()
    {
        if(head == null || head.next == null)
        {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode.next != null)
        {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            
            // Update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next =null;
        head= prevNode;
    }
    public void deleteLast()
    {
        if(head == null)
        {
            System.out.println("Nothing To Delete!");
            return;
        }
        size--;
        if(head.next == null)
        {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        
    }
    public void deleteFirst()
    {
        size--;
        if(head == null)
        {
            System.out.println("Nothing To Delete!");
            return;
        }
        head = head.next;
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
    public void addAt(String data, int index)
    {
        if(index> getSize())
        {
            System.out.println("List is shorter then the index");
            return;
        }
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node curNode = head;
        Node nextNode = head.next;
        for(int i =0;i!=index;i++)
            curNode = curNode.next;
        for(int i = 0;i<index;i++)
            nextNode = nextNode.next;
        curNode.next = newNode;
        newNode.next = nextNode;
    }
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null)
            currNode = currNode.next;
        currNode.next = newNode;
    }
    public void printList()
    {
        if(head == null)
        {
            System.out.println("List is Empty!");
            return;
        }
        Node curNode = head;
        while(curNode != null)
        {
            System.out.print(curNode.data + "-->");
            curNode = curNode.next;
        }
        System.out.println("Null");
    }
    public int getSize()
    {
        return size;
    }
    public static void main(String[] ess)
    {
        MySingleLinkedList list = new MySingleLinkedList();
        
        list.addLast("5");
        list.addFirst("4");
        list.addFirst("3");
        list.addFirst("2");
        list.addFirst("1");
        list.addLast("6");

        list.printList();
        // System.out.println(list.getSize()); 
        // list.reverseLinkedList();
        // list.printList();

        // System.out.println(list.getSize()); 

    }
}