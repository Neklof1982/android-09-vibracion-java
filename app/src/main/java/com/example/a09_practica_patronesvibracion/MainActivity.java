package com.example.a09_practica_patronesvibracion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


/**
 * Previamente hay que dar permiso de vibraciones en:
 * AndroidManifest.xml
 * <uses-permission android:name="android.permission.Vibrate"/>
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button buttonCorto = findViewById(R.id.buttonCorto);
        Button buttonLargo = findViewById(R.id.buttonLargo);


        buttonCorto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

    }
}