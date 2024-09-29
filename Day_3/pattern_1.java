import java.util.*;
class pattern_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int m = sc.nextInt();
        for(int rows=1;rows<=n;rows++){
            for(int columns=1;columns<=m;columns++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}