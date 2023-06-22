
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        FileWriter writer = null;

        try {
            writer = new FileWriter("log.txt");

            for (int i = 0; i < n; i++) {
                boolean swapped = false;

                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }

                // Записываем текущее состояние массива в лог-файл
                writer.write("Iteration " + (i + 1) + ": ");
                for (int num : arr) {
                    writer.write(num + " ");
                }
                writer.write("\n");

                if (!swapped) {
                    break;
                }
            }

            System.out.println("Sorted array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
