package com.example.ppe4.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.ppe4.R;
import com.example.ppe4.controleur.AccueilControleur;
import com.example.ppe4.modele.Magasin;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        this.controle = AccueilControleur.getInstance();
    }

    private AccueilControleur controle;

    /**
     * Initialise les liens avec les objets graphiques.
     */
    private void init(){
        ecouteBtnProduit();
        ecouteBtnMagasin();
    }

    /**
     * Code du bouton "Nos produits"
     */
    private void ecouteBtnProduit(){
        ((Button) findViewById(R.id.btnProduit)).setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BoutiqueActivity.class));
            }
        });
    }

    /**
     * Code du bouton "Liste des magasins".
     */
    private void ecouteBtnMagasin(){
        ((Button) findViewById(R.id.btnMagasin)).setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                //Récupère un fichier json avec tous les magasins.
                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
                String url = "http://192.168.1.77:8082/ppe4/public/api/magasin";
                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>() {

                            @Override
                            public void onResponse(String response) {
                                try{
                                    JSONObject magasinJSON = new JSONObject(response);
                                    JSONArray magasinJArray = magasinJSON.getJSONArray("magasins");

                                    for (int i = 0; i < magasinJArray.length(); i++){
                                        JSONObject unMag = magasinJArray.getJSONObject(i);
                                        Integer id = unMag.getInt("id");
                                        String nom = unMag.getString("nom");
                                        Double longitude = unMag.getDouble("longitude");
                                        Double latitude = unMag.getDouble("latitude");
                                        Magasin mag = new Magasin(id, nom, longitude, latitude);
                                        MagasinActivity.listeMagasins.add(mag);
                                    }
                                    startActivity(new Intent(MainActivity.this, MagasinActivity.class));
                                }catch (JSONException e){
                                    Log.e("MainActivity", "ERREUR :" + e);
                                }
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("MainActivity", "ERREUR :" + error.getMessage());
                    }
                }
                );
                queue.add(stringRequest);
            }
        });
    }
}
