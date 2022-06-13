package com.cosm.olot.modKSL;

import static com.cosm.olot.actKSO.MainActivity.countKSO;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.cosm.olot.actKSO.MainActivity;

public class TImeKSO {
    int time = 4;
    public static int time2 = 0;
    public void timeKSO(TextView textView){
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                textView.setVisibility(View.VISIBLE);
                time --;
                textView.setText(""+time);
                if (time !=0){
                    handler.postDelayed(this::run,1000);
                }else {
                    time = 3;
                    textView.setVisibility(View.INVISIBLE);
                }
            }
        });

    }

    public void timeGameKSO(TextView textView){
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                time2++;
                textView.setText("Time: "+time2);
                if (countKSO !=5){
                    handler.postDelayed(this::run,1000);
                }else {
                    time2 = 0;
                    textView.setText("Time: "+time2);
                }
            }
        });
    }
}
