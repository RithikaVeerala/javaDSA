public class Leftrotatebyd{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int d=3;

        int n=arr.length;

        int temp[] = new int[d];

        // Store first d elements in temp
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }

        // Shift remaining elements to left
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }

        // Copy temp elements to end
        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }

        // Print final array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
