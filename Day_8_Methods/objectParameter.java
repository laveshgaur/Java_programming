import java.util.*;
class objectParameter{
    static void update(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]++;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        update(arr);
        System.out.print("Updated array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}