/**
 * Concrete implementation of a binary tree using a node-based, linked structure.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {

  //---------------- nested Node class ----------------
  /** Nested static class for a binary tree node. */
    protected static class BTNode
    {

        // Attributes
        private String word;                // A word in the file
        private int wordCounter;            // Number of occurrences of this word
        private BTNode parent;              // This node's parent
        private BTNode left;                // This node's left child
        private BTNode right;               // This node's right child

        // Constructor
        /**
         * Constructs a new BTNode that stores the specified word
         */
        public BTNode(String s, BTNode left, BTNode right, BTNode parent)
        {
            this.wordCounter = 0;
            this.word = s;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }
        
        // Methods
        /**
         * Returns the word stored in this node
         */
        public String getElement()
        {
            return this.word; 
        }
        /**
         * Returns the number of occurrences of this word
         */
        public int getWordCounter()
        {
            return this.wordCounter;
        }
        /**
         * Increments the counter of this word
         */
        public void increaseWordCounter()
        {
            this.wordCounter++;
        }
        /**
         * Returns a reference to this node's left subtree
         */
        public BTNode getLeft()
        {
            return this.left;
        }
        /**
         * Sets this node's left subtree to the given node
         */
        public void setLeft(BTNode v)
        {
            this.left = v;
        }
        /**
         * Returns a reference to this node's right subtree
         */
        public BTNode getRight()
        {
            return this.right;
        }
        /**
         * Sets this node's right subtree to the given node
         */
        public void setRight(BTNode v)
        {
            this.right = v;
        }
        /**
         * Returns a reference to this node's parent
         */
        public BTNode getParent()
        {
            return this.parent;
        }
        /**
         * Sets this node's parent node to the given node
         */
        public void setParent(BTNode v)
        {
            this.parent = v;
        }
    } //----------- end of nested Node class -----------

    // LinkedBinaryTree instance variables
    /** The root of this binary tree */
    protected BTNode root;

    /** The number of nodes in this binary tree */
    private int size;

    // Constructor
    /** Construts an empty binary tree. */
    public LinkedBinaryTree()
    {
        this.root = null;
        this.size = 0;
    }

    // Accessor methods (not already implemented in AbstractBinaryTree)
    /**
     * Returns the number of nodes in the tree.
     * @return number of nodes in the tree
     */
    @Override
    public int size()
    {
        return this.size;
    }

    /**
     * Returns the root of the tree (or null if tree is empty).
     * @return root of the tree (or null if tree is empty)
     */
    @Override
    public BTNode root()
    {
        return root;
    }

    /**
     * Returns the reference to the given node's parent (or null if the given
     * node is root).
     *
     * @param node A valid Position within this tree
     * @return reference to node's parent (or null if node is root)
     * @throws IllegalArgumentException if node is not a valid reference for
     * this tree.
     */
    @Override
    public BTNode parent(BTNode node) throws IllegalArgumentException
    {
        return node.getParent();
    }

    /**
     * Returns the reference to the given node's left child (or null if no left
     * child exists).
     *
     * @param node A valid node reference within this tree
     * @return the reference to the given node's left child (or null if no left
     * child exists)
     * @throws IllegalArgumentException if node is not a valid reference for this
     * tree
     */
    @Override
    public BTNode left(BTNode node) throws IllegalArgumentException
    {
        return node.getLeft();
    }

    /**
     * Returns the reference to the given node's right child (or null if no right
     * child exists).
     *
     * @param node A valid node reference within this tree
     * @return the reference to the given node's right child (or null if no
     * right child exists)
     * @throws IllegalArgumentException if node is not a valid reference for
     * this tree
     */
    @Override
    public BTNode right(BTNode node) throws IllegalArgumentException
    {
        return node.getRight();
    }

    // update methods supported by this class
    /**
     * Places the given word at the root of an empty tree and returns its new reference
     *
     * @param word the new element
     * @return the reference of the new element
     * @throws IllegalStateException if the tree is not empty
     */
    public BTNode addRoot(String word) throws IllegalStateException
    {
        if (!isEmpty()) throw new IllegalStateException("Tree is not empty");
        this.root = createNode(word, null, null, null);
        this.size = 1;
        return this.root;
    }
    
    /**
     * Creates a new left child for the given node, storing the given word and
     * returning its reference.
     *
     * @param node the node to the left of which the new word is inserted
     * @param word the new word
     * @return the reference to the new node
     * @throws IllegalArgumentException if node is not a valid reference for
     * this tree
     * @throws IllegalArgumentException if the given node already has a left
     * child
     */
    public BTNode addLeft(BTNode node, String word)
        throws IllegalArgumentException
    {
        BTNode parent = node;
        if (parent.getLeft() != null)
            throw new IllegalArgumentException("the given node already has a left child");
        BTNode child = BTNode(word, parent, null, null);
        parent.setLeft(child);
        size++;
        return child;
    }

    /**
     * Creates a new right child for the given node, storing the given word and
     * returning its reference.
     *
     * @param node the node to the right of which the new element is inserted
     * @param word the new word
     * @return the reference to the new node
     * @throws IllegalArgumentException if node is not a valid reference for
     * this tree.
     * @throws IllegalArgumentException if the given node already has a right
     * child
     */
    public BTNode addRight(BTNode node, String word)
        throws IllegalArgumentException
    {
        BTNode parent = node;
        if (parent.getRight() != null)
            throw new IllegalArgumentException("the given node already has a right child");
        BTNode child = BTNode(word, parent, null, null);
        parent.setRight(child);
        size++;
        return child;
    }

    /**
     * Replaces the word of the given node with the given word and returns the
     * replaced word.
     *
     * @param node the given node
     * @param word the new word
     * @return the replaced word
     * @throws IllegalArgumentException if node is not a valid reference for this
     * tree.
     */
    public String set(BTNode node, String word) throws IllegalArgumentException
    {
        String temp = node.getElement();
        node.setElement(word);
        return temp;
    }

    /**
     * Attaches trees t1 and t2, respectively, as the left and right subtree of
     * the given leaf node. As a side effect, t1 and t2 are set to empty trees.
     *
     * @param p   a leaf of the tree
     * @param t1  an independent tree whose structure becomes the left child of p
     * @param t2  an independent tree whose structure becomes the right child of p
     * @throws IllegalArgumentException if p is not a valid Position for this tree
     * @throws IllegalArgumentException if p is not a leaf
     */
    public void attach(Position<E> p, LinkedBinaryTree<E> t1,
                       LinkedBinaryTree<E> t2) throws IllegalArgumentException {
        Node<E> node = validate(p);
        if (isInternal(p)) throw new IllegalArgumentException("p must be a leaf");
        size += t1.size() + t2.size();
        if (!t1.isEmpty()) {                  // attach t1 as left subtree of node
            t1.root.setParent(node);
            node.setLeft(t1.root);
            t1.root = null;
            t1.size = 0;
        }
        if (!t2.isEmpty()) {                  // attach t2 as right subtree of node
            t2.root.setParent(node);
            node.setRight(t2.root);
            t2.root = null;
            t2.size = 0;
        }
    }

    /**
     * Removes the node at Position p and replaces it with its child, if any.
     *
     * @param p   the relevant Position
     * @return element that was removed
     * @throws IllegalArgumentException if p is not a valid Position for this tree.
     * @throws IllegalArgumentException if p has two children.
     */
    public E remove(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        if (numChildren(p) == 2)
            throw new IllegalArgumentException("p has two children");
        Node<E> child = (node.getLeft() != null ? node.getLeft() : node.getRight() );
        if (child != null)
            child.setParent(node.getParent());  // child's grandparent becomes its parent
        if (node == root)
      root = child;                       // child becomes root
    else {
      Node<E> parent = node.getParent();
      if (node == parent.getLeft())
        parent.setLeft(child);
      else
        parent.setRight(child);
    }
    size--;
    E temp = node.getElement();
    node.setElement(null);                // help garbage collection
    node.setLeft(null);
    node.setRight(null);
    node.setParent(node);                 // our convention for defunct node
    return temp;
  }
} //----------- end of LinkedBinaryTree class -----------
