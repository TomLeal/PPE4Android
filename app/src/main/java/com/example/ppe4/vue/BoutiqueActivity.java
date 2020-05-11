package com.example.ppe4.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.ppe4.R;
import com.example.ppe4.modele.Produit;

import java.util.ArrayList;

public class BoutiqueActivity extends AppCompatActivity {

    public static ArrayList<Produit> listeProduits = new ArrayList<Produit>();
    private ArrayList<Button> listeViewProduits = new ArrayList<Button>();

    private LinearLayout produitConteneur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boutique);
        init();
        afficheProduits();
    }

    private void init(){
        produitConteneur = (LinearLayout) findViewById(R.id.produitConteneur);
    }

    private void afficheProduits(){
        for(int x = 0; x<listeProduits.size(); x++){
            listeViewProduits.add(new Button(this));
            listeViewProduits.get(x).setText(listeProduits.get(x).getLibelle());
            listeViewProduits.get(x).setBackgroundColor(000000);
            listeViewProduits.get(x).setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ProduitActivity.leProduit = listeProduits.get(x);
                    startActivity(new Intent(BoutiqueActivity.this, ProduitActivity.class));
                }
            });
            produitConteneur.addView(listeViewProduits.get(x));
        }
    }
}
