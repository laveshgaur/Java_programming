import java.util.*;
class pattern_5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(n-i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}