public class CircularlyLinkedList<E>
{
    // ------------ nested Node class ------------
    private static class Node<E>
    {
        // Attributes
        private E element;
        private Node<E> next;

        // Constructor
        public Node(E element, Node<E> next)
        {
            this.element = element;
            this.next = next;
        }

        // Methods
        public E getElement()
        {
            return this.element;
        }

        public Node<E> getNext()
        {
            return this.next;
        }

        public void setNext(Node<E> next)
        {
            this.next = next;
        }
    }
    // ------------ end of nested Node class ------------

    // Instance variables (of CLL)
    private Node<E> tail;
    private int size;

    // Constructor
    public CircularlyLinkedList()
    {
        this.tail = null;
        this.size = 0;
    }

    // Access methods
    
    /** Returns the size of this CLL */
    public int size()
    {
        return this.size;
    }

    /** Returns true if this CLL is empty, and false otherwise */
    public boolean isEmpty()
    {
        return this.size == 0;
    }

    /** Returns (but does not remove) the first element in this CLL */
    public E first()
    {
        if (this.isEmpty())
            {
                return null;
            }
        return this.tail.getNext().getElement();
    }
}
