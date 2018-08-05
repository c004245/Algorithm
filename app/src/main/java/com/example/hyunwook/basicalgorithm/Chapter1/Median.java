package com.example.hyunwook.basicalgorithm.Chapter1;

import android.util.Log;

/**
 * median값 구하기
 */
public class Median {

    static final String TAG = Median.class.getSimpleName();
    int a = -100;
    int b = 6;
    int c = -6;

    int median;

    public Median() {
        check(a, b, c);

        Log.d(TAG, "median -->" + median);

        JudgeSign judgeSign = new JudgeSign();

    }

    public int check(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (a > b) {
            //a가 b보다는  크다
            if (a > c) {
                //a가 제일 크다.

                if (b > c) {
                    median = b;
                } else {
                    median = c;
                }
            } else {
                //c가 제일크다
                median = a;
            }
        } else if (b > c) {

            //b가 제일크다
            if (a > c) {
                median = a;
            } else {
                median = c;
            }
        } else {
            //c가 제일크다
            if (a > b) {
                median = a;
            } else {
                median = b;
            }
        }

        return median;
    }
}
