import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the size of matrix: ");
        int size = scanner.nextInt();

        printMatrix(size);
    }

    public static void printMatrix(int n){
        int[][] matrix = new int[n][n];
        Random random = new Random();

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = random.nextInt(2);
            }
        }

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                System.out.print(matrix[row][column]);
            }
            System.out.println();
        }
    }
}
