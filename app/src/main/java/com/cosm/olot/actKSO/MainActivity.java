package com.cosm.olot.actKSO;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;


import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.cosm.olot.R;
import com.cosm.olot.anim.Rotate3dAnimation;
import com.cosm.olot.viewKSO.ViewModKSO;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView cardd1, cardd2, cardd3, cardd4, cardd5, cardd6, cardd7, cardd8, cardd9, cardd10, cardd11, cardd12;
    ImageView ii1, ii2, ii3, ii4, ii5, ii6, ii7, ii8, ii9, ii10, ii11, ii12;
    public Button buttonStart;
    ViewModKSO viewModKSO;
    TextView textViewTime;
    ArrayList<ImageView> arrayList;
    public static int countKSO = 0;
    public TextView textViewTime2, textViewScore,textViewTime3,textViewScore2;
    public int counterClic = 0;
    public int scor = 0;
    public ImageView imageViewScT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);
        buttonStart = findViewById(R.id.buttonStart);
        initKSL();
        textViewTime2 = findViewById(R.id.textViewTime2);
        textViewScore = findViewById(R.id.textViewScore);
        imageViewScT = findViewById(R.id.imageViewScT);
        textViewTime3 = findViewById(R.id.textViewTime3);
        textViewScore2 = findViewById(R.id.textViewScore2);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scor = 0;
                textViewScore.setText("Score: " + scor);
                if (ii1.getAlpha() == 1.0f) {
                    ii1.setAlpha(0.0f);
                    ii2.setAlpha(0.0f);
                    ii3.setAlpha(0.0f);
                    ii4.setAlpha(0.0f);
                    ii5.setAlpha(0.0f);
                    ii6.setAlpha(0.0f);
                    ii7.setAlpha(0.0f);
                    ii8.setAlpha(0.0f);
                    ii9.setAlpha(0.0f);
                    ii10.setAlpha(0.0f);
                    ii11.setAlpha(0.0f);
                    ii12.setAlpha(0.0f);
                }
                aaarr();
                viewModKSO.randCart(ii1, ii2, ii3, ii4, ii5, ii6, ii7, ii8, ii9, ii10, ii11, ii12);
                rotateClick(cardd1, ii1);
                rotateClick(cardd2, ii2);
                rotateClick(cardd3, ii3);
                rotateClick(cardd4, ii4);
                rotateClick(cardd5, ii5);
                rotateClick(cardd6, ii6);
                rotateClick(cardd7, ii7);
                rotateClick(cardd8, ii8);
                rotateClick(cardd9, ii9);
                rotateClick(cardd10, ii10);
                rotateClick(cardd11, ii11);
                rotateClick(cardd12, ii12);
                viewModKSO.timerKSO(textViewTime);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        inrotateClick(cardd1, ii1);
                        inrotateClick(cardd2, ii2);
                        inrotateClick(cardd3, ii3);
                        inrotateClick(cardd4, ii4);
                        inrotateClick(cardd5, ii5);
                        inrotateClick(cardd6, ii6);
                        inrotateClick(cardd7, ii7);
                        inrotateClick(cardd8, ii8);
                        inrotateClick(cardd9, ii9);
                        inrotateClick(cardd10, ii10);
                        inrotateClick(cardd11, ii11);
                        inrotateClick(cardd12, ii12);
                        clickKSL();
                        buttonStart.setVisibility(View.INVISIBLE);
                        textViewScore.setVisibility(View.VISIBLE);
                        textViewTime2.setVisibility(View.VISIBLE);
                        viewModKSO.timeGameKSO(textViewTime2);
                    }
                }, 3000);


            }
        });


    }


    public void aaarr() {
        arrayList = new ArrayList<>();
    }

    public void rotateClick(ImageView cart, ImageView ii) {

        Rotate3dAnimation skew = new Rotate3dAnimation(0, 0, 180, 0, 0, 0);
        skew.setDuration(1000);
        skew.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ii.setAlpha(1.0f);
                    }
                }, 500);

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                if (arrayList.size() == 4) {
                    viewModKSO.comparisonKSO(arrayList, MainActivity.this);
                }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        cart.startAnimation(skew);
        ii.startAnimation(skew);
    }


    public void inrotateClick(ImageView cart, ImageView ii) {
        Rotate3dAnimation skew = new Rotate3dAnimation(0, 0, 0, 180, 0, 0);
        skew.setDuration(1000);
        skew.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ii.setAlpha(0.0f);
                    }
                }, 500);

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        cart.startAnimation(skew);
        ii.startAnimation(skew);
    }


    public void initKSL() {
        textViewTime = findViewById(R.id.textViewTime);
        viewModKSO = new ViewModelProvider.AndroidViewModelFactory(getApplication()).create(ViewModKSO.class);
        cardd1 = findViewById(R.id.cardd1);
        cardd2 = findViewById(R.id.cardd2);
        cardd3 = findViewById(R.id.cardd3);
        cardd4 = findViewById(R.id.cardd4);
        cardd5 = findViewById(R.id.cardd5);
        cardd6 = findViewById(R.id.cardd6);
        cardd7 = findViewById(R.id.cardd7);
        cardd8 = findViewById(R.id.cardd8);
        cardd9 = findViewById(R.id.cardd9);
        cardd10 = findViewById(R.id.cardd10);
        cardd11 = findViewById(R.id.cardd11);
        cardd12 = findViewById(R.id.cardd12);


        ii1 = findViewById(R.id.ii1);
        ii2 = findViewById(R.id.ii2);
        ii3 = findViewById(R.id.ii3);
        ii4 = findViewById(R.id.ii4);
        ii5 = findViewById(R.id.ii5);
        ii6 = findViewById(R.id.ii6);
        ii7 = findViewById(R.id.ii7);
        ii8 = findViewById(R.id.ii8);
        ii9 = findViewById(R.id.ii9);
        ii10 = findViewById(R.id.ii10);
        ii11 = findViewById(R.id.ii11);
        ii12 = findViewById(R.id.ii12);
    }

    public void clickKSL() {
        cardd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateClick(cardd1, ii1);
                arrayList.add(ii1);
                arrayList.add(cardd1);
            }
        });


        cardd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateClick(cardd2, ii2);
                arrayList.add(ii2);
                arrayList.add(cardd2);
            }
        });

        cardd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateClick(cardd3, ii3);
                arrayList.add(ii3);
                arrayList.add(cardd3);
            }
        });

        cardd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateClick(cardd4, ii4);
                arrayList.add(ii4);
                arrayList.add(cardd4);
            }
        });

        cardd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateClick(cardd5, ii5);
                arrayList.add(ii5);
                arrayList.add(cardd5);
            }
        });

        cardd6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateClick(cardd6, ii6);
                arrayList.add(ii6);
                arrayList.add(cardd6);
            }
        });

        cardd7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateClick(cardd7, ii7);
                arrayList.add(ii7);
                arrayList.add(cardd7);
            }
        });

        cardd8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateClick(cardd8, ii8);
                arrayList.add(ii8);
                arrayList.add(cardd8);
            }
        });

        cardd9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateClick(cardd9, ii9);
                arrayList.add(ii9);
                arrayList.add(cardd9);
            }
        });

        cardd10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateClick(cardd10, ii10);
                arrayList.add(ii10);
                arrayList.add(cardd10);
            }
        });

        cardd11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateClick(cardd11, ii11);
                arrayList.add(ii11);
                arrayList.add(cardd11);
            }
        });

        cardd12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateClick(cardd12, ii12);
                arrayList.add(ii12);
                arrayList.add(cardd12);
            }
        });
    }

}