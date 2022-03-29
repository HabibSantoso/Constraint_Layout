package com.example.constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class LihatDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        TextView gtvnama, gtvnotel;

        gtvnama = findViewById(R.id.tvNama);
        gtvnotel = findViewById(R.id.tvNotel);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama){
            case "Inayah":
                gtvnama.setText("Inayah");
                gtvnotel.setText("081222333444");
                break;
            case "Ilham":
                gtvnama.setText("Ilham");
                gtvnotel.setText("081222333445");
                break;
            case "Eris":
                gtvnama.setText("Eris");
                gtvnotel.setText("081222333446");
                break;
            case "Fikri":
                gtvnama.setText("Fikri");
                gtvnotel.setText("081222333448");
                break;
            case "Maul":
                gtvnama.setText("Maul");
                gtvnotel.setText("081222333449");
                break;
        }
    }
}