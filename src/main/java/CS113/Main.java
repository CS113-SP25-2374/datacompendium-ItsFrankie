package CS113;

import java.util.Random;

import java.util.ArrayList;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();

        Stack<Integer> list1 = new Stack<Integer>(10);
        
        for(int i = 0; i < list1.size(); i++)
            list1.add(random.nextInt(100));

            list1.inserti();
    }
}