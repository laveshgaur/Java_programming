import java.util.*;
class maxElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int x:arr){
            if(x>max)
            max=x;
        }
        System.out.println("Maximum value of element in array is : "+max);
    }
}