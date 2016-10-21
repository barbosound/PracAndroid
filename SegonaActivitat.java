package com.example.pau.prac01;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SegonaActivitat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segona_activitat);



        TextView label_nom = (TextView)findViewById(R.id.label_nom);

        TextView label_cognom = (TextView)findViewById(R.id.label_cognom);

        TextView label_edat = (TextView)findViewById(R.id.label_edat);

        TextView label_check = (TextView)findViewById(R.id.checkBox);

        Bundle b = getIntent().getExtras();

        Button toast = (Button)findViewById(R.id.button);

        final String nom = b.getString("nom");

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast1 = Toast.makeText(getApplicationContext(),"Usuari: "+ nom, Toast.LENGTH_LONG);

                toast1.show();

            }
        });



        if (b.getBoolean("check") == true){

            label_nom.setText(b.getString("nom"));

            label_cognom.setText(b.getString("cognom"));

            label_edat.setText(b.getString("edat"));

        }



    }


}
