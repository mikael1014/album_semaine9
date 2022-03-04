package com.example.nicole_mikael_semaine9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nicole_mikael_semaine9.model.Album;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Album album =new Album();
    public void openPage(View view){
        Intent intent = new Intent(this,NewAlbumActivity.class);
        intent.putExtra("selectedAlbum", album);
        //  intent.putExtra("saisie",findViewById(R.id.editTextSasie).getv());
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Album> listeAlbums = new ArrayList<>();
        listeAlbums.add(new Album(1,  "titre1", "auteur1", "2010"));
        listeAlbums.add(new Album(2,  "titre2", "auteur2", "2016"));
        listeAlbums.add(new Album(3,  "titre3", "auteur3", "2012"));
        listeAlbums.add(new Album(4,  "titre4", "auteur4", "2013"));
        listeAlbums.add(new Album(5,  "titre5", "auteur5", "2011"));
        listeAlbums.add(new Album(6,  "titre6", "auteur6", "1925"));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        AlbumAdapter albumAdapter = new AlbumAdapter(listeAlbums);
        recyclerView.setAdapter(albumAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
    }


}