import java.util.*;
class pattern_13{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter line number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n*2)-(i*2);j++){
                System.out.print(" ");
            }
            for(int j=i;j>1;j--){
                System.out.print(j+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}