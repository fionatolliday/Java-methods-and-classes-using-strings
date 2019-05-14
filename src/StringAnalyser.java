import java.util.Scanner;

public class StringAnalyser {

    public static void main(String[] args) {
        Helper helper = new Helper();


        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 to find out how many vowels are in a word of your choice, or " +
                "press 2 to find out what the middle letter is in a word of your choice.");
        String menuSelection = input.nextLine();
        if (menuSelection.equals("1")) {
            System.out.println("Please enter the word you would like us to analyse for you.");
            String userString = input.nextLine();
            helper.setUserString(userString);

            System.out.println("The number of vowels in your word are: " + helper.countTheVowels());
        }

        else {
            System.out.println("Please enter the word you would like us to analyse for you.");
            String userString = input.nextLine();
            helper.setUserString(userString);
            helper.middleCharacter();
        }

    }
}




//    Have a another class which contains Main method and calls above two methods as per user input i.e.
//
//        Display :
//        1. Count Vowels
//        2. Find Middle Character
//
//        If user chooses 1 , it should call helper class vowel method .. if he chooses 2 than find middle.
