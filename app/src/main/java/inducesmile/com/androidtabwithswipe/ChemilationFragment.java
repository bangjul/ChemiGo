package inducesmile.com.androidtabwithswipe;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.widget.Toast.*;

/**
 * Created by bangjul on 08/12/2015.
 */
public class ChemilationFragment extends Fragment {


    public ChemilationFragment() {
    }
    Button mix;
    LinearLayout btn1,btn2,btn3;
    Context context;
    int unsur1 = 0, unsur2 = 0, unsurMixan, unsur3 = 0;
    TextView judul,judul2, judul3;


    public void cekUnsurMixan(){
        if((Constanta.unsur1Temp == Constanta.unsur2Temp) || (Constanta.unsur2Temp == Constanta.unsur3Temp) ||(Constanta.unsur1Temp == Constanta.unsur3Temp) ){
            Toast.makeText(getActivity(), "Unsur tidak boleh sama.", LENGTH_SHORT).show();
        }
        else if(Constanta.unsur3Temp == 116){
            if((Constanta.unsur1Temp == 62 && Constanta.unsur2Temp == 40) || (Constanta.unsur1Temp == 40 && Constanta.unsur2Temp == 62) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 1);
                startActivity(i);
            }
            else if((Constanta.unsur1Temp == 40 && Constanta.unsur2Temp == 21) || (Constanta.unsur1Temp == 21 && Constanta.unsur2Temp == 40) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 5);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 62 && Constanta.unsur2Temp == 64) || (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 62) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 24);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 51 && Constanta.unsur2Temp == 64) || (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 51) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 21);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 8 && Constanta.unsur2Temp == 21) || (Constanta.unsur1Temp == 20 && Constanta.unsur2Temp == 7) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 12);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 19 && Constanta.unsur2Temp == 64) || (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 19) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 19);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 9 && Constanta.unsur2Temp == 21) || (Constanta.unsur1Temp == 20 && Constanta.unsur2Temp == 8) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 7);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 19) || (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 19) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 19);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 40 && Constanta.unsur2Temp == 113) || (Constanta.unsur1Temp == 113 && Constanta.unsur2Temp == 40) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 15);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 112 && Constanta.unsur2Temp == 43) || (Constanta.unsur1Temp == 43 && Constanta.unsur2Temp == 112) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 16);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 115 && Constanta.unsur2Temp == 113) || (Constanta.unsur1Temp == 113 && Constanta.unsur2Temp == 115) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 9);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 40 && Constanta.unsur2Temp == 64) || (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 40) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 0);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 86 && Constanta.unsur2Temp == 64) || (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 86) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 2);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 48 && Constanta.unsur2Temp == 33) || (Constanta.unsur1Temp == 33 && Constanta.unsur2Temp == 48) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 3);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 18 && Constanta.unsur2Temp == 20) || (Constanta.unsur1Temp == 20 && Constanta.unsur2Temp == 18) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 10);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 66 && Constanta.unsur2Temp == 40) || (Constanta.unsur1Temp == 40 && Constanta.unsur2Temp == 66) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 14);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 22 && Constanta.unsur2Temp == 21) || (Constanta.unsur1Temp == 21 && Constanta.unsur2Temp == 22) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 20);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 56 && Constanta.unsur2Temp == 21) || (Constanta.unsur1Temp == 21 && Constanta.unsur2Temp == 56) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 28);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 1 && Constanta.unsur2Temp == 64) || (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 1) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 29);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 19 && Constanta.unsur2Temp == 21) || (Constanta.unsur1Temp == 21 && Constanta.unsur2Temp == 19) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 32);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 66 && Constanta.unsur2Temp == 21) || (Constanta.unsur1Temp == 21 && Constanta.unsur2Temp == 66) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 34);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 112 && Constanta.unsur2Temp == 21) || (Constanta.unsur1Temp == 21 && Constanta.unsur2Temp == 112) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 35);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 40 && Constanta.unsur2Temp == 33) || (Constanta.unsur1Temp == 33 && Constanta.unsur2Temp == 40) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 38);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 56 && Constanta.unsur2Temp == 33) || (Constanta.unsur1Temp == 33 && Constanta.unsur2Temp == 56) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 39);
                startActivity(i);
            }

            else if((Constanta.unsur1Temp == 113 && Constanta.unsur2Temp == 33) || (Constanta.unsur1Temp == 33 && Constanta.unsur2Temp == 113) ) {
                Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
                i.putExtra("data", 40);
                startActivity(i);
            }

            else{
                Toast.makeText(getActivity(), "Sangat disayangkan pencampuran gagal, coba lagi!", LENGTH_SHORT).show();
            }
        }
        //caampuran 2 unsur selesai
        else if
                ((Constanta.unsur1Temp == 4 && Constanta.unsur2Temp == 62 && Constanta.unsur3Temp == 64) ||
                        (Constanta.unsur1Temp == 4 && Constanta.unsur2Temp == 64 && Constanta.unsur3Temp == 62) ||

                        (Constanta.unsur1Temp == 62 && Constanta.unsur2Temp == 4 && Constanta.unsur3Temp == 64) ||
                        (Constanta.unsur1Temp == 62 && Constanta.unsur2Temp == 64 && Constanta.unsur3Temp == 4) ||

                        (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 62 && Constanta.unsur3Temp == 4) ||
                        (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 4 && Constanta.unsur3Temp == 62))
        {
            Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
            i.putExtra("data", 26);
            startActivity(i);
        }
        else if
                ((Constanta.unsur1Temp == 56 && Constanta.unsur2Temp == 113 && Constanta.unsur3Temp == 64) ||
                        (Constanta.unsur1Temp == 56 && Constanta.unsur2Temp == 64 && Constanta.unsur3Temp == 113) ||

                        (Constanta.unsur1Temp == 113 && Constanta.unsur2Temp == 56 && Constanta.unsur3Temp == 64) ||
                        (Constanta.unsur1Temp == 113 && Constanta.unsur2Temp == 64 && Constanta.unsur3Temp == 56) ||

                        (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 113 && Constanta.unsur3Temp == 56) ||
                        (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 56 && Constanta.unsur3Temp == 113))
        {
            Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
            i.putExtra("data", 23);
            startActivity(i);
        }
        else if
                ((Constanta.unsur1Temp == 19 && Constanta.unsur2Temp == 40 && Constanta.unsur3Temp == 62) ||
                        (Constanta.unsur1Temp == 19 && Constanta.unsur2Temp == 62 && Constanta.unsur3Temp == 40) ||

                        (Constanta.unsur1Temp == 40 && Constanta.unsur2Temp == 19 && Constanta.unsur3Temp == 62) ||
                        (Constanta.unsur1Temp == 40 && Constanta.unsur2Temp == 62 && Constanta.unsur3Temp == 19) ||

                        (Constanta.unsur1Temp == 62 && Constanta.unsur2Temp == 40 && Constanta.unsur3Temp == 19) ||
                        (Constanta.unsur1Temp == 62 && Constanta.unsur2Temp == 19 && Constanta.unsur3Temp == 40))
        {
            Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
            i.putExtra("data", 5);
            startActivity(i);
        }
        else if
                ((Constanta.unsur1Temp == 19 && Constanta.unsur2Temp == 40 && Constanta.unsur3Temp == 64) ||
                        (Constanta.unsur1Temp == 19 && Constanta.unsur2Temp == 64 && Constanta.unsur3Temp == 40) ||

                        (Constanta.unsur1Temp == 40 && Constanta.unsur2Temp == 19 && Constanta.unsur3Temp == 64) ||
                        (Constanta.unsur1Temp == 40 && Constanta.unsur2Temp == 64 && Constanta.unsur3Temp == 19) ||

                        (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 40 && Constanta.unsur3Temp == 19) ||
                        (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 19 && Constanta.unsur3Temp == 40))
        {
            Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
            i.putExtra("data", 11);
            startActivity(i);
        }

        else if
                ((Constanta.unsur1Temp == 24 && Constanta.unsur2Temp == 113 && Constanta.unsur3Temp == 64) ||
                        (Constanta.unsur1Temp == 24 && Constanta.unsur2Temp == 64 && Constanta.unsur3Temp == 113) ||

                        (Constanta.unsur1Temp == 113 && Constanta.unsur2Temp == 24 && Constanta.unsur3Temp == 64) ||
                        (Constanta.unsur1Temp == 113 && Constanta.unsur2Temp == 64 && Constanta.unsur3Temp == 24) ||

                        (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 113 && Constanta.unsur3Temp == 24) ||
                        (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 24 && Constanta.unsur3Temp == 113))
        {
            Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
            i.putExtra("data", 27);
            startActivity(i);
        }

        else if
                ((Constanta.unsur1Temp == 56 && Constanta.unsur2Temp == 64 && Constanta.unsur3Temp == 40) ||
                        (Constanta.unsur1Temp == 56 && Constanta.unsur2Temp == 40 && Constanta.unsur3Temp == 64) ||

                        (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 56 && Constanta.unsur3Temp == 40) ||
                        (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 40 && Constanta.unsur3Temp == 56) ||

                        (Constanta.unsur1Temp == 40 && Constanta.unsur2Temp == 56 && Constanta.unsur3Temp == 64) ||
                        (Constanta.unsur1Temp == 40 && Constanta.unsur2Temp == 64 && Constanta.unsur3Temp == 56))
        {
            Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
            i.putExtra("data", 30);
            startActivity(i);
        }
        else if
                ((Constanta.unsur1Temp == 40 && Constanta.unsur2Temp == 113 && Constanta.unsur3Temp == 64) ||
                        (Constanta.unsur1Temp == 40 && Constanta.unsur2Temp == 64 && Constanta.unsur3Temp == 113) ||

                        (Constanta.unsur1Temp == 113 && Constanta.unsur2Temp == 40 && Constanta.unsur3Temp == 64) ||
                        (Constanta.unsur1Temp == 113 && Constanta.unsur2Temp == 64 && Constanta.unsur3Temp == 40) ||

                        (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 113 && Constanta.unsur3Temp == 40) ||
                        (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 40 && Constanta.unsur3Temp == 113))
        {
            Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
            i.putExtra("data", 31);
            startActivity(i);
        }

        else if
                ((Constanta.unsur1Temp == 112 && Constanta.unsur2Temp == 64 && Constanta.unsur3Temp == 40) ||
                        (Constanta.unsur1Temp == 112 && Constanta.unsur2Temp == 40 && Constanta.unsur3Temp == 64) ||

                        (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 112 && Constanta.unsur3Temp == 40) ||
                        (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 40 && Constanta.unsur3Temp == 112) ||

                        (Constanta.unsur1Temp == 40 && Constanta.unsur2Temp == 112 && Constanta.unsur3Temp == 64) ||
                        (Constanta.unsur1Temp == 40 && Constanta.unsur2Temp == 64 && Constanta.unsur3Temp == 112))
        {
            Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
            i.putExtra("data", 33);
            startActivity(i);
        }

        else if
                ((Constanta.unsur1Temp == 112 && Constanta.unsur2Temp == 51 && Constanta.unsur3Temp == 64) ||
                        (Constanta.unsur1Temp == 112 && Constanta.unsur2Temp == 64 && Constanta.unsur3Temp == 51) ||

                        (Constanta.unsur1Temp == 51 && Constanta.unsur2Temp == 112 && Constanta.unsur3Temp == 64) ||
                        (Constanta.unsur1Temp == 51 && Constanta.unsur2Temp == 64 && Constanta.unsur3Temp == 112) ||

                        (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 112 && Constanta.unsur3Temp == 51) ||
                        (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 51 && Constanta.unsur3Temp == 112))
        {
            Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
            i.putExtra("data", 36);
            startActivity(i);
        }

        else if
                ((Constanta.unsur1Temp == 112 && Constanta.unsur2Temp == 22 && Constanta.unsur3Temp == 64) ||
                        (Constanta.unsur1Temp == 112 && Constanta.unsur2Temp == 64 && Constanta.unsur3Temp == 22) ||

                        (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 112 && Constanta.unsur3Temp == 22) ||
                        (Constanta.unsur1Temp == 64 && Constanta.unsur2Temp == 22 && Constanta.unsur3Temp == 112) ||

                        (Constanta.unsur1Temp == 22 && Constanta.unsur2Temp == 112 && Constanta.unsur3Temp == 64) ||
                        (Constanta.unsur1Temp == 22 && Constanta.unsur2Temp == 64 && Constanta.unsur3Temp == 112))
        {
            Intent i = new Intent(getActivity(), Scrolling_senyawa_activity.class);
            i.putExtra("data", 37);
            startActivity(i);
        }

        //campuran 3 unsur selesai
        else{
            Toast.makeText(getActivity(), "Sangat disayangkan pencampuran gagal, coba lagi!", LENGTH_SHORT).show();
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chemilation, container, false);

        mix = (Button) view.findViewById(R.id.mix);
        mix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Constanta.unsur1Temp != -1 && Constanta.unsur2Temp != -1){
                    cekUnsurMixan();
                }else{
                    Toast.makeText(getActivity(),"Anda harus memilih 2 atau 3 unsur yang berbeda", LENGTH_SHORT).show();
                }
            }
        });

        Tmp tmp = new Tmp();
        ArrayList<Integer> myImageList = new ArrayList<>();
        myImageList.add(R.drawable.actinium);
        myImageList.add(R.drawable.allumunium);
        myImageList.add(R.drawable.americium);
        myImageList.add(R.drawable.antimony);
        myImageList.add(R.drawable.argentum);
        myImageList.add(R.drawable.argon);
        myImageList.add(R.drawable.arsenic);
        myImageList.add(R.drawable.astatine);
        myImageList.add(R.drawable.aurum);
        myImageList.add(R.drawable.barium);
        myImageList.add(R.drawable.berilium);
        myImageList.add(R.drawable.berkelium);
        myImageList.add(R.drawable.bismuth);
        myImageList.add(R.drawable.bohrium);
        myImageList.add(R.drawable.borron);
        myImageList.add(R.drawable.bromine);
        myImageList.add(R.drawable.cadmium);
        myImageList.add(R.drawable.callifornium);
        myImageList.add(R.drawable.calsium);
        myImageList.add(R.drawable.carbon);
        myImageList.add(R.drawable.cerium);
        myImageList.add(R.drawable.chlorine);
        myImageList.add(R.drawable.chromium);
        myImageList.add(R.drawable.cobalt);
        myImageList.add(R.drawable.copper);
        myImageList.add(R.drawable.curium);
        myImageList.add(R.drawable.darmstadtium);
        myImageList.add(R.drawable.dubnium);
        myImageList.add(R.drawable.dysprosium);
        myImageList.add(R.drawable.einstenium);
        myImageList.add(R.drawable.erbium);
        myImageList.add(R.drawable.europium);
        myImageList.add(R.drawable.fermium);
        myImageList.add(R.drawable.flourine);
        myImageList.add(R.drawable.fransium);
        myImageList.add(R.drawable.gadolinium);
        myImageList.add(R.drawable.gallium);
        myImageList.add(R.drawable.germanium);
        myImageList.add(R.drawable.hafnium);
        myImageList.add(R.drawable.helium);
        myImageList.add(R.drawable.hidrogen);
        myImageList.add(R.drawable.holmium);
        myImageList.add(R.drawable.indium);
        myImageList.add(R.drawable.iodine);
        myImageList.add(R.drawable.iridium);
        myImageList.add(R.drawable.kripton);
        myImageList.add(R.drawable.lanthanum);
        myImageList.add(R.drawable.lawrencium);
        myImageList.add(R.drawable.lithium);
        myImageList.add(R.drawable.lutetium);
        myImageList.add(R.drawable.magnesium);
        myImageList.add(R.drawable.mangan);
        myImageList.add(R.drawable.meitnerium);
        myImageList.add(R.drawable.mendelevium);
        myImageList.add(R.drawable.mercury);
        myImageList.add(R.drawable.molybdenum);
        myImageList.add(R.drawable.natrium);
        myImageList.add(R.drawable.neodymium);
        myImageList.add(R.drawable.neon);
        myImageList.add(R.drawable.neptunium);
        myImageList.add(R.drawable.nickel);
        myImageList.add(R.drawable.niobium);
        myImageList.add(R.drawable.nitrogen);
        myImageList.add(R.drawable.nobelium);
        myImageList.add(R.drawable.oxygen);
        myImageList.add(R.drawable.palladium);
        myImageList.add(R.drawable.phosporus);
        myImageList.add(R.drawable.platinum);
        myImageList.add(R.drawable.plumbum);
        myImageList.add(R.drawable.plutonium);
        myImageList.add(R.drawable.polonium);
        myImageList.add(R.drawable.praseodymium);
        myImageList.add(R.drawable.promethium);
        myImageList.add(R.drawable.protactinum);
        myImageList.add(R.drawable.radium);
        myImageList.add(R.drawable.radon);
        myImageList.add(R.drawable.rhenium);
        myImageList.add(R.drawable.rhodium);
        myImageList.add(R.drawable.roentgenium);
        myImageList.add(R.drawable.rutherfornium);
        myImageList.add(R.drawable.ruthernium);
        myImageList.add(R.drawable.samarium);
        myImageList.add(R.drawable.scandium);
        myImageList.add(R.drawable.seaborgium);
        myImageList.add(R.drawable.selenium);
        myImageList.add(R.drawable.sesium);
        myImageList.add(R.drawable.silicon);
        myImageList.add(R.drawable.stannum);
        myImageList.add(R.drawable.stronsium);
        myImageList.add(R.drawable.tantalum);
        myImageList.add(R.drawable.technetium);
        myImageList.add(R.drawable.tellurium);
        myImageList.add(R.drawable.terbium);
        myImageList.add(R.drawable.thallium);
        myImageList.add(R.drawable.thorium);
        myImageList.add(R.drawable.thulium);
        myImageList.add(R.drawable.titanium);
        myImageList.add(R.drawable.tungsten);
        myImageList.add(R.drawable.ununbium);
        myImageList.add(R.drawable.ununhexium);
        myImageList.add(R.drawable.ununoctium);
        myImageList.add(R.drawable.ununpentium);
        myImageList.add(R.drawable.ununquadium);
        myImageList.add(R.drawable.ununseptium);
        myImageList.add(R.drawable.ununtrium);
        myImageList.add(R.drawable.uranium);
        myImageList.add(R.drawable.vanadium);
        myImageList.add(R.drawable.xenon);
        myImageList.add(R.drawable.ytterbium);
        myImageList.add(R.drawable.yttrium);
        myImageList.add(R.drawable.zinc);
        myImageList.add(R.drawable.zirconium);
        myImageList.add(R.drawable.kalium);
        myImageList.add(R.drawable.sulfur);
        myImageList.add(R.drawable.osmium);
        myImageList.add(R.drawable.ferum);

        myImageList.add(R.drawable.add);



        if(tmp.getIndexPil1() == -1)
        {
            btn1 = (LinearLayout) view.findViewById(R.id.unsur1);
            ImageView img= (ImageView) btn1.findViewById(R.id.image1);
            img.setImageResource(R.drawable.add);
        }
        else
        {
            btn1 = (LinearLayout) view.findViewById(R.id.unsur1);
            judul = (TextView) view.findViewById(R.id.unsur_name1);
            ImageView img= (ImageView) btn1.findViewById(R.id.image1);
            img.setImageResource(myImageList.get(tmp.getIndexPil1()));
            Constanta.unsur1Temp = tmp.getIndexPil1();
            judul.setText(Constanta.judul[tmp.getIndexPil1()]);
        }

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Tmp().setFrom(1);
                Intent toUnsur = new Intent(getActivity(), ChemilationUnsur1.class);
                startActivity(toUnsur);
            }
        });




        if(tmp.getIndexPil2() == -1)
        {
            btn2 = (LinearLayout) view.findViewById(R.id.unsur2);
            ImageView img= (ImageView) btn2.findViewById(R.id.image2);
            img.setImageResource(R.drawable.add);
        }
        else
        {
            btn2 = (LinearLayout) view.findViewById(R.id.unsur2);
            judul2 = (TextView) view.findViewById(R.id.unsur_name2);
            ImageView img= (ImageView) btn2.findViewById(R.id.image2);
            img.setImageResource(myImageList.get(tmp.getIndexPil2()));

            Constanta.unsur2Temp = tmp.getIndexPil2();
            judul2.setText(Constanta.judul[tmp.getIndexPil2()]);
        }
        btn2 = (LinearLayout) view.findViewById(R.id.unsur2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new Tmp().setFrom(2);
                Intent toUnsur = new Intent(getActivity(), ChemilationUnsur1.class);
                startActivity(toUnsur);

            }
        });




        if(tmp.getIndexPil3() == -1)
        {
            btn3 = (LinearLayout) view.findViewById(R.id.unsur3);
            ImageView img= (ImageView) btn3.findViewById(R.id.image3);
            img.setImageResource(R.drawable.add);
        }
        else
        {
            btn3 = (LinearLayout) view.findViewById(R.id.unsur3);
            judul3 = (TextView) view.findViewById(R.id.unsur_name3);
            ImageView img= (ImageView) btn3.findViewById(R.id.image3);
            img.setImageResource(myImageList.get(tmp.getIndexPil3()));

            Constanta.unsur3Temp = tmp.getIndexPil3();
            judul3.setText(Constanta.judul[tmp.getIndexPil3()]);
        }
        btn3 = (LinearLayout) view.findViewById(R.id.unsur3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new Tmp().setFrom(3);
                Intent toUnsur = new Intent(getActivity(), ChemilationUnsur1.class);
                startActivity(toUnsur);

            }
        });


        return view;
    }

}
