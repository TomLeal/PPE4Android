package com.example.ppe4.controleur;

public final class AccueilControleur {

    private static AccueilControleur instance = null;

    public AccueilControleur() {
        super();
    }

    public static final AccueilControleur getInstance(){
        if (AccueilControleur.instance == null){
            AccueilControleur.instance = new AccueilControleur();
        }
        return AccueilControleur.instance;
    }
}
