package com.example.pau.prac01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class ActivitatPrincipal extends AppCompatActivity {

    EditText txtNom;
    EditText txtCognom;
    EditText txtEdat;
    CheckBox checkBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitat_principal);

        txtNom = (EditText)findViewById(R.id.txtNom);
        txtCognom = (EditText)findViewById(R.id.txtCognom);
        txtEdat = (EditText)findViewById(R.id.txtEdat);
        checkBox = (CheckBox)findViewById(R.id.checkBox);

    }

    public void premBoto(View v)
    {
        Bundle b = new Bundle();

        b.putString("nom",txtNom.getText().toString());

        b.putString("cognom",txtCognom.getText().toString());

        b.putString("edat",txtEdat.getText().toString());

        b.putBoolean("check",checkBox.isChecked());

        Intent intencio = new Intent(ActivitatPrincipal.this, SegonaActivitat.class);
        intencio.putExtras(b);

        startActivity(intencio);


    }
}
