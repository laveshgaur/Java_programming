import java.util.*;
class leftRotateArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        System.out.print("Enter elements : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        System.out.print("After left rotation elements are : ");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}