package com.example.ppe4.vue;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ppe4.R;
import com.example.ppe4.modele.Produit;

public class ProduitActivity extends AppCompatActivity {

    public static Produit leProduit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produit);
        init();
    }

    private void init(){
        ((TextView) findViewById(R.id.libelle)).setText(leProduit.getLibelle());
        ((TextView) findViewById(R.id.prix)).setText(Integer.toString(leProduit.getPrixht()));
        ((TextView) findViewById(R.id.description)).setText(leProduit.getDescription());
        ((TextView) findViewById(R.id.stock)).setText("Il reste "+Integer.toString(leProduit.getPrixht())+" exemplaires");
    }
}
