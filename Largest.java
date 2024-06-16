package JavaPrograms;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("enter first number");

        int a = scan.nextInt();

        System.out.println("enter second number");

        int b = scan.nextInt();

        System.out.println("enter third number");

        int c = scan.nextInt();

        scan.close();

        //Logic for finding the largest

        if(a>b && a>c){
            System.out.println(a + " is the largest");

        }else if(b>c){
            System.out.println(b + " is the largest");
        }
        else{
            System.out.println(c + " is the largest");
        }
    }
}
