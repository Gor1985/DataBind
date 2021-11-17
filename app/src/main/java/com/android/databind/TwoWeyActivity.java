package com.android.databind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.android.databind.databinding.ActivityTwoWeyBinding;



public class TwoWeyActivity extends AppCompatActivity {
 private ActivityTwoWeyBinding activityTwoWeyBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_two_wey);
        activityTwoWeyBinding= DataBindingUtil.setContentView (this,R.layout.activity_two_wey);
        activityTwoWeyBinding.setGreting (getCurrent ());
    }
    private Greeting getCurrent(){
        return new Greeting ( "John","Hallo" );
    }
}