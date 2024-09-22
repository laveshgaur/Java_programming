import java.util.*;
class overloadingArea{
    static float area(float x,float y){
        return x*y;
    }
    static double area(double x){
        return Math.PI*x*x;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of sides of rectangle : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.print("Enter radius of circle : ");
        double r = sc.nextDouble();
        System.out.println("Area of rectangle is "+area(a,b));
        System.out.println("Area of circle is "+area(r));        
    }
}