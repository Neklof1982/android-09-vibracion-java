package com.example.a09_practica_patronesvibracion;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
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

        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        // Dos botones de prueba
        Button buttonCorto = findViewById(R.id.buttonCorto);
        Button buttonLargo = findViewById(R.id.buttonLargo);


        /**
         * Para vibración fija y variable en el tiempo
         */
        buttonCorto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Vibración en milisegundos

                //Por ejemplo 1000 milisegundos es 1 segundo
                vibrator.vibrate(1000);
            }
        });


        /**
         * Variando Intensidad y tiempo fijo y variable
         */
        buttonLargo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                //Vibración en milisegundos
                //Oir ehenoki 2000 millisegundos is 2 segndos
                //vibrator.vibrate(1000);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)

                {
                    long[] time = {0, 100, 0, 100, 0, 100};
                    int[] amplitude = {0, 50, 0, 100, 0, 150};

                    VibrationEffect vibrationEffect = VibrationEffect.createWaveform(time, amplitude, -1 /*-1 No repeat*/);

                    vibrator.vibrate(vibrationEffect);
                }
                else
                {
                    vibrator.vibrate(1000);
                }



            }
        });

    }
}