import java.util.*;
class pattern_8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count++);
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}