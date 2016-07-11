import java.io.*;
import java.util.*;
/**
 * Created by pakhan on 12/07/16.
 */
public class ReversePolish {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        int testCases = Integer.parseInt(br.readLine());

        while (testCases != 0) {
            String input = br.readLine();

            String[] expression = input.split(" ");

            Stack<Integer> stack = new Stack<>();
            int first, second;
            for (int i = 0; i < expression.length; ++i) {
                switch (expression[i]) {
                    case "+":
                        first = stack.pop();
                        second = stack.pop();
                        stack.push(first + second);
                        break;
                    case "-":
                        first = stack.pop();
                        second = stack.pop();
                        stack.push(first - second);
                        break;
                    case "*":
                        first = stack.pop();
                        second = stack.pop();
                        stack.push(first * second);
                        break;
                    case "/":
                        first = stack.pop();
                        second = stack.pop();
                        stack.push(second / first);
                        break;
                    default:
                        stack.push(Integer.parseInt(expression[i]));
                }
            }
            int result = stack.pop();
            bw.write(result + "\n");

            --testCases;
        }
        bw.close();
        br.close();
    }
}
