package inducesmile.com.androidtabwithswipe;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Scrolling_senyawa_activity extends ActionBarActivity {

    TextView tvSenyawa,judul;
    ImageView gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        this.setTitle("Senyawa");

        tvSenyawa = (TextView) findViewById(R.id.keterangan);
        gambar = (ImageView) findViewById(R.id.gambar);
        judul = (TextView) findViewById(R.id.judul);

        int position = getIntent().getExtras().getInt("data");
        //Toast.makeText(getApplicationContext(), "posisi : "+position, Toast.LENGTH_SHORT).show();
        gambar.setImageResource(ImageAdapter1.mThumbIds[position]);
        //Toast.makeText(getApplicationContext(), "position : "+position, Toast.LENGTH_SHORT).show();
        tvSenyawa.setText(Constanta.senyawa[position]);
        judul.setText(Constanta.judul2[position]);
    }

}
