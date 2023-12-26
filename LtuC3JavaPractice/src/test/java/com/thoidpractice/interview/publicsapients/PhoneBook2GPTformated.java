package com.thoidpractice.interview.publicsapients;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook2GPTformated {

    /**
     * Main method to run the Phonebook application.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instructions for the user
        System.out.println("Enter name and phone number one after another with comma separation in each line. Enter 'q' to quit.");

        // Initialize variables and data structures
        String nameToLookup;
        String phonebookInput;
        ArrayList<String> phnNameArrayList = new ArrayList<>();

        // Continuously prompt the user for phonebook entries
        while (true) {
            System.out.println("Enter a Phonebook entry or 'q' to quit:");
            phonebookInput = sc.nextLine();
            if (phonebookInput.equalsIgnoreCase("q")) {
                break;
            }
            phnNameArrayList.add(phonebookInput);
        }

        // Create a phonebook using a Map
        Map<String, String> phonebook = new HashMap<>();

        // Parse and populate the phonebook
        for (int i = 0; i < phnNameArrayList.size(); i++) {
            String[] splitPhoneBook = phnNameArrayList.get(i).split(",");
            phonebook.put(splitPhoneBook[0], splitPhoneBook[1]);
        }

        // Prompt the user to enter a name to lookup
        System.out.println("Enter the name to get the Phone Number:");
        nameToLookup = sc.nextLine();

        // Look up the phone number for the provided name
        String phoneNumber = lookupPhoneNumber(phonebook, nameToLookup);

        // Display the result
        System.out.println("Phone number for " + nameToLookup + ": " + phoneNumber);
    }

    /**
     * Looks up a phone number in the provided phonebook using the given name.
     *
     * @param phonebook The phonebook (a Map) containing names and phone numbers.
     * @param name      The name to look up in the phonebook.
     * @return The phone number associated with the given name, or "Phone number not found" if not found.
     */
    public static String lookupPhoneNumber(Map<String, String> phonebook, String name) {
        return phonebook.getOrDefault(name, "Phone number not found");
    }
}

