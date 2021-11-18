package com.example.mapa6;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.mapa6.databinding.ActivityMapa63Binding;

public class mapa63 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    //declarando nuestra variables
    private Button btn_hibrido,btn_normal,btn_satelital,btn_terreno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_mapa63);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
//*****
        btn_hibrido = (Button)findViewById(R.id.bt11);
        btn_normal = (Button)findViewById(R.id.bt22);
        btn_satelital = (Button)findViewById(R.id.bt33);
        btn_terreno = (Button)findViewById(R.id.bt44);
    }
    public void cambiarHibrido (View view){
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    }
    public void cambiarNormal (View view){
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }
    public void cambiarSatelital (View view){
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
    }
    public void cambiarTerreno(View view){
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}