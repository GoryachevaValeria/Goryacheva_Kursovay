package com.example.course_work;



import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;



import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;



public class map extends AppCompatActivity {

    //GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
       // createMapView();
        //addMarker();
    }

        //private void addMarker () {


          //  if (null != googleMap) {
            //    googleMap.addMarker(new MarkerOptions()
              //          .position(new LatLng(0, 0))
                //        .title("Marker")
                  //      .draggable(true)
                //);
            }
        //}

        //private void createMapView () {
          //  try {
            //    if (null == googleMap) {
              //      googleMap = ((MapFragment) getFragmentManager().findFragmentById(
                //            R.id.mapView)).getMap();


                  //  if (null == googleMap) {
                    //    Toast.makeText(getApplicationContext(),
                      //          "Error creating map", Toast.LENGTH_SHORT).show();
                    //}
                //}
            //} catch (NullPointerException exception) {
              //  Log.e("mapApp", exception.toString());
            //}
        //}
    //}
