package com.thoidProgamsBestcode;

import java.util.*;

//Enter name and phonenumber one after another with comma separtion in each line enter q to quit
//Start
/*Complete the below Digital phonebook program. Phone book should take name and number in comma seprated and stop on user input "q".
Sample input :
Tom,01234567
Belly,7767687787
Raj,985643333
q
Raj
Sample output : Phone number for raj : 985643333*/

public class PhoneBook2GPTGencode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Enter name and phonenumber one after another with comma separtion in each line enter q to quit
//Start

        //write code
        Map<String, String> phonebook = new HashMap<>();

        while (true) {
            System.out.println("Enter name and phone number separated by a comma (e.g., John,123456) or 'q' to quit:");
            String phonebookInput = sc.nextLine().trim();

            if (phonebookInput.equalsIgnoreCase("q")) {
                break;
            }

            String[] inputParts = phonebookInput.split(",");
            if (inputParts.length != 2) {
                System.err.println("Invalid input format. Please use 'Name,PhoneNumber'.");
                continue;
            }

            String name = inputParts[0].trim();
            String phoneNumber = inputParts[1].trim();
            phonebook.put(name, phoneNumber);
        }

        System.out.println("Enter the name to get the phone number:");
        String nameToLookup = sc.nextLine().trim();

        String phoneNumber = lookupPhoneNumber(phonebook, nameToLookup);

        //End

        System.out.println("Phone number for " + nameToLookup + ": " + phoneNumber);


    }

    public static String lookupPhoneNumber(Map<String, String> phonebook, String name) {
        return phonebook.getOrDefault(name, "Phone number not found");
    }
}



