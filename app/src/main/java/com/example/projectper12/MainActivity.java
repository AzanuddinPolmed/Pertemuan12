package com.example.projectper12;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button blogin;
    EditText eduser,edpass;

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
        EditText eduser = findViewById(R.id.editUsername);
        EditText edpass = findViewById(R.id.editPassword);
        Button blogin = findViewById(R.id.btnlogin);

        blogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = eduser.getText().toString();
                String password = edpass.getText().toString();
                if (username.equals("udin@gmail.com") && password.equals("12345")){
                    startActivity(new Intent(MainActivity.this, MenuUtama.class));
                    finish();
                }else {
                    Toast.makeText(MainActivity.this, "Username dan Password Salah", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}