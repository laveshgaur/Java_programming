import java.util.*;
class eligibility{
    public static void main(String args[]){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        age = sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible");
        }
        else{
            System.out.println("Sorry you are not eligible");
        }
    }
}