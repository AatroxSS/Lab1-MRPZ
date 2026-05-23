import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Розробник: [Бойко Арсеній]");
        System.out.println("----------------------------------");


        int rows = 3;
        int cols = 2;
        int[][] A = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Матриця A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        int maxSum = Integer.MIN_VALUE;
        int maxRowIndex = -1;

        for (int i = 0; i < rows; i++) {
            int currentSum = 0;
            for (int j = 0; j < cols; j++) {
                currentSum += A[i][j];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxRowIndex = i;
            }
        }

        int[] B = new int[cols];
        for (int j = 0; j < cols; j++) {
            B[j] = A[maxRowIndex][j];
        }

        System.out.println("\nМасив B (рядок з максимальною сумою, яка дорівнює " + maxSum + "):");
        for (int j = 0; j < cols; j++) {
            System.out.print(B[j] + "\t");
        }
        System.out.println();
    }
}
