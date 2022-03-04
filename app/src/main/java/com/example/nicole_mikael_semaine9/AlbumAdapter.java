package com.example.nicole_mikael_semaine9;

import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nicole_mikael_semaine9.model.Album;

import java.util.List;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {
    private final List<Album> listeAlbums;
    private int setSelectedItemPosition;

    public AlbumAdapter(List<Album> listeAlbums) {
        this.listeAlbums = listeAlbums;
    }

    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_album, parent, false);
        return new AlbumViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumViewHolder holder, int position) {
        Album album = listeAlbums.get(position);
        holder.tvId.setText(String.valueOf(album.getId()));
        holder.tvTitre.setText(album.getTitre());
        holder.tvAuteur.setText(album.getAuteur());
        holder.tvAnneeDeSortie.setText((album.getAnneeDeSortie()));


        holder.itemView.setOnClickListener(view -> {

            Intent intent = new Intent(view.getContext(), SelectedAlbumActivity.class);
            intent.putExtra("selectedAlbum", album);
//            intent.putExtra("editMode", 1);


            view.getContext().startActivity(intent);
        });
        holder.itemView.setOnLongClickListener(view -> {
            setSelectedItemPosition(position);
            return false;
        });
    }

    private void setSelectedItemPosition(int position) {
        this.setSelectedItemPosition = position;
    }

    public int getSetSelectedItemPosition() {
        return setSelectedItemPosition;
    }

    @Override
    public int getItemCount() {
        return listeAlbums.size();
    }

    public static class AlbumViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {
        public TextView tvId;
        public TextView tvTitre;
        public TextView tvAuteur;
        public TextView tvAnneeDeSortie;


        public AlbumViewHolder(@NonNull View itemView) {
            super(itemView);
            tvId = itemView.findViewById(R.id.txtVId);
            tvTitre = itemView.findViewById(R.id.txtVTitre);
            tvAuteur = itemView.findViewById(R.id.txtVNom);
            tvAnneeDeSortie = itemView.findViewById(R.id.txtVAnneeDeSortie);
            itemView.setOnCreateContextMenuListener(this);
        }

        @Override
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.setHeaderTitle("Option");
//            contextMenu.add(Menu.NONE, R.string.menu_item_editer, Menu.NONE, "Editer");
//            contextMenu.add(Menu.NONE, R.string.menu_item_delete, Menu.NONE, "Supprimer");

        }
    }
}
