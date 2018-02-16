package agtzm.ejem008gridview;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class App extends AppCompatActivity {
    private GridView gridView = null;
    private itemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        gridView = (GridView)findViewById(R.id.gridView);

        adapter = new itemAdapter(this,R.layout.row_grid,fillImages());
        gridView.setAdapter(adapter);
    }

    private ArrayList<item> fillImages(){
        final int values = Integer.parseInt(getResources().getString(R.string.howmanyImages));
        final ArrayList<item> lista = new ArrayList<>();

        final ArrayList<item> lis = new ArrayList<>();
        for(int i=0; i<=values; i++) {

            final Bitmap bitmap = BitmapFactory.decodeResource(getResources(), getResources().getIdentifier(
                    "sample_" + i, "drawable", "agtzm.ejem008gridview")); //llenar
            lista.add(new item(bitmap,"sample_"+i));//agrega
        }

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int position, long id) {


                final AlertDialog.Builder dialog = new AlertDialog.Builder(App.this);
                dialog.setTitle("Image");
                final ImageView showImage = new ImageView(App.this);
                String n = "Sample_";
                Toast.makeText(App.this, "Sample_"+position, Toast.LENGTH_SHORT).show();

                //for(int i=0; i<=values; i++) {


                final Bitmap bit = BitmapFactory.decodeResource(getResources(), getResources().getIdentifier(
                        "sample_" + position, "drawable", "agtzm.ejem008gridview")); //llenar
                showImage.setImageBitmap(bit);
                dialog.setView(showImage); //muestra imagen*/


                dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int p) {

                    }
                });
                final AlertDialog alert = dialog.create();

                alert.show();
            }
        });





        return lista;
    }
}