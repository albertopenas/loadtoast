package net.steamcrafted.loadtoastlib;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import net.steamcrafted.loadtoast.LoadToast;


public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String text = "Sending reply...";
        final LoadToast lt = new LoadToast(this).setText(text);
        findViewById(R.id.show).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lt.show();
            }
        });
        findViewById(R.id.error).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lt.error();
            }
        });
        findViewById(R.id.success).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lt.success();
            }
        });
    }
}