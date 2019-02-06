package com.samad.talukder.lovecalculatorapp;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ShowAlertDialog {

    @SuppressLint("SetTextI18n")
    public void showDialog(final Context context, final String yourName, final String yourLoverName, final int loveScore, String loveTips) {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.show_result);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        TextView showCoupleNameTV = dialog.findViewById(R.id.showCoupleNameTV);
        showCoupleNameTV.setText("Love compatibility between " + yourName.toUpperCase() + " & " + yourLoverName.toUpperCase() + " is ");
        TextView showLovePercentTV = dialog.findViewById(R.id.showLovePercentTV);
        showLovePercentTV.setText(loveScore + " %");
        TextView showTipsTV = dialog.findViewById(R.id.showTipsTV);

        showTipsTV.setText("That a relationship between " + yourName.toUpperCase() + " & " + yourLoverName.toUpperCase() + " , " + loveTips);
        ProgressBar progressBar = dialog.findViewById(R.id.progressBar);
        progressBar.setProgress(loveScore);

        Button dialogOkBtn = dialog.findViewById(R.id.okBtn);
        dialogOkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        Button dialogShareBtn = dialog.findViewById(R.id.shareBtn);
        dialogShareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Love Calculator App");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Love compatibility between " + yourName.toUpperCase() + " & " + yourLoverName.toUpperCase() + " is " + loveScore + "%" + "\n" + "Powered By: Samad Talukder ");
                shareIntent.setType("text/plain");
                context.startActivity(Intent.createChooser(shareIntent, "Share app via"));
            }
        });

        dialog.show();
    }
}
