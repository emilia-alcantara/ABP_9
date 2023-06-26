package cl.individual.abp9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListeners();
    }

    private void initListeners() {
        ImageButton imgBoton1 = findViewById(R.id.imgBoton1);
        ImageButton imgBoton2 = findViewById(R.id.imgBoton2);
        ImageButton imgBoton3 = findViewById(R.id.imgBoton3);
        ImageButton imgBoton4 = findViewById(R.id.imgBoton4);

        imgBoton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity();
            }
        });

        imgBoton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity();
            }
        });

        imgBoton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity();
            }
        });

        imgBoton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity();
            }
        });

    }

    public void moveToSecondActivity() {
        Intent moveToSecondAct = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(moveToSecondAct);
    }
}