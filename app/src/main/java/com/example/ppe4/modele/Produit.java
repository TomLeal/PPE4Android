package com.example.ppe4.modele;

public class Produit {

    private int id;
    private String libelle;
    private String description;
    private Integer prixht;
    private Integer stock;
    private Auteur auteur;
    private Categorie categorie;
    private Edition edition;

    /**
     * Constructeur de la classe Produit.
     *
     * @param id
     * @param libelle
     * @param description
     * @param prixht
     * @param stock
     * @param auteur
     * @param categorie
     * @param edition
     */
    public Produit(int id, String libelle, String description, Integer prixht, Integer stock, Auteur auteur, Categorie categorie, Edition edition) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.prixht = prixht;
        this.stock = stock;
        this.auteur = auteur;
        this.categorie = categorie;
        this.edition = edition;
    }

    //Accesseur et mutateur

    /**
     * Récupère l'id du produit.
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Récupère le nom du produit.
     *
     * @return libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Modifie le nom du produit.
     *
     * @param libelle
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * Récupère la description du produit.
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Modifie la description du produit.
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Récupère le prix hors taxe du produit.
     *
     * @return prixht
     */
    public Integer getPrixht() {
        return prixht;
    }

    /**
     * Modifie le prix hors taxe du produit.
     *
     * @param prixht
     */
    public void setPrixht(Integer prixht) {
        this.prixht = prixht;
    }

    /**
     * Récupère le stock de ce produit.
     *
     * @return stock
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * Modifie le stock de ce produit.
     *
     * @param stock
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * Récupère l'auteur du produit.
     *
     * @return auteur
     */
    public Auteur getAuteur() {
        return auteur;
    }

    /**
     * Modifie l'auteur du produit.
     *
     * @param auteur
     */
    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    /**
     * Récupère la catégorie du produit.
     *
     * @return categorie
     */
    public Categorie getCategorie() {
        return categorie;
    }

    /**
     * Modifie la catégorie du produit.
     *
     * @param categorie
     */
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    /**
     * Récupère l'édition du produit.
     *
     * @return
     */
    public Edition getEdition() {
        return edition;
    }

    /**
     * Modifie l'édition du produit.
     *
     * @param edition
     */
    public void setEdition(Edition edition) {
        this.edition = edition;
    }
}
