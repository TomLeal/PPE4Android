package com.example.ppe4.modele;

public class Auteur {

    private int id;
    private String nom;
    private String prenom;

    /**
     * Constructeur de la classe Auteur.
     *
     * @param id
     * @param nom
     */
    public Auteur(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    //Accesseur et mutateur

    /**
     * Récupère l'id de l'auteur.
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Récupère le nom de l'auteur.
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom de l'auteur.
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Récupère le prénom de l'auteur.
     *
     * @return
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Modifie le prénom de l'auteur.
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
