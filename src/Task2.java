public class Task2 {
    public static void main(String[] args) {
        int i, j, height = 10;
        for (i = 1; i <= height; i++) {
            for (j = height - i; j > 0; j--) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

}
