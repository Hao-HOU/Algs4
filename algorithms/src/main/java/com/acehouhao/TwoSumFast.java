package com.acehouhao;

import java.util.Arrays;

/**
 * @author houhao
 */
public class TwoSumFast {
    public static int count(int[] a) {
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (BinarySearch.rank(-a[i], a) > i) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        In in = new In("8Kints.txt");
        int[] a = in.readAllInts();
        StdOut.println(count(a));
    }
}
