package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView lvYear;
    ArrayAdapter aa;
    ArrayList<Year> year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvYear = (ListView) this.findViewById(R.id.lvYear);

        // Create a few food objects in Food array
        year = new ArrayList<Year>();
        year.add(new Year("Year 1"));
        year.add(new Year("Year 2"));
        year.add(new Year("Year 3"));

        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new YearAdapter(this, R.layout.year_row, year);
        lvYear.setAdapter(aa);

        lvYear.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    String yearnumber
                    Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                    i.putExtra("year1", year[0]);
                    startActivity(i);
                } else if (position == 1) {
                    Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                    i.putExtra("year2", );
                    startActivity(i);
                } else {
                    Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                    i.putExtra("year3", info);
                    startActivity(i);
                }
            }
        });
    }
}
