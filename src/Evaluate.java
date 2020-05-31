/** %java Evaluate.java < input.txt
 *
 Rezultat = 101.0

 */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

public class Evaluate {

    public static void main(String[] args) {
        Stack<Double> value = new Stack<>();
        Stack<String> ops = new Stack<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("("))           ;
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                if (op.equals("+")) value.push(value.pop() + value.pop());
                else if (op.equals("*")) value.push(value.pop() * value.pop());
            }
            else value.push(Double.parseDouble(s));
        }
        StdOut.println("Rezultat = " +value.pop());
    }
}
