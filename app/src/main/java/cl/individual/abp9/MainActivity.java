package cl.individual.abp9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    int imagenBoton1 = R.drawable.baseline_airplanemode_active_24;
    int imagenBoton2 = R.drawable.baseline_directions_car_24;
    int imagenBoton3 = R.drawable.baseline_hotel_24;
    int imagenBoton4 = R.drawable.baseline_dining_24;

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
                moveToSecondActivity(imagenBoton1);
            }
        });

        imgBoton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity(imagenBoton2);
            }
        });

        imgBoton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity(imagenBoton3);
            }
        });

        imgBoton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity(imagenBoton4);
            }
        });

    }

    public void moveToSecondActivity(int imagenBoton) {
        Intent moveToSecondAct = new Intent(MainActivity.this, SecondActivity.class);
        moveToSecondAct.putExtra("Identificador", imagenBoton);
        startActivity(moveToSecondAct);
    }
}