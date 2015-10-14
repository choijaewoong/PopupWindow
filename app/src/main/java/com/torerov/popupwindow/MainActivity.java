package com.torerov.popupwindow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPopupWindow(View view){
        MyPopupWindow popup = new MyPopupWindow(this);
        popup.setOutsideTouchable(true);
        popup.showAsDropDown(view);
    }
}
