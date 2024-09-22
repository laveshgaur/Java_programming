import java.util.*;
class primeNumberMethod{
    static int prime(int x){
        int count=0;
        for(int i=2;i<=x/2;i++){
            if (x%i==0){
                count++;
            }
        }
        if(count==0){
            return 1;
        }
        else{
            return -1;
        }
    }
    public static void main(String args[]){
        System.out.print("Prime number checker\nEnter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = prime(n);
        if(ans==1){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}