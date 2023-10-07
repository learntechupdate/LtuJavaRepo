package Interviewquestions.reversePrograms;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedListExample
{
    public static void main(String[] args) 
    {
        //Constructing a LinkedList
        LinkedList<Integer> list = new LinkedList<Integer>();
         
        list.add(56);
         
        list.add(67);
         
        list.add(81);
         
        list.add(41);
         
        list.add(63);
         
        list.add(21);
         
        list.add(96);
         
        //Printing list before reverse
         
        System.out.println("LinkedList Before Reverse :");
         
        System.out.println(list);
         
        //Reversing the list using Collections.reverse() method
         
        Collections.reverse(list);
         
        //Printing list after reverse
         
        System.out.println("LinkedList After Reverse :");
         
        System.out.println(list);
    }
}
