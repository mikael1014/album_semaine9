package com.example.nicole_mikael_semaine9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.nicole_mikael_semaine9.model.Album;

public class SelectedAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_album);
        setTitle("Selected");
        // int viewMode = getIntent().getIntExtra("viewMode", 0);

        //  if (viewMode != 0)
       {
            Album album = (Album) getIntent().getSerializableExtra("selectedAlbum");
            TextView textViewId = findViewById(R.id.selectedTextVId);
            TextView textViewTitre = findViewById(R.id.selectedTextVTitre);
            TextView textViewAuteur = findViewById(R.id.selectedTextVAuteur);
            TextView textViewAnneeDeSortie = findViewById(R.id.selectedTextVAnneeDeSortie);
            textViewId.setText(String.valueOf(album.getId()));
            textViewTitre.setText(album.getTitre());
            textViewAuteur.setText(album.getAuteur());
            textViewAnneeDeSortie.setText(album.getAnneeDeSortie());
        }
    }
}