 public class Unionoftwosorted {
    public static void main(String args[]) {

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,5,6,7};

        int n = arr1.length;
        int m = arr2.length;

        int i = 0, j = 0;

        while(i < n && j < m){

            if(arr1[i] < arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
            }
            else if(arr1[i] > arr2[j]){
                System.out.print(arr2[j] + " ");
                j++;
            }
            else{
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

        // Print remaining elements

        while(i < n){
            System.out.print(arr1[i] + " ");
            i++;
        }

        while(j < m){
            System.out.print(arr2[j] + " ");
            j++;
        }
    }
} 
