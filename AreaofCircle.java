package JavaPrograms;

import java.util.Scanner;

public class AreaofCircle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);




        System.out.println("Enter the radius of the circle : ");

        double radius = scan.nextDouble();

        scan.close();

        //Logic

        System.out.println(radius +(Math.PI*radius*radius));




    }
}
