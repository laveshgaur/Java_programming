import java.util.*;
class twoDarray1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns of array : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.print("Enter elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your array is ");
        for(int x[]:arr){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}