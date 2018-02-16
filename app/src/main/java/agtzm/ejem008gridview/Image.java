package agtzm.ejem008gridview;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.FileObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;

public class Image extends AppCompatActivity {
    ImageView imageV;
    private itemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image);

        //Intent intent = getIntent();
        //File f = intent.getExtras().getParcelable("img");
        //String f = getIntent().getStringExtra("img");

       // imageV = findViewById(R.id.viewImage);
        //imageV.getImageAlpha(adapter.getView());

    }

}
