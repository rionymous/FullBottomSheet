package com.androidrion.fullbottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btn_show);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentBottomSheetFull fragmentBottomSheetFull = new FragmentBottomSheetFull();
                fragmentBottomSheetFull.show(getSupportFragmentManager(), fragmentBottomSheetFull.getTag());
            }
        });
    }
}
