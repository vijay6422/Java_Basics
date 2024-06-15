package JavaPrograms;

public class Sum_of_first_100_numbers {

    public static void main(String[] args) {

        int sum = 0;

        for(int i=1; i<=100; i++){

            sum = sum + i;
        }

        System.out.println("Sum of First 100 numbers is " + sum);
    }
}
