package CS113;

public class ArrayListFN <E> implements ListInterface <E>
{
    private E[] array1;
    final static int DEFAULT_SIZE = 10;

    public ArrayListFN()
    {
        array1 = (E[]) new Object[DEFAULT_SIZE];
    }

    private void resize()
    {
        E[] resizedArray = (E[]) new Object[array1.length + array1.length / 2];
        for(int i = 0; i < array1.length; i++)
        {   //copy over the array
            resizedArray[i] = array1[i];
        }   //update the array
        array1 = resizedArray;
    }


    @Override
    public boolean add(E element0)
    {
        if(array1[array1.length-1] != null)
        {   //if last index is NOT null
            resize();
            array1[array1.length] = element0;
        }
        for (int i = 0; i < array1.length; i++)
        {   //go through every index until you find an empty one
            if (array1[i] == null)
            {   //if spot [i] is empty, fill it with element0 and stop
                array1[i] = element0;
                return true;
            }
        }
        return true;
    }

    @Override
    public void add(int index0, E element0)
    {
        if (index0 < 0 || index0 >= array1.length)
        { //if index0 is out of bounds
            throw new IndexOutOfBoundsException();
        }
        if(array1[array1.length-1] != null)
        {   //if last index is NOT null
            resize();
        }
        else if (index0 == array1.length - 1)
        {   //if last index is empty and index0 is the last element in array1
            array1[array1.length - 1] = element0;
        }
        for(int i = size()-1; i>=index; i--)
        {
            array1[i] = array[i-1];
        }

        for (int i = index0; i < array1.length; i++)
        {   /*//start at index0 and push occupying element forward
            E element1 = array1[i+1]; //store element one spot ahead as element1
            array1[i+1] = array1[i]; //move element in current spot forward by one
            array1[i] = element0; //store former occupying element as element0
            element0 = element1; //they are now the same (?)*/
        }
    } //end of add(index0, element0) method

    @Override
    public void clear()
    {
        for (int i = 0; i < array1.length; i++)
        {
            array1[i] = null;
        }
    }

    @Override
    public boolean contains(Object element0)
    {
        return indexOf(element0) >= 0;
    }

    @Override
    public int indexOf(Object object0)
    {
        if(object0 != null)
        {
            return -1;
        }
        for(int i=0; i<array1.length; i++)
        { //scroll through all objects in the array
            if(object0.equals(array1[i]))
            {
                return i;
            }
            return -1;
        }
        return 0;
    }

    @Override
    public E get(int index0)
    {
        if(index0 < 0 || index0 > array1.length)
        {
            throw new IndexOutOfBoundsException();
        }
        return array1[index0];
    }

    @Override
    public boolean isEmpty()
    { //returns true if an array is empty
        return array1[0] == null;
    }

    @Override
    public boolean remove(int index0)
    { //remove an element, then collapse the array
        for(int i = index0; i < array1.length; i++)
        { //push each element backward by one index
            array1[i] = array1[i+1];
        } //set last element to null after moving it back one index
        array1[array1.length - 1] = null;
        return true;
    }

    @Override
    public boolean remove(E element0)
    {
        int index1 = indexOf(element0);
        return remove(index1);
    }

    @Override
    public int size()
    {  //return the amount of elements in the array
        for (int i = array1.length; i>=0; i--)
        {
            if(array1[i] != null)
            {   //return the amount of elements (?)
                return i+1;
            }
        }
        return 0;
    }

    @Override
    public void set(int index0, E element0)
    {   //replace an element with another (element0)
        if(index0 < 0 || index0 > array1.length)
        {
            throw new IndexOutOfBoundsException();
        }
        array1[index0] = element0;
    }

    @Override
    public String toString()
    {
        StringBuilder sBuilder1 = new StringBuilder();

        sBuilder1.append("[");

        int size = size();
        for (int i = 0; i < size; i++) {
            sBuilder1.append(array1[i]);
            if (i < size - 1) sBuilder1.append(", ");
        }

        sBuilder1.append("]");
        return sBuilder1.toString();
    }
}
