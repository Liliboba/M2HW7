package com.example.m2hw7;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.m2hw7.databinding.ActivityMainBinding;

import ru.dgis.sdk.DGis;
import ru.dgis.sdk.map.MapView;


public class activityMap extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MapView mapView;
    private String api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        DGis.initialize(this, );
        setContentView(R.layout.activity_main);

        MapView mapView = findViewById(R.id.mapView);

        // Добавление наблюдателя жизненного цикла
        getLifecycle().addObserver(mapView);
    }

}