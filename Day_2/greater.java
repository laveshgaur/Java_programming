import java.util.*;
class greater{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a : ");
        int a,b;
        a = sc.nextInt();
        System.out.print("Enter number b : ");
        b = sc.nextInt();
        if(a==b){
            System.out.println("Both are equal");
        }
        else if (a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
}