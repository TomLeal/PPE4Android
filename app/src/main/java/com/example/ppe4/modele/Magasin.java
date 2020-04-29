package com.example.ppe4.modele;

public class Magasin {

    private int id;
    private String nom;
    private String tel;
    private String courriel;
    private String horraireOuverture;
    private Double longitude;
    private Double latitude;
    private String adr1;
    private String adr2;
    private String ville;

    /**
     * Constructeur de la classe Magasin.
     *
     * @param id
     * @param nom
     * @param tel
     * @param courriel
     * @param horraireOuverture
     * @param longitude
     * @param latitude
     * @param adr1
     * @param adr2
     * @param ville
     */
    public Magasin(int id, String nom, String tel, String courriel, String horraireOuverture, Double longitude, Double latitude, String adr1, String adr2, String ville) {
        this.id = id;
        this.nom = nom;
        this.tel = tel;
        this.courriel = courriel;
        this.horraireOuverture = horraireOuverture;
        this.longitude = longitude;
        this.latitude = latitude;
        this.adr1 = adr1;
        this.adr2 = adr2;
        this.ville = ville;
    }

    /**
     * Constructeur de test
     *
     * @param id
     * @param nom
     * @param longitude
     * @param latitude
     */
    public Magasin(int id, String nom, Double longitude, Double latitude) {
        this.id = id;
        this.nom = nom;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    //Accesseur et mutateur

    /**
     * Récupère l'id du magasin.
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Récupère le nom du magasin.
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Récupère le numéro de téléphone.
     *
     * @return
     */
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * Récupère l'adresse email du magasin.
     *
     * @return
     */
    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    /**
     * Récupère l'horraire d'ouverture.
     *
     * @return
     */
    public String getHorraireOuverture() {
        return horraireOuverture;
    }

    /**
     * Modifie l'horraire d'ouverture.
     *
     * @param horraireOuverture
     */
    public void setHorraireOuverture(String horraireOuverture) {
        this.horraireOuverture = horraireOuverture;
    }

    /**
     * Récupère la longitude de la position du magasin.
     *
     * @return
     */
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * Récupère la latitude de la position du magasin.
     *
     * @return
     */
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * Récupère l'adresse 1 du magasin.
     *
     * @return
     */
    public String getAdr1() {
        return adr1;
    }

    public void setAdr1(String adr1) {
        this.adr1 = adr1;
    }

    /**
     * Récupère l'adresse 2 du magasin.
     *
     * @return
     */
    public String getAdr2() {
        return adr2;
    }

    public void setAdr2(String adr2) {
        this.adr2 = adr2;
    }

    /**
     * Récupère la ville où se situe le magasin.
     *
     * @return
     */
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
