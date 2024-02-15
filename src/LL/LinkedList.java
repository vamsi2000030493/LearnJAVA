package LL;

public class LinkedList
{

    private Node head;
    private Node tail;
    private int size;

    public LinkedList()
    {
        this.size = 0;
    }

    public void insertAtFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null)
        {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val)
    {
        if(tail == null)
        {
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index)
    {
        if(index == 0)
        {
            insertAtFirst(val);
            return;
        }

        if(index == size)
        {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1 ; i < index ; i++)
        {
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public void deleteFirst()
    {
        int val = head.value;
        head = head.next;

        if(head == null)
        {
            tail = null;
        }

        size--;

    }

    public void display()
    {
        Node temp = head;
         while(temp != null)
         {
             System.out.print(temp.value + " -> ");
             temp = temp.next;
         }
        System.out.println("END");
    }

    private class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value = value;
        }

        public Node(int value,Node next)
        {
            this.value = value;
            this.next = next;
        }


    }
}
