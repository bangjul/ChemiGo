package inducesmile.com.androidtabwithswipe;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import inducesmile.com.androidtabwithswipe.model.ItemSenyawa;

public class Unsur extends ActionBarActivity{

    ArrayList<ItemSenyawa> arrayList;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unsur);

        arrayList = new ArrayList<>();
        for (int i=0 ; i< Constanta.judul.length; i++){
            arrayList.add(new ItemSenyawa(Constanta.judul[i], ImageAdapter.mThumbIds[i]));
        }
        ImageAdapter1 adapter= new ImageAdapter1(getApplicationContext(), arrayList);
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(adapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                //Toast.makeText(Unsur.this, "indek ke-" + position, Toast.LENGTH_SHORT).show();

               Intent i = new Intent(getApplicationContext(),ScrollingActivity.class);
               i.putExtra("data", position);
                startActivity(i);

            }
        });
    }


}
