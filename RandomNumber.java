package com.example.viewmodel;

import androidx.lifecycle.ViewModel;

import java.util.Random;

public class RandomNumber extends ViewModel {

    private String myRandomNumber;


    public String getNumber(){
        if(myRandomNumber == null){
            CreateNumber();
        }
        return myRandomNumber;
    }

    public void CreateNumber(){
        Random random = new Random();
        myRandomNumber = "Number : " + (random.nextInt(10-1)+1);
    }

    @Override
    protected void onCleared(){
        super.onCleared();
    }
}
