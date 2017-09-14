package com.acehouhao;

/**
 * @author houhao
 */
public class TestVisualAccumulator {
    public static void main(String[] args) {
//        int T = Integer.parseInt(args[0]);
        int T = 2000;
        VisualAccumulator a = new VisualAccumulator(T, 1.0);
        for (int t = 0; t < T; t++) {
            a.addDataValue(StdRandom.random());
        }
        StdOut.println(a);
    }
}
