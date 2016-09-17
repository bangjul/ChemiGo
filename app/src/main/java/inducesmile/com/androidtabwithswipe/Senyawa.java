package inducesmile.com.androidtabwithswipe;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import inducesmile.com.androidtabwithswipe.model.ItemSenyawa;

public class Senyawa extends ActionBarActivity{

    ArrayList<ItemSenyawa> arrayList;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senyawa);

        arrayList = new ArrayList<>();

        for (int i=0; i<Constanta.judul2.length ; i++){
            arrayList.add(new ItemSenyawa(Constanta.judul2[i], ImageAdapter1.mThumbIds[i]));
        }



        final ImageAdapter adapter= new ImageAdapter(this);
        final GridView gridview = (GridView) findViewById(R.id.gridview);

        gridview.setAdapter(new ImageAdapter1(this, arrayList));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                //Toast.makeText(Unsur.this, "indek ke-" + position, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), Scrolling_senyawa_activity.class);
                i.putExtra("data", position);
                startActivity(i);
            }
        });
    }
}
