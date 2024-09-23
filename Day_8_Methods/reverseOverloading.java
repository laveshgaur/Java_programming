import java.util.*;
class reverseOverloading{
    static void reverse(int a[]){
        for(int i=0;i<a.length/2;i++){
            int temp = a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
    }
    static int reverse(int n){
        int temp=0;
        for(int i=n;i>0;i/=10){
            int r = i%10;
            temp=temp*10+r;
        }
        return temp;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter length of array : ");
        int l = sc.nextInt();
        int arr[] = new int[l];
        System.out.print("Enter elements : ");
        for(int i=0;i<l;i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);

        System.out.print("Reverse array is : ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        int ans = reverse(n);
        System.out.println("Reverse number is : "+ans);
    }
}