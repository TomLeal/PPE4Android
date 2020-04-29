package com.example.ppe4.modele;

public class Edition {

    private int id;
    private String libelle;

    public Edition(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    //Accesseur et mutateur

    /**
     * Récupère l'id de l'édition.
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Récupère le libelle de l'auteur.
     *
     * @return
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Modifie le libelle de l'auteur.
     *
     * @param libelle
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
