package com.acehouhao;

/**
 * @author houhao
 */
public class TestAccumulator {
    public static void main(String[] args) {
//        int T = Integer.parseInt(args[0]);
        int T = 1000;
        Accumulator a = new Accumulator();
        for (int t = 0; t < T; t++) {
            a.addDataValue(StdRandom.random());
        }
        StdOut.println(a);
    }
}
