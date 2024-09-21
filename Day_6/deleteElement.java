import java.util.*;
class deleteElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        System.out.print("Enter elements : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a number to remove : ");
        int value = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==value){
                for(int j=i;j<n-1;j++){
                    arr[j]=arr[j+1];
                }
                arr[n-1]=0;
                n--;
                break;
            }
            if(n-1==i){
                System.out.println("Element is not in array ");
            }
        }
        System.out.print("New array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}