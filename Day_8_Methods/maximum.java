import java.util.*;
class maximum{
    static int max(int x,int y){
        return x>y?x:y;
    }
    public static void main(String args[]){
        System.out.print("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(max(a,b)+" is maximum");
    }
}