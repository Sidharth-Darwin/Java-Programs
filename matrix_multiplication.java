import java.util.Scanner;
public class Matrix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r1,c1,r2,c2;
        System.out.print("Enter the no of rows of matrix 1: ");
        r1 = sc.nextInt();
        System.out.print("Enter the no of columns of matrix 1: ");
        c1 = sc.nextInt();
        int matrix1[][] = new int[r1][c1];
        System.out.println("Enter the elements of matrix1: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(matrix1[i][j]);
                System.out.print("  ");
            }
            System.out.println("");
        }
        System.out.print("Enter the no of rows of matrix 2: ");
        r2 = sc.nextInt();
        System.out.print("Enter the no of columns of matrix 2: ");
        c2 = sc.nextInt();
        int matrix2[][] = new int[r2][c2];
        System.out.println("Enter the elements of matrix2: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.print(matrix2[i][j]);
                System.out.print("  ");
            }
            System.out.println("");
        }
        if(c1==r2){
            System.out.println("Multiplication is possible\n");
            int matrix3[][] = new int[r1][c2];
            for(int i=0; i<r1; i++){
                for(int j=0; j<c2; j++){
                    for(int k=0; k<c1; k++){
                        matrix3[i][j] = matrix3[i][j] + matrix1[i][k] * matrix2[k][j];
                    }   
                }   
            }  
            System.out.println("The answer is: "); 
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(matrix3[i][j]);
                    System.out.print("  ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("Multiplication aint possible\n");
        }
    }
}
