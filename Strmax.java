import java.util.Arrays;
public class Strmax {
    public static void main(String args[]){
        int num=273596;
        String str=num+"";
        char[] c=str.toCharArray();
        Arrays.sort(c);
        System.out.println(c);
        System.out.println("max "+c[c.length-1]+" ");
        System.out.println("the index "+(c.length-1)+" ");
        System.out.println("min "+c[0]+" ");
         System.out.println("the index is "+0);
    }
}
