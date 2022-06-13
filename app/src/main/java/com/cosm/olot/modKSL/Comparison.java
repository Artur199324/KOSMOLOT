package com.cosm.olot.modKSL;

import static com.cosm.olot.actKSO.MainActivity.countKSO;
import static com.cosm.olot.actKSO.MainActivity.fff;
import static com.cosm.olot.modKSL.TImeKSO.time2;
import static com.cosm.olot.modKSL.TImeKSO.ttt;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.cosm.olot.actKSO.MainActivity;

import java.util.ArrayList;

public class Comparison {



    private int a = 200;
    private int b = 150;
    private int c = 100;
    private int d = 50;


    public void comparison(ArrayList<ImageView> arrayList, MainActivity mainActivity){


        if (arrayList.get(0).getTag() == arrayList.get(2).getTag()){
            for (int i =0;i<arrayList.size();i++){
                arrayList.get(i).setClickable(false);
                fff = 0;
            }
            countKSO++;
            if (countKSO ==6){
                mainActivity.buttonStart.setVisibility(View.VISIBLE);
                mainActivity. button4.setVisibility(View.VISIBLE);
                mainActivity.textViewScore.setVisibility(View.INVISIBLE);
                mainActivity.textViewTime2.setVisibility(View.INVISIBLE);


                mainActivity.textViewScore2.setText("Score: " +  mainActivity.scor);
                mainActivity.textViewTime3.setText("Time: "+ttt);
                mainActivity.imageViewScT.setVisibility(View.VISIBLE);
                mainActivity.textViewScore2.setVisibility(View.VISIBLE);
                mainActivity.textViewTime3.setVisibility(View.VISIBLE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mainActivity.imageViewScT.setVisibility(View.INVISIBLE);
                        mainActivity.textViewTime3.setVisibility(View.INVISIBLE);
                        mainActivity.textViewScore2.setVisibility(View.INVISIBLE);
                        mainActivity.textViewTime3.setVisibility(View.INVISIBLE);
                        mainActivity.counterClic = 0;
                        mainActivity.scoreAll += mainActivity.scor;
                        mainActivity.textView6.setText("Score : " + mainActivity.scoreAll);
                        mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("dddddd", mainActivity.scoreAll).apply();
                        ttt = 0;
                    }
                },3000);
            }

            if (mainActivity.counterClic <= 3){
                mainActivity.scor +=a;
                mainActivity.textViewScore.setText("Score: " +  mainActivity.scor);

            }else if (mainActivity.counterClic == 4){

                mainActivity.scor +=b;
                mainActivity.textViewScore.setText("Score: " +  mainActivity.scor);
            }else if (mainActivity.counterClic >= 5 && mainActivity.counterClic < 8){
                mainActivity.scor +=c;
                mainActivity.textViewScore.setText("Score: " +  mainActivity.scor);

            }else if (mainActivity.counterClic >= 8){

                mainActivity.scor +=d;
                mainActivity.textViewScore.setText("Score: " + mainActivity.scor);
            }

        }else {
            mainActivity.counterClic ++;
            mainActivity.inrotateClick(arrayList.get(1),arrayList.get(0));
            mainActivity.inrotateClick(arrayList.get(3),arrayList.get(2));


        }
        mainActivity.aaarr();



    }
}
