package JavaPrograms;

import java.util.Scanner;

public class Compare_Two_Strings {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string");

        String s1 = scan.nextLine();

        System.out.println("Enter the second string");

        String s2 = scan.nextLine();

        if(s1.equalsIgnoreCase(s2)){

            System.out.println("Strings are equal");
        }else {

            System.out.println("Strings are not equal");
        }

        //boolean result = s1.equalsIgnoreCase(s2);


    }
}
