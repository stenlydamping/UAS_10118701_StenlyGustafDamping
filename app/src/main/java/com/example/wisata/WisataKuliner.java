//12082021_10118701_StenlyGustafDamping_IF10
package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WisataKuliner extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_kuliner);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Yoghurt Cisankuy","Kampung Daun","Lisung Resto","The Stone Cafe Bandung","Kopi Ireng","Sate Pak Gino Bandung","Warunk Upnormal Bandung","Jigoku Ramen Bandung","Nasi Goreng Mafia Bandung","Boemi Joglo","Sate Padang Ajo","Bebek Garang","Iga Bakar Mas Giri","Sapu Lidi","The Valley Bistro Café"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), YughurtCisangkuy.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), KampungDaun.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
}