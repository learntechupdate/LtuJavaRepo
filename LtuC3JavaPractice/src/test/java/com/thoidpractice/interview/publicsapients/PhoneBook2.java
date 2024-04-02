package com.thoidpractice.interview.publicsapients;

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

/*
cons- input don't handle to the check it has , or more than one ,
 */
public class PhoneBook2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Enter name and phonenumber one after another with comma separtion in each line enter q to quit
//Start


        //write your code here
        String nameToLookup;
        String phonebookInput;
        ArrayList<String> phnNameArrayList=new ArrayList<>();
        while (true) {
            System.out.println("EnterPhonebook or 'q' to quit");
            phonebookInput = sc.nextLine();
            if(phonebookInput.equalsIgnoreCase("q")) {
                break;
            }
            phnNameArrayList.add(phonebookInput);
        }

        /*for(  String val:phnName) {
            System.out.println(val);
        }*/

        //maaz,3232323 split String[] = {maaz} ,{33232323}
       /* String[] splitPhoneBook=phnName.get(0).split(",");
        String name = splitPhoneBook[0];String phoneNum = splitPhoneBook[1];*/

        Map<String, String> phonebook = new HashMap<>();


        for (int i = 0; i <phnNameArrayList.size() ; i++) {
            String[] splitPhoneBook=phnNameArrayList.get(i).split(",");
            phonebook.put(splitPhoneBook[0],splitPhoneBook[1]);
        }

//        System.out.println(phonebook);

        System.out.println("Enter the name to get the PhoneNumber");
        nameToLookup=sc.nextLine();

        String phoneNumber =lookupPhoneNumber(phonebook,nameToLookup);

        System.out.println("Phone number for "+nameToLookup+": "+ phoneNumber);


//End
//Enter name to lookup


}

public static String lookupPhoneNumber(Map<String,String> phonebook, String name){
return phonebook.getOrDefault(name,"Phone number not found");
}

}


