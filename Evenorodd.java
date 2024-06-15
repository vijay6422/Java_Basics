package JavaPrograms;

import java.util.Scanner;

public class Evenorodd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number");

        int num = scan.nextInt();

        scan.close();


        if(num%2==0){
            System.out.println(num + " Even Number");
        }
        else{
            System.out.println(num + " odd number");
        }
    }
}
