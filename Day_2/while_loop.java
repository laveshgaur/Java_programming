import java.util.*;
class while_loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}