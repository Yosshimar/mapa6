package com.example.mapa6;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.mapa6.databinding.ActivityMapa62Binding;

public class mapa62 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap2;
    private ActivityMapa62Binding binding;
    private Marker markerPrueba2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapa62Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap2 = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap2.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap2.moveCamera(CameraUpdateFactory.newLatLng(sydney));




        // *****marcador simple y desripción ****//
        LatLng ayacucho = new LatLng(-14, -74);
        mMap2.addMarker(new MarkerOptions().position(ayacucho).title("Ciudad ayacucho").snippet("Ciudad Ayacucho fundada en nnn"));

        // agregando un recurso o icono diferente como marcador
        LatLng arequipa = new LatLng(-16.3988667, -71.5369607);
        mMap2.addMarker(new MarkerOptions().position(arequipa).title("Ciudad Arequipa").snippet
                ("Descripcion de arequipa").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        // agregando un recurso o icono diferente como marcador
        LatLng tacna = new LatLng(-18.0138696, -70.2511597);
        mMap2.addMarker(new MarkerOptions().position(tacna).draggable(true).title("Ciudad Tacna ").snippet
                ("Descripcion de tacna").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        //COLOR MARCADOR
        LatLng cusco = new LatLng(-13.5170887, -71.9785356);
        mMap2.addMarker(new MarkerOptions().position(cusco).title("Ciudad Cusco").snippet
                ("Descripcion de cusco").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));



//*****************************************************
        //1******arrastrando marcador con draggable
        LatLng lima = new LatLng(-12.0621065, -77.0365256);
        mMap2.addMarker(new MarkerOptions().position(lima).draggable(true).title("Ciudad Lima").snippet
                ("Descricpion de lima...").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        //5 marcador de prueba - creando nuestro propio marcador
        LatLng ICA = new LatLng(-14.338611, -75.648333);
        markerPrueba2 = googleMap.addMarker(new MarkerOptions().position(ICA).title("Ica").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)).snippet
                ("Ica es el desierto del peru...."));


        //camara zoom
        mMap2.moveCamera(CameraUpdateFactory.newLatLngZoom(lima, 7));
        googleMap.setOnMarkerClickListener(this::onMarkerClick);
        //googleMap.setOnMarkerClickListener(this);//variable google map , escuchara los eventos de los marcadores
    }
    public boolean onMarkerClick(Marker marker) {
        if(marker.equals(markerPrueba2)){
            //obtner la latitud y longitud
            String lat,lng;
            lat = Double.toString(marker.getPosition().latitude);
            lng = Double.toString(marker.getPosition().longitude);
            // plasme en un toast
            Toast.makeText(this, lat  + "," + lng,Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}