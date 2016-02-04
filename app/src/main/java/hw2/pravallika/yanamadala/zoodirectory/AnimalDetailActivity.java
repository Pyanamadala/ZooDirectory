package hw2.pravallika.yanamadala.zoodirectory;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalDetailActivity extends MainActivity  {
    String value="";
    private TextView text;
    private ImageView imageName;
    private TextView detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_animal_detail);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getString("AnimalName");
        }

        text =(TextView)findViewById(R.id.title);
        text.setText(value.toUpperCase());

        detail=(TextView)findViewById(R.id.description);
        imageName=(ImageView)findViewById(R.id.image);

       if(value.equals("Tiger")){
            imageName.setImageResource(R.drawable.tiger2);
            detail.setText(getResources().getString(R.string.tiger));
        }
        if(value.equals("Lion")){
            imageName.setImageResource(R.drawable.lion2);
            detail.setText(getResources().getString(R.string.lion));
        }
        if(value.equals("Panda")){
            imageName.setImageResource(R.drawable.panda2);
            detail.setText(getResources().getString(R.string.panda));
        }
        if(value.equals("Koala")){
            imageName.setImageResource(R.drawable.koala2);
            detail.setText(getResources().getString(R.string.koala));
        }
        if(value.equals("Zebra")){
            imageName.setImageResource(R.drawable.zebra2);
            detail.setText(getResources().getString(R.string.zebra));
        }
        if(value.equals("Monkey")){
            imageName.setImageResource(R.drawable.monkey2);
            detail.setText(getResources().getString(R.string.monkey));
        }
        if(value.equals("Elephant")){
            imageName.setImageResource(R.drawable.elephant2);
            detail.setText(getResources().getString(R.string.elephant));
        }
}

    }



