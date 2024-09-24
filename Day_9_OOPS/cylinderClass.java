import java.util.*;
class cylinder{
    double r,h;
    double volume(){
        return Math.PI*r*r*h;
    }
    double surfaceArea(){
        return 2*Math.PI*r*h;
    }
}
class cylinderClass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height of cylinder : ");
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        cylinder c = new cylinder();
        c.r=r;
        c.h=h;
        System.out.println("Surface area of cylinder is : "+c.surfaceArea());
        System.out.println("Volume of cylinder is : "+c.volume());
;    }
}