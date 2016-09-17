package inducesmile.com.androidtabwithswipe.model;

/**
 * Created by bangjul on 06/01/2016.
 */
public class ItemSenyawa {
    String name;
    int image;

    public ItemSenyawa(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
