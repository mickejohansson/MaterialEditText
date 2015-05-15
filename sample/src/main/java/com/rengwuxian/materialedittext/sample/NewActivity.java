package com.rengwuxian.materialedittext.sample;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;

public class NewActivity extends Activity {

    public static void start(@NonNull Context context) {
        Intent intent = new Intent(context, NewActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_new);
    }
}
