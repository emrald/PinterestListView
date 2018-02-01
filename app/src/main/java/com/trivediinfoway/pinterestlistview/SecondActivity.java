package com.trivediinfoway.pinterestlistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by TI A1 on 26-10-2017.
 */
public class SecondActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("First Stack Activity ");
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getParent(), ThirdActivity.class);
                ActivityStack activityStack = (ActivityStack) getParent();
                activityStack.push("ThirdActivity", intent);
            }
        });

        setContentView(textView);
    }
}