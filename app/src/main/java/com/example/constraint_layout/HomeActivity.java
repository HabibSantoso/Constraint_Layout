package com.example.constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.PopupMenu;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    private ListView list;

    private ListViewAdapter adapter;

    String[] listnama;

    public static ArrayList<ClassNama> classNamaArrayList = new ArrayList<ClassNama>();

    Bundle bundle = new Bundle();

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listnama = new String[]{"Inayah","Ilham","Eris","Fikri","Maul"};

        list = findViewById(R.id.listKontak);

        classNamaArrayList = new ArrayList<>();

        for (int i = 0; i < listnama.length; i++){
            ClassNama classNama = new ClassNama(listnama[i]);

            classNamaArrayList.add(classNama);
        }

    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        return false;
    }
}