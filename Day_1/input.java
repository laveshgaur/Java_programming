import java.util.*;
class input{
    public static void main(String args[]){
        System.out.print("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();//It will take only string which is before a whitespace
        System.out.println(name);
        System.out.print("Enter your name please : ");
        Scanner sc1 = new Scanner(System.in);
        String name1 = sc1.nextLine();
        //nextInt() for integer 
        //nextFloat() for float
        System.out.println(name1);
        System.out.print("Enter a number : ");
        Scanner add = new Scanner(System.in);
        int a = add.nextInt(); 
        System.out.print("Enter b number : ");
        int b = add.nextInt();
        System.out.println(a+b);

    }
}