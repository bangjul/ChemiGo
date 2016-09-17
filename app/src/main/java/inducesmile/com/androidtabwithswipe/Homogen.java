package inducesmile.com.androidtabwithswipe;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Homogen extends ActionBarActivity {

    int position;
    ListView listview;
    ArrayAdapter adapter;
    String[] listArray={"koloid","larutan"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        position = getIntent().getExtras().getInt("data");
        if(position==0){
            setContentView(R.layout.activity_homogen);
            adapter = new ArrayAdapter(this,R.layout.activity_listview,listArray);
            listview = (ListView) findViewById(R.id.listView);
            listview.setAdapter(adapter);
            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent a = new Intent(getApplicationContext(),HomogenDetailActivity.class);
                    a.putExtra("data", i);
                    startActivity(a);
                }
            });
        } else if(position==1){
            TextView tvContain;
            setContentView(R.layout.activity_heterogen);
            tvContain = (TextView) findViewById(R.id.keterangan);
            tvContain.setText(Constanta.heterogenDetail);
        }

    }
}
