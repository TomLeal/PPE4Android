package com.example.ppe4.vue;

import androidx.fragment.app.FragmentActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;

import com.example.ppe4.R;
import com.example.ppe4.modele.Magasin;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MagasinActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    public static ArrayList<Magasin> listeMagasins = new ArrayList<Magasin>();
    private static final String TAG = MagasinActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magasin);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //Met les marqueurs des magasins sur la map.
        ArrayList<LatLng> listePosition = new ArrayList<LatLng>();
        for(int i = 0; i < listeMagasins.size(); i++){
            listePosition.add(new LatLng(listeMagasins.get(i).getLongitude(), listeMagasins.get(i).getLatitude()));
            mMap.addMarker(new MarkerOptions().position(listePosition.get(i)).title(listeMagasins.get(i).getNom()));
        }
        mMap.moveCamera(CameraUpdateFactory.newLatLng(listePosition.get(0)));

        //Applique le style de la map. Le style ce trouve dans res/raw/google_maps_style/json
        try {
            boolean success = googleMap.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(
                            this, R.raw.google_maps_style));

            if (!success) {
                Log.e(TAG, "Style parsing failed.");
            }
        } catch (Resources.NotFoundException e) {
            Log.e(TAG, "Can't find style. Error: ", e);
        }
    }
}
