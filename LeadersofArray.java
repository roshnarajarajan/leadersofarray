import java.util.*;
import java.io.*;
public class LeadersofArray {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
}
