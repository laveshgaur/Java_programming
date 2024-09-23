import java.util.*;
class variableArguments{
    static void show(int...n){
        for(int x:n){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter five integer numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        show(a,b,c,d,e);
        show(new int[]{1,2,3,4,5,6,7});
        sc.close();
    }
}