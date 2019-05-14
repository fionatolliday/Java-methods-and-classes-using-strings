public class Helper {

    String userString;

    public Helper() {
        this.userString = userString;
    }


    public void setUserString(String userString) {
        this.userString = userString;
    }

    public String getUserString() {
        return userString;
    }


    public int countNumberOfCharacters() {
        String string = getUserString();
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ')
                count++;
        }
        return count;
    }

    public boolean numberOfCharactersIsOdd() {
        if (countNumberOfCharacters() %2 == 0){
            return false;
        } else {
            return true;
        }
    }


    public int countTheVowels() {
        int count = 0;
        for (int i = 0; i < getUserString().length(); i++)
    {
        if (getUserString().charAt(i) == 'a' || getUserString().charAt(i) == 'e' || getUserString().charAt(i) == 'i'
                || getUserString().charAt(i) == 'o' || getUserString().charAt(i) == 'u')
        {
            count++;
        }
    }
        return count;
}
//
//    }
//
//    public char middleCharacter() {
//
//    }
}




//    Create a helper class which should have below methods :
//
//        1. Write a Java method to count all vowels in a string.
//        Test Data:
//        Input the string: Test
//        Expected Output:Number of  Vowels in the string: 1
//
//        2. Write a Java method to display the middle character of a string. Go to the editor
//        Note: a) If the length of the string is even there will be two middle characters.
//        b) If the length of the string is odd there will be one middle character.
//        Test Data:
//        Input a string: 350
//        Expected Output: The middle character in the string: 5
//
//        Have a another class which contains Main method and calls above two methods as per user input i.e.
//
//        Display :
//        1. Count Vowels
//        2. Find Middle Character
//
//        If user chooses 1 , it should call helper class vowel method .. if he chooses 2 than find middle.