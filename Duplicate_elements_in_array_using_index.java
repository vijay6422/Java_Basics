package JavaPrograms;

public class Duplicate_elements_in_array_using_index {

    public static void main(String[] args) {

       int[] a = {3,2,3,6,};

       for(int i=0;i<a.length;i++){

           for(int j=i+1;j<a.length;j++ ){

               if(a[i]==a[j]){

                   System.out.println(a[i] + " is a duplicated array");
               }
           }
       }
    }
}
