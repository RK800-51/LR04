import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner id = new Scanner(System.in);
        System.out.print("введите количество строк массива: ");
        int a = id.nextInt();
        System.out.print("введите количество столбцов массива: ");
        int b = id.nextInt();
        // первый массив
        int firstArray[][] = new int[a][b];
        for (int i = 0 ; i <a; i++) {
            for (int j = 0 ; j <b; j++) {
                firstArray[i][j] = random.nextInt(10);
                System.out.print(firstArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // генерация номеров строки и столбца для удаления
        int deleteS = random.nextInt(a-1);
        int deleteK = random.nextInt(b-1);

        System.out.println("deleteS = "+(deleteS)+"; deleteK= "+(deleteK));
        System.out.println();

        // создание второго массива на 1 строку и 1 столбец меньше первого
        int secondArray[][] = new int[a-1][b-1];
        for (int i=0, s = 0; i< a-1; s++) {
            if (s!=deleteS){
                for (int j =0, k = 0 ; j < b-1; k++) {
                    if (k != deleteK) {
                        secondArray[i][j] = firstArray[s][k];
                        System.out.print(secondArray[i][j] + " ");
                        j++;
                    }
                }
                System.out.println();
                i++;
            }
        }
    }
}