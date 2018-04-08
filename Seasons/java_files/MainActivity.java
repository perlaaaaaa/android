package pl.edu.zslp.seasons;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    int [] picture;
    String [] seasons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         /* Defined Array values to show in ListView */
        seasons= new String[]{getString(R.string.spring),
                getString(R.string.summer),
                getString(R.string.autumn),
                getString(R.string.winter)};
        picture= new int[]{R.drawable.spring, R.drawable.summer, R.drawable.autumn, R.drawable.winter};

        /* Get ListView object from xml*/
        ListView lv=(ListView)findViewById(R.id.lv);

        /* Creating array adapter, it is responsible for making view for each item*/
        ArrayAdapter myAdapter=new ArrayAdapter(this,
                android.R.layout.simple_expandable_list_item_1,seasons);

        /* Assign adapter to ListView*/
        lv.setAdapter(myAdapter);
        lv.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        TextView wynik=(TextView)view;
        Intent secondIntend=new Intent(getApplicationContext(),Season.class);
        secondIntend.putExtra("key",wynik.getText());
        secondIntend.putExtra("key1",picture[i]);
        startActivity(secondIntend);

    }
}

