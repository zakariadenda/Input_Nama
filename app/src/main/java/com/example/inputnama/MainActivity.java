package com.example.inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText namaEditText;
    private TextView namaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namaEditText = findViewById(R.id.namaEditText);
        namaTextView = findViewById(R.id.namaTextView);
    }
    public void tampilkan(View view) {
        String nama = namaEditText.getText().toString();
        namaTextView.setText(getString(R.string.nama_anda,nama));
    }
}