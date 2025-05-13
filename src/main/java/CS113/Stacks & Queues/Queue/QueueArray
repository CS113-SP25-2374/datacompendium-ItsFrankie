public class QueueArray<E> implements QueueInterface<E> 
{
    E[] array;
    int first;
    int last;
    int count;

    @Override
    public boolean add(E element) //ArrayQueue(1)
    {  //ArrayDeque (5)
        if (count == array.length - 1) 
        { 
            resize(array.length * 2); //ArrayDeque (1)
        }

        if (last == -1) {
            first = last = 0;
            array[last] = element;
            count++;
        } 
        else 
        {
            last++;
            if (last > array.length - 1) 
            {
                last = 0;
            }
            array[last] = element;
            count++;
        }
        return true;
    }

    @Override
    public E element() //ArrayQueue(2)
    { //ArrayDeque (6)
        E temp = array[first];
        array[first] = null;
        first++;
        return temp;
    }

    @Override
    public boolean offer(E element) //ArrayQueue(3)
    { //ArrayDeque (2)
        if (count == array.length - 1) 
        {
            return false;
        } 
        
        add(element); //ArrayDeque (4)
        return true;
    }

    @Override
    public E peek() //ArrayQueue(4)
    { //ArrayDeque(8)
        return array[first];
    }

    @Override
    public E poll() //ArrayQueue(5)
    { //ArrayDeque (10)
        return this.element(); //ArrayQueue (3)
    }

    @Override
    public E remove() //ArrayQueue(6)
    { //ArrayDeque (6)
        return this.element(); //ArrayQueue (3)
    }
}