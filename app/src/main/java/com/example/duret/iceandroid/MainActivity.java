package com.example.duret.iceandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import server.IServerPrx;

public class MainActivity extends AppCompatActivity {
    private Button bonsouar;
    private TextView hw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IServerPrx ice = SharedIce.getInstance();
        //System.out.println(ice.getPlaylist());


        bonsouar = findViewById(R.id.bonsouar);
        hw = findViewById(R.id.hw);

        bonsouar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hw.setText("Bonsouar");
            }
        });
    }
}
