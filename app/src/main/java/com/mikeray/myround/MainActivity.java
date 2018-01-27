package com.mikeray.myround;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOrder(View view) {
        TextView item1Count = findViewById(R.id.item1Count);
        int count = Integer.parseInt(item1Count.getText().toString());
        count++;
        item1Count.setText(String.valueOf(count));
    }

    public void removeOrder(View view) {
        TextView item1Count = findViewById(R.id.item1Count);
        int count = Integer.parseInt(item1Count.getText().toString());
        if (count > 0) {
            count--;
        }
        item1Count.setText(String.valueOf(count));
    }
}
