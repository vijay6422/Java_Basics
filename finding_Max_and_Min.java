package JavaPrograms;

public class finding_Max_and_Min {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9};

        //Logic

        int max = a[0];
        int min = a[0];

        for(int i=0;i<a.length;i++){

            if(max < a[i]){
                max = a[i];
            }

            if(min > a[i]){

                min = a[i];

            }
        }

        System.out.println("Max = " +max);
        System.out.println("Min = "+min);



    }
}
