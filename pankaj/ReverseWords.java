import java.io.*;

/**
 * Created by pakhan on 12/07/16.
 */
public class ReverseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("input.txt"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        int testCases = Integer.parseInt(bf.readLine());
        while (testCases != 0) {

            char[] words = bf.readLine().toCharArray();

            int start = 0;
            for (int i = 0; i < words.length; ++i) {
                if (words[i] == ' ') {
                    reverseWords(words, start, i - 1);
                    start = i + 1;
                }
            }
            reverseWords(words, start, words.length - 1);
            reverseWords(words, 0, words.length - 1);
            System.out.println(String.valueOf(words));
            bw.write(String.valueOf(words));
            bw.write("\n");
            --testCases;
        }
        bw.close();
        bf.close();
    }

    public static void reverseWords(char[] words, int start, int end) {
        while (start < end) {
            char temp  = words[end];
            words[end] = words[start];
            words[start] = temp;
            ++start;
            --end;
         }
    }
}
