import java.util.*;
class GCDMethod{
    static int GCD(int x,int y){
        while(x!=y){
            if(x>y)
                x-=y;
            else
                y-=x;
        }
        return x;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Greatest common divisor is : "+GCD(x,y));
    }
}