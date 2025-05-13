public class AVLTree <E extends Comparable<E>> extends BinarySearchTree<E>
{
    Node<E> rotateLeft(Node<E> node0)
    {   //switch places with node on the left
        Node<E> childRight = node0.right;
        node0.right = childRight.left;
        childRight.left = node0;
        node0 = childRight;
        return node0;
    } //end of rotateLeft(node0) method

    Node<E> rotateRight(Node<E> node0)
    {
        Node<E> childLeft = node0.left;
        node.left = childLeft.Right;
        childLeft.right = node0;
        node0 = childLeft;
        return node0;
    } //end of rotateRight(node0) method

    int balanceFactor(Node<E> node0)
    {
        if (node == null) { return 0; }
        return heightRecursive(node0.right) - heightRecursive(node.left);
    } //end of balanceFactor(node0) method

    Node<E> rebalance(Node<E> node0)
    {
        int balance = balanceFactor(node0);

        if (balance > 1)
        {
            if (balanceFactor(node0.right) < 0)
            {
                node.right = rotateRight(node0.right);
            }
            node0 = rotateLeft(node0);
        }
        if (balance <= -1)
        {
            if (balanceFactor(node0.left) > 0)
            {
                node.left = rotateLeft(node0.left);
            }
            node0 = rotateLeft(node0);
        }
    }

    @Override
    Node<E> insertRecursive(Node<E> node0, E element0)
    {
        node0 = super.insertRecursive(node0, element0);
        node0 = rebalance(node0);
        return node0;
    }
}
