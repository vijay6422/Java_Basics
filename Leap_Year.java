package JavaPrograms;

import java.util.Scanner;

public class Leap_Year {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any year");

        int year = scan.nextInt();

        scan.close();

        boolean isLeapyear = false;

        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    isLeapyear = true;
                }
                else {
                    isLeapyear = false;
                }

            }else
            {
                isLeapyear = true;

            }
        }
        else
        {
            isLeapyear = false;
        }

        if(isLeapyear){
            System.out.println("Given year " + year+ " is a Leap Year");
        }
        else {
            System.out.println("Given year " + year+ " is not a Leap Year");
        }


    }
}
