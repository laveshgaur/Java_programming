import java.util.*;
class pattern_2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j=1;j<=(n-2);j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}