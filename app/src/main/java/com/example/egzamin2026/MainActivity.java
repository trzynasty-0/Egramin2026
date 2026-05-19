package com.example.egzamin2026;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ImageView zdjecieTV;
    private TextView trescTV;
    private RadioGroup odpowiedzi;
    private Button dalejB;
    private int punkty = 0;
    private int poziom = 0;
    private char odpowiedzChar;
    private RadioButton radioA, radioB, radioC;
    private ArrayList<PytanieZamkniete> pytania = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        zdjecieTV = findViewById(R.id.imageView);
        trescTV = findViewById(R.id.trescTV);
        odpowiedzi = findViewById(R.id.radioGroup);
        dalejB = findViewById(R.id.button);
        radioA = findViewById(R.id.radioA);
        radioB = findViewById(R.id.radioB);
        radioC = findViewById(R.id.radioC);

        odpowiedzi.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(@NonNull RadioGroup radioGroup, int i) {
                        RadioButton odpowiedz = findViewById(odpowiedzi.getCheckedRadioButtonId());
                        odpowiedzChar = odpowiedz.getHint().charAt(0);
                    }
                }
        );
        pytania.add(new PytanieZamkniete("Które to schronisko?", R.drawable.zad1, "Na Rysiance.", "Na Wielkiej Raczy.", "Na Wielkiej Rycerzowej.", 'B'));
        pytania.add(new PytanieZamkniete("Zwierzę na zdjęciu to?", R.drawable.zad2, "owczarek.", "wilk.", "kozica.", 'A'));
        pytania.add(new PytanieZamkniete("W oddali są widoczne?", R.drawable.zad3, "Himalaje.", "Alpy.", "Tatry.", 'C'));

        dalejB.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(poziom < pytania.size() - 1){
                            poziom++;

                        }
                        else{
                            poziom = 0;
                        }
                        if(pytania.get(poziom).SprawdzaniePoprawnosci(odpowiedzChar)){
                            punkty++;
                        }
                        zdjecieTV.setImageResource(pytania.get(poziom).nazwaZdjecia);
                        trescTV.setText(pytania.get(poziom).trescPytania);
                        radioA.setText(pytania.get(poziom).getTrescA());
                        radioB.setText(pytania.get(poziom).getTrescB());
                        radioC.setText(pytania.get(poziom).getTrescC());

                    }
                }
        );



    }
}