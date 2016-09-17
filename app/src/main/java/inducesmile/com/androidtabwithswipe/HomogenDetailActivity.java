package inducesmile.com.androidtabwithswipe;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomogenDetailActivity extends ActionBarActivity {

    int position;
    TextView tvContain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homogen_detail);
        position = getIntent().getExtras().getInt("data");
        tvContain = (TextView) findViewById(R.id.keterangan);
        tvContain.setText(Constanta.homogenDetail[position]);
    }
}
