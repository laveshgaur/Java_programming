import java.util.*;
class elementSearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter element for search : ");
        int value = sc.nextInt();
        for(int i=0;i<n;i++){
            if (arr[i]==value){
                System.out.println("Element found at index "+i);
                break;
            }
            if (i==n-1){
                System.out.println("Element not found");
            }
        }
    }
}