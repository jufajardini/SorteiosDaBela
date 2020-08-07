package com.jufajardini.sorteiosdabela.view;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.jufajardini.sorteiosdabela.R;
import com.jufajardini.sorteiosdabela.data.SecurityPreferences;

public class DrawActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewHolder mViewHolder = new ViewHolder();
    private SecurityPreferences mSecurityPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);
    }

    @Override
    public void onClick(View view) {

    }

    private static class ViewHolder {
        //which views will I have to access?
    }
}
