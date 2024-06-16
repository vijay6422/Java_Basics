package JavaPrograms;

import java.util.Scanner;

public class Sum_of_all_digits {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter any number");

        int num = scan.nextInt();

        scan.close();

        //Logic

        int sum = 0;

        while (num!=0){
           int reminder = num % 10;

           sum = sum + reminder;

           num = num / 10;
        }

        System.out.println("Sum of all the digits :" + sum);
    }
}
