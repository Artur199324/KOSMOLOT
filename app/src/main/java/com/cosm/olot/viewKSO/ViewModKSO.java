package com.cosm.olot.viewKSO;

import android.app.Application;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.cosm.olot.actKSO.MainActivity;
import com.cosm.olot.modKSL.Comparison;
import com.cosm.olot.modKSL.RandCard;
import com.cosm.olot.modKSL.TImeKSO;

import java.util.ArrayList;

public class ViewModKSO extends AndroidViewModel {
    TImeKSO tImeKSO;
    public ViewModKSO(@NonNull Application application) {
        super(application);
         tImeKSO = new TImeKSO();
    }

    public void randCart(ImageView ii1, ImageView ii2, ImageView ii3, ImageView ii4, ImageView ii5, ImageView ii6, ImageView ii7, ImageView ii8, ImageView ii9, ImageView ii10, ImageView ii11, ImageView ii12){
        RandCard randCard = new RandCard(ii1,ii2,ii3,ii4,ii5,ii6,ii7,ii8,ii9,ii10,ii11,ii12);
        randCard.randomCard();
    }

    public void timerKSO(TextView textView){
        tImeKSO.timeKSO(textView);
    }

    public void timeGameKSO(TextView textView){
        tImeKSO.timeGameKSO(textView);
    }

    public void comparisonKSO(ArrayList<ImageView> arrayList, MainActivity mainActivity){
        Comparison comparison = new Comparison();
        comparison.comparison(arrayList,mainActivity);
    }
}
