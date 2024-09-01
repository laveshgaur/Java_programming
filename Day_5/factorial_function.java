import java.util.*;
class function{
    public static int factorialFuncton(int a){
        int ans = 1;
        for(int i=1;i<=a;i++){
            ans*=i;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        if(a<0){
            System.out.println("Invalid number");
        }
        else{
            int ans = factorialFuncton(a);
            System.out.println("Factorial is "+ans);
        }
    }
}
