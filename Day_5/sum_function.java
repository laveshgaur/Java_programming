import java.util.*;
class functon{
    public static void sumfuncton(int a, int b){
        System.out.println("Sum is "+(a+b));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        sumfuncton(a, b);
    }
}
