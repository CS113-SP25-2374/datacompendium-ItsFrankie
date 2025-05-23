package CS113.Trees.BinaryTree;

public interface BinarySearchTreeInterface<E extends Comparable<E>>
    {

        // 1) Insert a value into the BST
        void insert(E value);
    
        // 2) Delete a value from the BST
        boolean delete(E value);
    
        // 3) Search for a value in the BST
        boolean contains(E value);
    
        // 4) Find the minimum value in the BST
        E findMin();
    
        // 5) Find the maximum value in the BST
        E findMax();
    
        // 6) Get the height of the BST
        int height();
    
        // 7) Check if the BST is empty
        boolean isEmpty();
    
        // 8) Clear the BST
        void clear();
    }