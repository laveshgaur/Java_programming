import java.util.*;
class secondLargest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int large=0;
        int secondLarge=0;
        for(int x:arr){
            if(x>large){
                secondLarge=large;
                large=x;
            }
        }
        System.out.println("Second largest element is : "+secondLarge);
    }
}