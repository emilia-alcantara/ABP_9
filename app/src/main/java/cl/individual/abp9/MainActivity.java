package cl.individual.abp9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import cl.individual.abp9.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    int imagenBoton1 = R.drawable.baseline_airplanemode_active_24;
    int imagenBoton2 = R.drawable.baseline_directions_car_24;
    int imagenBoton3 = R.drawable.baseline_hotel_24;
    int imagenBoton4 = R.drawable.baseline_dining_24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initListeners();
    }

    private void initListeners() {


        binding.imgBoton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity(imagenBoton1);
            }
        });

        binding.imgBoton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity(imagenBoton2);
            }
        });

        binding.imgBoton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity(imagenBoton3);
            }
        });

        binding.imgBoton4.setOnClickListener(new View.OnClickListener() {
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