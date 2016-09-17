package inducesmile.com.androidtabwithswipe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import inducesmile.com.androidtabwithswipe.model.ItemSenyawa;

/**
 * Created by bangjul on 21/12/2015.
 */
public class ImageAdapter1 extends BaseAdapter {

    private Context mContext;
    private ArrayList<ItemSenyawa> arrayList;
    private LayoutInflater mInflater;

    public ImageAdapter1(Context c, ArrayList<ItemSenyawa> arrayList) {
        mContext = c;
        this.arrayList = arrayList;
        mInflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return arrayList.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public class Holder
    {
        TextView tv;
        ImageView img;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = null;
        if(convertView == null){
            holder = new Holder();
            convertView = mInflater.inflate(R.layout.judul, null);
            holder.tv = (TextView) convertView.findViewById(R.id.text);
            holder.img = (ImageView) convertView.findViewById(R.id.gambar);
            convertView.setTag(holder);
        }else {
            holder = (Holder) convertView.getTag();
        }
        holder.tv.setText(arrayList.get(position).getName());
        holder.img.setImageResource(arrayList.get(position).getImage());
        return convertView;
    }

    // references to our images
    public static Integer[] mThumbIds = {

            R.drawable.senyawa_air, R.drawable.senyawa_amonia,
            R.drawable.senyawa_silika, R.drawable.senyawa_lithium_flourine,
            R.drawable.senyawa_aniline,
            R.drawable.senyawa_asam_klorida, R.drawable.senyawa_aspirin,
            R.drawable.senyawa_barium_klorida, R.drawable.senyawa_benzena,
            R.drawable.senyawa_besi_2_sulfida, R.drawable.senyawa_cacl,
            R.drawable.senyawa_dietil_eter, R.drawable.senyawa_emas_klorida,
            R.drawable.senyawa_etilena, R.drawable.senyawa_fosfin,
            R.drawable.senyawa_hidrogen_sulfida, R.drawable.senyawa_kalium_iodida,
            R.drawable.senyawa_kalsium_asetat, R.drawable.senyawa_karbon_dioksida,
            R.drawable.senyawa_karbon_monoksida, R.drawable.senyawa_kromium_klorida,
            R.drawable.senyawa_mangan_oksida,
            R.drawable.senyawa_metana, R.drawable.senyawa_natrium_sulfat,
            R.drawable.senyawa_nitrogen_oksida, R.drawable.senyawa_ozone,
            R.drawable.senyawa_perak_nitrat, R.drawable.senyawa_tembaga_ii_sulfat,
            R.drawable.senyawa_nacl, R.drawable.senyawa_al2o3,
            R.drawable.senyawa_naoh, R.drawable.senyawa_h2so4,
            R.drawable.senyawa_ccl4, R.drawable.senyawa_koh,
            R.drawable.senyawa_pcl5, R.drawable.senyawa_kalium_klor,
            R.drawable.senyawa_kmno4, R.drawable.senyawa_k2cr2o7,
            R.drawable.senyawa_hf, R.drawable.senyawa_naf,
            R.drawable.senyawa_sf6

    };

}
