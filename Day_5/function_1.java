import java.util.*;
class function{
    public static void printMyName(String name){
        System.out.println(name);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.next();
        printMyName(name);
    }
}