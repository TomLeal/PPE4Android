package com.example.ppe4.modele;

public class Categorie {

    private int id;
    private String libelle;

    /**
     * Constructeur de la classe Categorie.
     *
     * @param id
     * @param libelle
     */
    public Categorie(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    //Accesseur et mutateur

    /**
     * Récupère l'id de la catégorie.
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Récupère le nom de la catégorie.
     *
     * @return libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Modifie le nom de la catégorie.
     *
     * @param libelle
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
