package com.samad.talukder.lovecalculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText yourName, yourLoverName;
    private ShowAlertDialog mShowAlertDialog = new ShowAlertDialog();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yourName = findViewById(R.id.yourNameET);
        yourLoverName = findViewById(R.id.yourLoverNameET);
        Button calculate = findViewById(R.id.calculateBtn);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String yourNameStr = yourName.getText().toString();
                String yourLoverNameStr = yourLoverName.getText().toString();
                int loveScore = LoveCalculator.loveCalculation(yourNameStr, yourLoverNameStr) % 100;
                if ((yourNameStr.isEmpty() || yourNameStr.length() < 2) || (yourLoverNameStr.isEmpty() || yourLoverNameStr.length() < 2) || (yourNameStr.equals(yourLoverNameStr))) {
                    Toast.makeText(MainActivity.this, "Enter Your Name & Your Lover Name", Toast.LENGTH_SHORT).show();
                    yourName.setText("");
                    yourLoverName.setText("");
                } else {
                    if (loveScore >= 90 && loveScore <= 100) {
                        mShowAlertDialog.showDialog(MainActivity.this, yourNameStr, yourLoverNameStr, loveScore, getResources().getString(R.string.tips100));
                    } else if (loveScore >= 70 && loveScore <= 90) {
                        mShowAlertDialog.showDialog(MainActivity.this, yourNameStr, yourLoverNameStr, loveScore, getResources().getString(R.string.tips70_90));
                    } else if (loveScore >= 50 && loveScore <= 70) {
                        mShowAlertDialog.showDialog(MainActivity.this, yourNameStr, yourLoverNameStr, loveScore, getResources().getString(R.string.tips50_70));
                    } else if (loveScore >= 30 && loveScore <= 50) {
                        mShowAlertDialog.showDialog(MainActivity.this, yourNameStr, yourLoverNameStr, loveScore, getResources().getString(R.string.tips30_50));
                    } else if (loveScore >= 10 && loveScore <= 30) {
                        mShowAlertDialog.showDialog(MainActivity.this, yourNameStr, yourLoverNameStr, loveScore, getResources().getString(R.string.tips10_30));
                    }

                }

            }
        });
    }
}
