import java.util.*;
class rectangle{
    int l,b;
    int area(){
        return l*b;
    }
    int perimeter(){
        return 2*(l+b);
    }
}
class rectangleClass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        rectangle r = new rectangle();
        r.l=l;
        r.b=b;
        System.out.println("Area of rectangle is : "+r.area());
        System.out.println("Perimeter is : "+r.perimeter());
    }
    
}