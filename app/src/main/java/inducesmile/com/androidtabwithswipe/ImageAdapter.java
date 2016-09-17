package inducesmile.com.androidtabwithswipe;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by bangjul on 20/12/2015.
 */
public class ImageAdapter  extends BaseAdapter {

    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }


    // references to our images
    public static Integer[] mThumbIds = {
            R.drawable.actinium, R.drawable.allumunium,
            R.drawable.americium, R.drawable.antimony,
            R.drawable.argentum, R.drawable.argon,
            R.drawable.arsenic, R.drawable.astatine,
            R.drawable.aurum, R.drawable.barium,
            R.drawable.berilium, R.drawable.berkelium,
            R.drawable.bismuth, R.drawable.bohrium,
            R.drawable.borron, R.drawable.bromine,
            R.drawable.cadmium, R.drawable.callifornium,
            R.drawable.calsium, R.drawable.carbon,
            R.drawable.cerium, R.drawable.chlorine,
            R.drawable.chromium, R.drawable.cobalt,
            R.drawable.copper, R.drawable.curium,
            R.drawable.darmstadtium, R.drawable.dubnium,
            R.drawable.dysprosium, R.drawable.einstenium,
            R.drawable.erbium, R.drawable.europium,
            R.drawable.fermium, R.drawable.flourine,
            R.drawable.fransium, R.drawable.gadolinium,
            R.drawable.gallium, R.drawable.germanium,
            R.drawable.hafnium, R.drawable.helium,
            R.drawable.hidrogen, R.drawable.holmium,
            R.drawable.indium, R.drawable.iodine,
            R.drawable.iridium, R.drawable.kripton,
            R.drawable.lanthanum, R.drawable.lawrencium,
            R.drawable.lithium, R.drawable.lutetium,
            R.drawable.magnesium, R.drawable.mangan,
            R.drawable.meitnerium, R.drawable.mendelevium,
            R.drawable.mercury, R.drawable.molybdenum,
            R.drawable.natrium, R.drawable.neodymium,
            R.drawable.neon, R.drawable.neptunium,
            R.drawable.nickel, R.drawable.niobium,
            R.drawable.nitrogen, R.drawable.nobelium,
            R.drawable.oxygen, R.drawable.palladium,
            R.drawable.phosporus, R.drawable.platinum,
            R.drawable.plumbum, R.drawable.plutonium,
            R.drawable.polonium, R.drawable.praseodymium,
            R.drawable.promethium, R.drawable.protactinum,
            R.drawable.radium, R.drawable.radon,
            R.drawable.rhenium, R.drawable.rhodium,
            R.drawable.roentgenium, R.drawable.rutherfornium,
            R.drawable.ruthernium, R.drawable.samarium,
            R.drawable.scandium, R.drawable.seaborgium,
            R.drawable.selenium, R.drawable.sesium,
            R.drawable.silicon, R.drawable.stannum,
            R.drawable.stronsium, R.drawable.tantalum,
            R.drawable.technetium, R.drawable.tellurium,
            R.drawable.terbium, R.drawable.thallium,
            R.drawable.thorium, R.drawable.thulium,
            R.drawable.titanium, R.drawable.tungsten,
            R.drawable.ununbium, R.drawable.ununhexium,
            R.drawable.ununoctium, R.drawable.ununpentium,
            R.drawable.ununquadium, R.drawable.ununseptium,
            R.drawable.ununtrium, R.drawable.uranium,
            R.drawable.vanadium, R.drawable.xenon,
            R.drawable.ytterbium, R.drawable.yttrium,
            R.drawable.zinc, R.drawable.zirconium,
            R.drawable.kalium, R.drawable.sulfur,
            R.drawable.osmium, R.drawable.ferum,
            R.drawable.add
    };

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {

        return position;
    }

    public long getItemId(int position) {
        return 0;
    }


    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }



}
