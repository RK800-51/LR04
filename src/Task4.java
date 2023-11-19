public class Task4 {
    public static void main(String[] args) {
        int[][] rectangle = new int[3][];
        rectangle[0] = new int[1];
        rectangle[1] = new int[2];
        rectangle[2] = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i+1; j++) {
                rectangle[i][j] = 0;
                System.out.print(rectangle[i][j]);
            }
            System.out.println();
        }
    }
}
