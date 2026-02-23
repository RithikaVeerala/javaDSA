public class Movezeroestoend {
    public static void main(String args[]){
        int arr[]={1,0,2,3,2,0,0,4,5,1};
        int n=arr.length;
        int temp[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
        if(arr[i]!=0){
            temp[j]=arr[i];
            j++;
        }
        }
        for(int i=0;i<temp.length;i++){
         arr[i]=temp[i];
        }
        for(int i=temp.length;i<n;i++){
            arr[i]=0;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
