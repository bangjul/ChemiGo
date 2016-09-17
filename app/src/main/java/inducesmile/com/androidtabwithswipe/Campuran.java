package inducesmile.com.androidtabwithswipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by bangjul on 12/12/2015.
 */
public class Campuran extends Activity {

    String[] listArray={"Homogen","Heterogen"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campuran);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.activity_listview,listArray);
        ListView listview =(ListView) findViewById(R.id.array_list);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent a = new Intent(getApplicationContext(),Homogen.class);
                a.putExtra("data", i);
                startActivity(a);
            }
        });
    }

}
