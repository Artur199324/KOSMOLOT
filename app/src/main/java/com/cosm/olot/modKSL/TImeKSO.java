package com.cosm.olot.modKSL;

import static com.cosm.olot.actKSO.MainActivity.countKSO;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.cosm.olot.actKSO.MainActivity;

public class TImeKSO {
    public static  int time = 11;
    public static int time2 = 0;
    public static int ttt=0;
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
                    time = 11;
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
                Log.d("rrrr",countKSO +"");
                textView.setText("Time: "+time2);
                ttt = time2;
                if (countKSO !=6){
                    handler.postDelayed(this::run,1000);
                }else {

                    textView.setText("Time: "+time2);
                }
            }
        });
    }
}
