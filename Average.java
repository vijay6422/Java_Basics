package JavaPrograms;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number : ");

        int firstnumber = scan.nextInt();

        System.out.println("Enter second number : ");

        int secondnumber = scan.nextInt();

        System.out.println("Enter third number : ");

        int thirdnumber = scan.nextInt();

        scan.close();

        //Logic for finding the average

        System.out.println("The average of the numbers is " + (firstnumber+secondnumber+thirdnumber)/3.0);





    }
}
