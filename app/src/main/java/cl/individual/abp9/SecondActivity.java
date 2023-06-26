package cl.individual.abp9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initListeners();
        Intent obtenerIntent = getIntent();
        int imagenId =getIntent().getIntExtra("Identificador", 0);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(imagenId);
    }

    private void initListeners() {
        Button botonVolverAtras = findViewById(R.id.botonVolver);

        botonVolverAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}