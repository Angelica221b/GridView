package agtzm.ejem008gridview;

import android.graphics.Bitmap;

/**
 * Created by dell on 02/02/2018.
 */

public class item {
    private Bitmap image = null;
    private String name = null;


    public item(Bitmap image,String titulo){
        this.image = image;
        this.name = titulo;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}