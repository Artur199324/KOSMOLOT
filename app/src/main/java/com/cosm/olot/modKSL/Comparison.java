package com.cosm.olot.modKSL;

import static com.cosm.olot.actKSO.MainActivity.countKSO;
import static com.cosm.olot.modKSL.TImeKSO.time2;

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
            }
            countKSO++;
            if (countKSO ==6){
                mainActivity.buttonStart.setVisibility(View.VISIBLE);
                mainActivity.textViewScore.setVisibility(View.INVISIBLE);
                mainActivity.textViewTime2.setVisibility(View.INVISIBLE);
                countKSO = 0;

                mainActivity.textViewScore2.setText("Score: " +  mainActivity.scor);
                mainActivity.imageViewScT.setVisibility(View.VISIBLE);
                mainActivity.textViewScore2.setVisibility(View.VISIBLE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mainActivity.imageViewScT.setVisibility(View.INVISIBLE);
                        mainActivity.textViewTime3.setVisibility(View.INVISIBLE);
                        mainActivity.textViewScore2.setVisibility(View.INVISIBLE);
                        mainActivity.counterClic = 0;
                    }
                },3000);
            }

            if (mainActivity.counterClic <= 3){
                mainActivity.scor +=a;
                mainActivity.textViewScore.setText("Score: " +  mainActivity.scor);
                Log.d("weq","1");
            }else if (mainActivity.counterClic == 4){
                Log.d("weq","2");
                mainActivity.scor +=b;
                mainActivity.textViewScore.setText("Score: " +  mainActivity.scor);
            }else if (mainActivity.counterClic >= 5 && mainActivity.counterClic < 8){
                mainActivity.scor +=c;
                mainActivity.textViewScore.setText("Score: " +  mainActivity.scor);
                Log.d("weq","3");
            }else if (mainActivity.counterClic >= 8){
                Log.d("weq","4");
                mainActivity.scor +=d;
                mainActivity.textViewScore.setText("Score: " + mainActivity.scor);
            }

        }else {
            mainActivity.counterClic ++;
            mainActivity.inrotateClick(arrayList.get(1),arrayList.get(0));
            mainActivity.inrotateClick(arrayList.get(3),arrayList.get(2));
            Log.d("weq",mainActivity.counterClic+"");

        }
        mainActivity.aaarr();
    }
}
