import java.util.*;
class do_while_loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);/*it will do the work first then check the condition
it means it will work at least one time either the condition is true or not.*/
        sc.close();
    }
}