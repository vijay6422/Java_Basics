package JavaPrograms;

import java.util.Scanner;

public class Multiplication_Table {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number");

       int num = scan.nextInt();


       for(int i=1; i<=10;i++){

           System.out.println(num +"*" +i+"=" +(i*num));
       }



    }

}
