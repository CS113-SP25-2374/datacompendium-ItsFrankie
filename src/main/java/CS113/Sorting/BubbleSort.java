import java.util.ArrayList;

public class BubbleSort<E>
{
    void bubbleSort(ArrayList<E> unsortedList)
    {
        for (int i = 0; i < unsortedList.size(); i++)
        {
            for (int j = 0; j < unsortedList.size()-1; i++)
            {
                if (unsortedList.get(j) > unsortedList.get(j+1))
                {
                    E e1 = unsortedList.get(j);
                    E e2 = unsortedList.get(j+1)
                    unsortedList.set(j, e2);
                    unsortedList.set(e2, e1);
                    swapped = true;
                }
            } //end of sorting inner loop
            if(!swapped)
                return;
        } //end of sorting outer loop
    }
}