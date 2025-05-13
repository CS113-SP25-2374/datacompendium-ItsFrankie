package CS113;

public class Main
{
    public static void main(String[] args)
    {
        ArrayListFN<Integer> aList1 = new ArrayListFN<>();
        ArrayListFN<Integer> aList2 = new ArrayListFN<>();

        for(int i=0; i<10; i++)
        {
            aList1.add(i);
            aList2.add(i);
        }
        aList1.add(4,null);
        aList2.add(4,null);

        System.out.println(aList1);
        System.out.println(aList1.size());
        System.out.println(aList2);
        System.out.println(aList2.size());

        aList2.clear();
    }
}