package com.jufajardini.sorteiosdabela.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.jufajardini.sorteiosdabela.R;
import com.jufajardini.sorteiosdabela.data.SecurityPreferences;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();
    private SecurityPreferences mSecurityPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mSecurityPreferences = new SecurityPreferences(this);

        this.mViewHolder.rangeStart = findViewById(R.id.range_start);
        this.mViewHolder.rangeEnd = findViewById(R.id.range_end);
        this.mViewHolder.buttonDraw = findViewById(R.id.button_draw);


        // listening for button clicks
        this.mViewHolder.buttonDraw.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button_draw) {
            Intent intent = new Intent(this, DrawActivity.class);
            startActivity(intent);
        }
    }

    private static class ViewHolder {

        // I'm still figuring this out...
        TextView rangeStart;
        TextView rangeEnd;
        RadioButton radioButton;
        Button buttonDraw;
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_no:
                if (checked)
                    // write the logic to prevent already chosen numbers to show up again
                    break;
            case R.id.radio_yes:
                if (checked)
                    // write the logic to allow already chosen numbers to show up again
                    break;
        }
    }
}