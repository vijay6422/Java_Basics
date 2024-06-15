package JavaPrograms;

import java.util.Scanner;

public class Using_scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");

       int firstnumber = scan.nextInt();

        System.out.println("Enter second number");

        int secondnumber = scan.nextInt();

        scan.close();


        System.out.println(firstnumber + secondnumber);




    }
}
