package com.example.nicole_mikael_semaine9.model;


import java.io.Serializable;

public class Album implements Serializable {
    private long id;
    private String titre;
    private String auteur;
    private String anneeDeSortie;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getAnneeDeSortie() {
        return anneeDeSortie;
    }

    public void setAnneeDeSortie(String anneeDeSortie) {
        this.anneeDeSortie = anneeDeSortie;
    }

    public Album(long id, String titre, String auteur, String anneeDeSortie) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.anneeDeSortie = anneeDeSortie;
    }

    public Album() {
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", anneeDeSortie=" + anneeDeSortie +
                '}';
    }
}
