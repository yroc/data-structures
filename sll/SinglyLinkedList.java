public class SinglyLinkedList<E>
{
    // ------------ nested Node class ------------
    private static class Node<E>
    {
        // Attributes
        private E element;      // reference to the element stored at this node
        private Node<E> next;   // reference to the subsequent node in the list

        // Constructor
        public Node(E element, Node<E> next)
        {
            this.element = element;
            this.next = next;
        }

        // Methods
        /** Returns this node's element */
        public E getElement()
        {
            return this.element;
        }

        /** Returns a reference to the next node after this one */
        public Node<E> getNext()
        {
            return this.next;
        }

        /** Places the given node after this one */
        public void setNext(Node<E> next)
        {
            this.next = next;
        }
    }
    // ------------ end of nested Node class ------------

    // Instance variables (of SLL class)
    private Node<E> head;       // reference to the initial node in the list
    private Node<E> tail;       // reference to the last node in the list
    private int size;           // the number of nodes in the list

    // Constructor
    public SinglyLinkedList()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Access methods
    /** Returns the size of this SLL */
    public int size()
    {
        return this.size;
    }

    /** Returns true if this SLL is empty, else returns false */
    public boolean isEmpty()
    {
        return this.size == 0;
    }

    /** Returns (but does not remove) the first element in the list */
    public E first()
    {
        if (this.isEmpty())
            {
                return null;
            }
        return this.head.getElement();
    }

    /** Returns (but does not remove) the last element in the list */
    public E last()
    {
        if (this.isEmpty())
            {
                return null;
            }
        return this.tail.getElement();
    }

    // Update methods
    /** Adds the given element to the beginning of this list */
    public void addFirst(E e)
    {
        this.head = new Node<>(e, this.head);
        if (this.isEmpty())
            {
                this.tail = this.head;
            }
        size++;
    }

    /** Adds the given element to the end of this list */
    public void addLast(E e)
    {
        Node<E> newest = new Node<>(e, null);
        if (this.isEmpty())
            {
                this.head = newest;
            }
        else
            {
                this.tail.setNext(newest);
                this.tail = newest;
                size++;
            }
    }

    /** Removes and returns the first element of this list. Or returns null if
     * this list is empty. */
    public E removeFirst()
    {
        if (this.isEmpty())
            {
                return null;
            }
        E element = this.head.getElement();
        this.head = this.head.getNext();
        size--;
        if (this.isEmpty())
            {
                this.tail = null;
            }
        return element;
    }
}
