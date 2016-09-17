package inducesmile.com.androidtabwithswipe;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ScrollingActivity extends ActionBarActivity {
    TextView tvContain,judulll;
    ImageView gambar;
    //ImageView tes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        this.setTitle("Unsur");

        //tes = (ImageView) findViewById(R.id.img_ket);
        tvContain = (TextView) findViewById(R.id.keterangan);

        judulll = (TextView)findViewById(R.id.judul);

        gambar = (ImageView) findViewById(R.id.gambar);

        int position = getIntent().getExtras().getInt("data");

        //Toast.makeText(getApplicationContext(), "position : "+position, Toast.LENGTH_SHORT).show();
        //tes.setImageDrawable(Constanta.gambar_unsur[position]);
        tvContain.setText(Constanta.contain[position]);
        judulll.setText(Constanta.judul[position]);
        gambar.setImageResource(ImageAdapter.mThumbIds[position]);
    }


}
