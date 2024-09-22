import java.util.*;
class arrayMultiply{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and column of first array : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.print("Enter elements of first array : ");
        int[] A[],B[],C[];
        A=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter row and column of second array : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        System.out.print("Enter elements of second array : ");
        B = new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                B[i][j]=sc.nextInt();
            }
        }
        if(c1==r2){
            C=new int[r1][c2];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    int temp=0;
                    for(int k=0;k<c1;k++){
                        temp+=A[i][k]*B[k][j];
                    }
                    C[i][j]=temp;
                }
            }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(C[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Multiplication is not possible");
        }
    }
}