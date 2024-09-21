import java.util.*;
class arr1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Now elements are : ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("Enter the elements ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Now elements are : ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nIt means default elements are 0");
    }
}