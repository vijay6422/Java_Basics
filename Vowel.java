package JavaPrograms;

import java.util.Scanner;

public class Vowel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any Character");

        char c = scan.next().charAt(0);

        scan.close();


        boolean isVowel = false;


        switch (c){

            case'a':
            case'e':
            case'i':
            case'o':
            case'u':
            case'A':
            case'E':
            case'I':
            case'O':
            case'U': isVowel =true;







        }

        if(isVowel){
            System.out.println(c + " is a Vowel");
        }
        else
        {
            System.out.println(c + " is not a vowel");
        }


    }


}
