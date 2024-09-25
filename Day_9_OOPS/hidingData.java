import java.util.*;
class rectangle{
    private int length;
    private int breadth;
    public void setLength(int l){
        if(l>0)
            length = l;
        else
            length=0;
    }
    public void setBreadth(int b){
        breadth = b;
    }
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return (2*(length+breadth));
    }
}
class hidingData{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        rectangle r = new rectangle();
        r.setLength(l);
        r.setBreadth(b);
        System.out.println("Area is : "+r.area());
        System.out.println("Perimeter is : "+r.perimeter());
    }
}