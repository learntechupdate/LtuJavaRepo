package Interviewquestions.reversePrograms;

public class ReverseEachWord
{
    static void reverseEachWordOfString(String inputString)
    {
        String[] words = inputString.split(" ");
         
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
         
        System.out.println(inputString);
         
        System.out.println(reverseString);
         
        System.out.println("-------------------------");
    }

    public static String reverseWords(String input) {
        // Split the input string into words
        String[] words = input.split(" ");

        // Initialize a StringBuilder to store the reversed string
        StringBuilder reversedBuilder = new StringBuilder();

        // Reverse the order of words and append them to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversedBuilder.append(words[i]).append(" ");
        }

        // Remove the trailing space and return the reversed string
        return reversedBuilder.toString().trim();
    }


    public static void main(String[] args) 
    {
        /*reverseEachWordOfString("Java Concept Of The Day");

        reverseEachWordOfString("Java J2EE JSP Servlets Hibernate Struts");

        reverseEachWordOfString("I am string not reversed");

        reverseEachWordOfString("Reverse Me");*/

        System.out.println(reverseWords("WindowsXP is everlasting in my mind"));

    }
}
