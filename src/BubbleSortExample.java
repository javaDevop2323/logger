import java.util.Arrays;
import java.util.logging.Logger;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] massive = new int[]{1, 34, 34, 42, 12, 334, 3, 5, 2343, 53, 353, 234, 255, 2, 2, 0, 34};
        for (int i = 0; i < massive.length-1; i++) {
            for (int j = 0; j < massive.length-1; j++) {
                System.out.print(massive[j]+" ");
            }


        }
        // Метод пузырьковой сортировки
        for (int i = 0; i < massive.length - 1; i++) {
            for (int j = 0; j < massive.length - 1 - i; j++) {
                if (massive[j] > massive[j + 1]) {
                    // Обмен элементов
                    int temp = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = temp;
                }
            }
        }

        // Вывод отсортированного массива
        for (int i = 0; i < massive.length; i++) {
//            System.out.print(massive[i] + " ");
        }


    }
}





