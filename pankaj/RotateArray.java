import java.io.*;
import java.util.*;

/**
 * Created by pakhan on 11/07/16.
 */
public class RotateArray {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("input.txt"));

        BufferedWriter bw = null;

        FileWriter fileWriter = new FileWriter("output.txt");
        bw = new BufferedWriter(fileWriter);

        int testCases = scanner.nextInt();
        while (testCases != 0) {
            int arraySize = scanner.nextInt();

            int[] array = new int[arraySize];

            for (int i = 0; i < arraySize; ++i) {
                array[i] =scanner.nextInt();
            }
            int k = scanner.nextInt();

            rotateArray(array, k);
            for (int i=0; i<arraySize; ++i) {
                bw.write(array[i] + " ");
            }
            --testCases;
            bw.write("\n");
        }
        bw.close();
        scanner.close();
    }

    public static void rotateArray(int[] array, int k) {
        int size = array.length;
        if (size == 0 || k == 0) {
            return;
        }

        int smartPosition = k%size;
        reverse(array, 0, size-smartPosition-1);
        reverse(array, size-smartPosition, size-1);
        reverse(array, 0, size-1);
    }

    public static void reverse(int[] array, int start, int end) {
        while(start < end) {
            array[start] = array[start] + array[end];
            array[end] = array[start] - array[end];
            array[start] = array[start] - array[end];
            ++start;
            --end;
        }
    }

}
