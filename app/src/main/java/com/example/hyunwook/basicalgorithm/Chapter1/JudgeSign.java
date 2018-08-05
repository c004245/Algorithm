package com.example.hyunwook.basicalgorithm.Chapter1;

import android.util.Log;

public class JudgeSign {

    int a = -5;
    int b = 0;
    int c = -5;

    static final String TAG = JudgeSign.class.getSimpleName();

    public JudgeSign() {

        if (a > 0) {
            Log.d(TAG, "a의 값은 양수입니다.");
        } else if (a == 0) {
            Log.d(TAG, "a의 값은 0입니다");
        } else {
            Log.d(TAG, "a의 값은 음수입니다.");
        }
    }
}
