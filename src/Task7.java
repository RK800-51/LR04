import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("введите количество строк массива: ");
        int a =id.nextInt();
        System.out.print("введите количество столбцов массива: ");
        int b = id.nextInt();
        int[][] ArrayZmeyka = new int[a][b];
        // переменная для подсчета длины строки для заполнения справа налево
        int hvost = 0;
        // переменная для значений массива
        int telo = 0;
        // переменная для подсчета строк
        int h = 0;
        // заполнение верхней строки массива слева-направо
        for (int i = 0; h < ArrayZmeyka.length ; h++) {
            for (int j = 0; j <(ArrayZmeyka[i].length - hvost); j++) {
                ArrayZmeyka[i][j] = telo;
                telo++;
            }
            if(i< ArrayZmeyka.length-1) {
                i++;}
            // заполнение правого столбца массива снизу-вверх
            for (int o=a-1; o > hvost; o--) {
                ArrayZmeyka[o][ArrayZmeyka[i].length-1-hvost] = telo;
                telo++;
            }
            hvost++;
        }
        for (int i = 0; i < ArrayZmeyka.length; i++){
            for (int j = 0; j < ArrayZmeyka[i].length; j++){
                System.out.print(ArrayZmeyka[i][j]+" ");
            }
            System.out.println();

        }
    }
}
