package com.acehouhao;

/**
 * @author houhao
 */
public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        while (!StdIn.isEmpty()) {
            stack.push(StdIn.readInt());
        }

        for (int i : stack) {
            StdOut.println(i);
        }
    }
}
