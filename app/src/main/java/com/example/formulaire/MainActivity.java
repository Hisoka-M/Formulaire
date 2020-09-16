package com.example.formulaire;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends Activity {
    private RadioGroup radioGroupDiffLevel;
    private RadioButton radioButtonEasy;
    private RadioButton radioButtonMedium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void VersionNominative(View view){
        setContentView(R.layout.activity_main);
    }
    public void VersionCompte(View view){
        setContentView(R.layout.version_compte);
    }

    public void clickVersionNominative(View view) {

        // Declaration des variables
        AlertDialog recap;
        EditText etPrenom, etNom, etDateNaiss, etLieuNaiss, etAdresse;

        // radios civilite
        RadioGroup radioGroupCivilite;
        radioGroupCivilite = findViewById(R.id.RgSexe);
        RadioButton radioButton;
        int radioId = radioGroupCivilite.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

        // radios hobbies
        RadioGroup radioGroupHobbies;
        radioGroupHobbies = findViewById(R.id.RgHobbies);
        RadioButton radioButton2;
        int radioId2 = radioGroupHobbies.getCheckedRadioButtonId();
        radioButton2 = findViewById(radioId2);

        // edit text
        etPrenom = (EditText) findViewById(R.id.etPrenom);
        etNom = (EditText) findViewById(R.id.etNom);
        etDateNaiss = (EditText) findViewById(R.id.etDateNaiss);
        etLieuNaiss = (EditText) findViewById(R.id.etLieuNaiss);
        etAdresse = (EditText) findViewById(R.id.etAdresse);

        if (etNom.getText().toString().trim().equalsIgnoreCase("")) {
            etNom.setError("This field can not be blank");
        } else {
            etNom.setError(null);
        }
        if (etPrenom.getText().toString().trim().equalsIgnoreCase("")) {
            etPrenom.setError("This field can not be blank");
        } else {
            etPrenom.setError(null);
        }
        if (etDateNaiss.getText().toString().trim().equalsIgnoreCase("")) {
            etDateNaiss.setError("This field can not be blank");
        } else {
            etDateNaiss.setError(null);
        }
        if (etLieuNaiss.getText().toString().trim().equalsIgnoreCase("")) {
            etLieuNaiss.setError("This field can not be blank");
        } else {
            etLieuNaiss.setError(null);
        }
        if (etAdresse.getText().toString().trim().equalsIgnoreCase("")) {
            etAdresse.setError("This field can not be blank");
        } else {
            etAdresse.setError(null);
        }
        // Boite de dialogue
        recap = new AlertDialog.Builder(this).create();
        recap.setTitle("Bienvenue" + " " + radioButton.getText() + " " + etNom.getText() + " " + etPrenom.getText());
        recap.setMessage("Date de Naissance :" + etDateNaiss.getText() + "\n" + "Lieu de Naissance :" + etLieuNaiss.getText() + "\n" + "Adresse :" + etAdresse.getText() + "\n" + "Hobbies :" + radioButton2.getText());
        recap.show();
    }
    public void clickVersionCompte(View view) {

        // Declaration des variables
        AlertDialog recap;
        EditText etPrenomVersionCompte, etNomVersionCompte;
        etPrenomVersionCompte = (EditText) findViewById(R.id.etPrenom);
        etNomVersionCompte = (EditText) findViewById(R.id.etNom);

        // radios civilite
        RadioGroup radioGroupCiviliteVersionCompte;
        radioGroupCiviliteVersionCompte = findViewById(R.id.RgSexe);
        RadioButton radioButton;
        int radioIdVersionCompte = radioGroupCiviliteVersionCompte.getCheckedRadioButtonId();
        radioButton = findViewById(radioIdVersionCompte);

        if (etPrenomVersionCompte.getText().toString().trim().equalsIgnoreCase("")) {
            etPrenomVersionCompte.setError("This field can not be blank");
        } else {
            etPrenomVersionCompte.setError(null);
        }
        if (etNomVersionCompte.getText().toString().trim().equalsIgnoreCase("")) {
            etNomVersionCompte.setError("This field can not be blank");
        } else {
            etNomVersionCompte.setError(null);
        }
        // Boite de dialogue
        recap = new AlertDialog.Builder(this).create();
        recap.setTitle("Bienvenue" + " " + radioButton.getText() + " " + etNomVersionCompte.getText() + " " + etPrenomVersionCompte.getText());
        recap.show();
    }
}
