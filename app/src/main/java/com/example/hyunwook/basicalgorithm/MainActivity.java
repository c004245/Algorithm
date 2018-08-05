package com.example.hyunwook.basicalgorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    int a = 3;
    int b = 7;
    int c = 5;

    int d = 100, e = -100, f = 70;

    int g = 9, h = -1, i = 100, j =9000;
    int max;

    int max2;

    int max4;

    int aa = 5, bb = 3, cc = -7;
    int min3;

    int dd = 100, ee = 98, ff = -17, gg= 3;
    int min4;

    static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

  /*      Scanner stdIn = new Scanner(System.in);
        stdIn.nextInt();*/
        max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        Log.d(TAG, "가장 큰 값 --> " +  max);

        max3(d, e, f);
        Log.d(TAG, "큰 값 2 - >" + max2);


        max4(g, h, i ,j );
        Log.d(TAG, "4개중 가장 큰 값 " + max4);


        min3(aa, bb, cc);
        Log.d(TAG, "3개중 가장 작은 값 " + min3);

        min4(dd, ff, ee, gg);
        Log.d(TAG, "4개중 가장 작은 값" + min4);
    }

    public int max3(int d, int e, int f) {
        this.d = d;
        this.e = e;
        this.f = f;

        max2 = d;

        if (e > max2) {
            max2 = e;
        }

        if (f > max2) {
            max2 = f;
        }


        return max2;
    }

    //4개의 최댓값 구하는
    public int max4(int g, int h, int i, int j) {


        max4 = g;

        if (h > max4) {
            max4 = h;
        }

        if (i > max4) {
            max4 = i;
        }

        if (j > max4) {
            max4 = j;
        }

        return max4;
    }

    //3개중 최소값
    public int min3(int aa, int bb, int cc) {
        min3 = aa;

        if (bb < min3) {
            min3 = bb;
        }

        if (cc < min3) {
            min3 = cc;
        }

        return min3;
    }

    //4개중 최소 값
    public int min4(int dd, int ee, int gg, int hh) {
        min4 = dd;

        if (ee < min4) {
            min4 = ee;
        }

        if (gg < min4) {
            min4 = gg;
        }

        if (hh < min4) {
            min4 = hh;
        }

        return min4;
    }
}
