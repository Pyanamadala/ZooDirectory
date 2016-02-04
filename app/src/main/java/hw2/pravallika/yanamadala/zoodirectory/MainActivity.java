package hw2.pravallika.yanamadala.zoodirectory;

import android.app.DialogFragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AlertDialogFragment.NoticeDialogListener {
    List<Animal> animals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lview = (ListView) findViewById(R.id.listView);
        animals = new ArrayList();
        animals.add(new Animal("Lion","Lion1.jpeg"));
        animals.add(new Animal("Panda", "Panda1.jpg"));
        animals.add(new Animal("Koala", "Koala1.jpeg"));
        animals.add(new Animal("Zebra", "Zebra1.jpeg"));
        animals.add(new Animal("Monkey","Monkey1.jpeg"));
        animals.add(new Animal("Elephant", "Elephant1.jpeg"));
        animals.add(new Animal("Tiger","Tiger1.jpeg"));

                lview.setAdapter(new CustomAdapter(this, R.layout.custom_row, animals));
                lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        if (((animals.get(position)).getName()).equals("Tiger")) {
                            AlertDialogFragment fragment = new AlertDialogFragment();
                            fragment.show(MainActivity.this.getFragmentManager(), "question");
                        } else {
                            Intent detailIntent = new Intent(MainActivity.this, AnimalDetailActivity.class);
                            detailIntent.putExtra("AnimalName", (animals.get(position)).getName());
                            startActivity(detailIntent);
                        }
                    }
                });
       /** Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/
    }
    public void onDialogPositiveClick(DialogFragment dialog) {
        Intent detailIntent = new Intent(MainActivity.this, AnimalDetailActivity.class);
        detailIntent.putExtra("AnimalName", "Tiger");
        startActivity(detailIntent);
    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog) {

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_uninstall) {
            Intent uninstallIntent = new Intent(Intent.ACTION_DELETE, Uri.parse("package:hw2.pravallika.yanamadala.zoodirectory"));
            startActivity(uninstallIntent);
            return true;
        }
        else{
            Intent infoIntent = new Intent(this,ZooInfoActivity.class);
            startActivity(infoIntent);
        }

        return super.onOptionsItemSelected(item);
    }
}
