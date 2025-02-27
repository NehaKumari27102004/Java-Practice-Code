package Encapsulation.CodingQuestion;

import java.util.Scanner;

public class VowelChecker {

    public static void main(String [] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println ("Enter a  Sentence: ");
        String sentence=scanner.nextLine();

        boolean containsVowel = false;

        String lowerCaseSentence = sentence.toLowerCase();
        
        for( char ch: lowerCaseSentence.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                containsVowel = true;
                break;
            }
        }
        if (containsVowel){
             System.out.println("The sentence contains a vowel.");
         } else {
            System.out.println("The Sentence does not contain any voiwel.");
        }

        scanner.close();
    }
}


