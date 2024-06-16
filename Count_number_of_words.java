package JavaPrograms;

import java.util.Scanner;

public class Count_number_of_words {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any statement");

       String  str = scan.nextLine();

       scan.close();

       //Logic

       String[] str1= str.split(" ");

        System.out.println("The number of words is " + str1.length);

    }
}
