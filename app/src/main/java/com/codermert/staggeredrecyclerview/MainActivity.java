package com.codermert.staggeredrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final int NUM_COLUMNS = 2;

    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mNames = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/4/41/New_havasu_falls.JPG");
        mNames.add("Havasu Falls");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/0/03/Nidelva_utl%C3%B8p_Trondheim.jpg");
        mNames.add("Trondheim");

        mImageUrls.add("https://travellersworldwide.com/wp-content/uploads/2022/05/shutterstock_759868507.png.webp");
        mNames.add("Portugal");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/3/3e/Rocky_Mountain_National_Park_in_September_2011_-_Glacier_Gorge_from_Bear_Lake.JPG");
        mNames.add("Rocky Mountain National Park");


        mImageUrls.add("https://mexicorutamagica.mx/wp-content/uploads/2022/04/mahahual-paraiso-caribeno.jpg");
        mNames.add("Mahahual");

        mImageUrls.add("https://www.pandotrip.com/wp-content/uploads/2015/11/Chaqmaqtin-Photo-by-Matthieu-Paley2-980x711.jpg");
        mNames.add("Frozen Lake");


        mImageUrls.add("https://www.pandotrip.com/wp-content/uploads/2014/12/White-Sands-980x735.jpg");
        mNames.add("White Sands Desert");

        mImageUrls.add("https://www.state.gov/wp-content/uploads/2022/02/shutterstock_1025960785-2560x1300.jpg");
        mNames.add("Austrailia");

        mImageUrls.add("https://atlasedu.com/images/spot_resim/buyuk/aWNxT3jBYamRWXhnpV7_washington_dc_usa.jpg");
        mNames.add("Washington");

        initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: initializing staggered recyclerview.");

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        StaggeredRecyclerViewAdapter staggeredRecyclerViewAdapter =
                new StaggeredRecyclerViewAdapter(this, mNames, mImageUrls);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(staggeredRecyclerViewAdapter);
    }
}