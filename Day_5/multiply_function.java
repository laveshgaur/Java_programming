import java.util.*;
class functon{
    public static int multiplyFuncton(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int ans = multiplyFuncton(a, b);
        System.out.println("Multiply is "+ans);
        sc.close();
    }
}
