import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col;

        do {
            System.out.println("Enter row: ");
            row = input.nextInt();
            System.out.println("Enter colum: ");
            col = input.nextInt();
            if (row != col)
                System.out.println("Row not equal column!");
        } while (row != col);

        int[][] matrix = new int[row][col];
        for (row = 0; row < matrix.length; row++) {
            for (col = 0; col < matrix[row].length; col++) {
                System.out.println("Element (" + row + " , " + col + ")");
                matrix[row][col] = input.nextInt();
            }
        }
        int sum = 0;
        for (row = 0; row < matrix.length; row++) {
            for (col = 0; col < matrix[row].length; col++) {
                if (row == col)
                    sum += matrix[row][col];
            }
        }
        System.out.println("Matrix: ");
        for (row = 0; row < matrix.length; row++) {
            for (col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum diagonal line: " + sum);
    }
}
