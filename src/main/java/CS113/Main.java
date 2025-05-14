package CS113;

import java.util.Random;

import java.util.ArrayList;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        int STACK_SIZE = 7;

        Random random = new Random();

        Stack<Integer> stack1 = new Stack<Integer>();

        System.out.println("creating number stack...");
        for(int i = 0; i < STACK_SIZE; i++)
        { stack1.push(random.nextInt(100)); }
        System.out.println("created stack: " + stack1.toString());

        System.out.println("\n'pop' the stack (variable " + stack1.pop() + " is removed)");
        System.out.println("updated stack: " + stack1.toString());

        System.out.println("\n'push' " + stack1.push(random.nextInt(900) + 100) + " onto the stack");
        System.out.println("updated stack: " + stack1.toString());

        System.out.println("\n'peek' the stack");
        System.out.println("variable " + stack1.peek() + " is returned");
        
//        for(int i = 0; i < list1.size(); i++)
//            list1.add(random.nextInt(100));
//
//            list1.insertionSort();
    }
}