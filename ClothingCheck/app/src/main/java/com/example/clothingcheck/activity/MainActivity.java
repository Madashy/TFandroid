package com.example.clothingcheck.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;

import com.example.clothingcheck.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;

public class MainActivity extends IntroActivity {

    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
    private FirebaseAuth user = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide( new FragmentSlide.Builder()
                .background(android.R.color.holo_purple)
                .fragment(R.layout.intro_1)
                .build()
                );

        addSlide( new FragmentSlide.Builder()
                .background(android.R.color.holo_purple)
                .fragment(R.layout.intro_2)
                .build()
        );
        addSlide( new FragmentSlide.Builder()
                .background(android.R.color.holo_purple)
                .fragment(R.layout.intro_cadastro)
                .build()
        );

        }
        public void btEntrar(View view){
            startActivity(new Intent(this, LoginActivity.class));
        }
        public void btCadastrar(View view){
            startActivity(new Intent(this, CadastroActivity.class ));

    }
    }
