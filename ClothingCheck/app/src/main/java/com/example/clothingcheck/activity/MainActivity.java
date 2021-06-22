package com.example.clothingcheck.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import com.example.clothingcheck.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
    private FirebaseAuth user = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*logout*/
        user.signOut();
        /*login*/
        user.signInWithEmailAndPassword().addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull @org.jetbrains.annotations.NotNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Log.i("signIn", "Sucesso ao Logar usuario!")
                }else {
                    Log.i("signIn","Erro ao Logar usuario!")
                }
            }
        })

        if( user.getCurrentUser() != null){
            Log.i("CreateUser", "Usuario logado!")
        }else {
            Log.i("CreateUser","Usuario não logado!")
        }

        /*cadastro usuario*/
        user.createUserWithEmailAndPassword().addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull @org.jetbrains.annotations.NotNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Log.i("CreateUser", "Sucesso ao Cadastrar usuario!")
                }else {
                    Log.i("CreateUser","Erro ao Cadastrar usuario!")
                }
            }
        });
    }
}