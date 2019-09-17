package com.example.student.nlna_cau1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Cau2 extends AppCompatActivity {

    Button btnSolve;
    EditText edtResult;

    final int SOLVE = 510;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau2);

        edtResult = findViewById(R.id.edtResult);
        btnSolve = findViewById(R.id.btnSolve);

        btnSolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cau2.this,cau2b.class);
                startActivityForResult(intent,SOLVE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == SOLVE) {
            if(resultCode == RESULT_OK) {
                String result = data.getStringExtra("result");

                edtResult.setText(result);
            }
        }
    }
}
