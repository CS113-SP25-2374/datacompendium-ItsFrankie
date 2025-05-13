package CS113.StacksQueues.PriorityQueue;

import java.util.ArrayList;

public class PriorityQueue <E extends Comparable<E>>
{
    ArrayList<E> array1 = new ArrayList<>();

    public PriorityQueue()
    {

    }

    public void heapifyUp(E element0, int index0)
    {
        if (index0 < 0)
        { return; }

        int parentIndex = (index0 - 1) / 2;
        E parent = array1.get(parentIndex);

        if (element0.compareTo(parent) < 0)
        {
            array1.set(parentIndex, element0);
            array1.set(index0, parent);
            heapifyUp(element0, parentIndex);
        }
    } //end of heapifyUp method

    public void heapifyDown(E element0, int index0)
    {
        int leftChild = index0 * 2 + 1;
        int rightChild = index0 * 2 + 2;
        int smallest = index0;

        if (leftChild >= array1.size())
        {
            smallest = leftChild;
        }
        else if(rightChild < array1.size())
        {
            smallest = rightChild;
        }

        E smallestValue = array1.get(smallest);
        if (element0.compareTo(smallestValue) > 0)
        {
            array1.set(index0, smallestValue);
            array1.set(smallest, element0);
            heapifyDown(element0, smallest);
        }

    } //end of heapifyDown method

    public boolean add(E element0)
    {
        array1.add(element0);
        heapifyUp(element0, array1.size()-1);
        return true;
    }

    public E peek()
    {
       return array1.get(0);
    }

    public E poll()
    {
        E first = array1.get(0);
        E last = array1.get(array1.size() - 1);
        array1.set(0, last);
        heapifyDown(last,0);
        return first;
    }
}