import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите текст для шифрования: ");
        String text = input.nextLine();

        System.out.println("введите ключ");
        int key = input.nextInt();

        String encryptStr = Caesar.encrypt(text, key);
        System.out.println("текст после преобразования: " + encryptStr);
        System.out.println("выполнить обратное преобразование? (y/n)");
        boolean answer = false;

        while (!answer) {
            String reply = input.next();

            if (reply.toLowerCase().equals("y")) {
                String decryptedText = Caesar.decrypt(encryptStr, key);
                System.out.println(decryptedText);
                answer = true;
            }
            else if (reply.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                answer = true;
            }
            else {
                System.out.println("Введите корректный ответ: ");
            }
        }
    }

    private static class Caesar {
        static String encryptText;

        private static String encrypt(String enText, int key) {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] + key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);

            return encryptText;
        }

        private static  String decrypt(String enText, int key) {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] - key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);

            return encryptText;
        }

    }
}


