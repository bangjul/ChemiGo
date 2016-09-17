package inducesmile.com.androidtabwithswipe;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by bangjul on 09/12/2015.
 */
public class ChemiwhatFragment extends Fragment {

    ImageView img,img2,img3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_chemiwhat, container, false );

        img = (ImageView) view.findViewById(R.id.ivUnsur);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toUnsur = new Intent(getActivity(), Unsur.class);
                startActivity(toUnsur);
            }
        });

        img2 = (ImageView) view.findViewById(R.id.ivSenyawa);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSenyawa = new Intent(getActivity(), Senyawa.class);
                startActivity(toSenyawa);
            }
        });

        img3 = (ImageView) view.findViewById(R.id.ivCampuran);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toCampuran = new Intent(getActivity(), Campuran.class);
                startActivity(toCampuran);
            }
        });

        return view;
    }

}