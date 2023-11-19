import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[][] rectangle = new int[3][5];
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                rectangle[i][j] = rand.nextInt(10);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(rectangle[j][i] + " ");
            }
            System.out.println();
        }
    }
}
