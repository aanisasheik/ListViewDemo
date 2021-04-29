package com.appers.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> arraylist=new ArrayList<>();

        arraylist.add("Hi everyone");
        arraylist.add("Hi Mummy");
        arraylist.add("Hi Daddy");
        arraylist.add("Hi Uncle");
        arraylist.add("Hi granny");
        arraylist.add("Hi Baby");

        listView=findViewById(R.id.list_view);
        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.simple_list_item,R.id.textView,arraylist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Toast.makeText(MainActivity.this,"clicked item" +position+ " "+arraylist.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
