package com.example.student.nlna_cau1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class cau2b extends AppCompatActivity {

    private EditText edtA,edtB,edtC;
    private Button btnSendBack;
    private static String ketqua = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau2b);

        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtC = findViewById(R.id.edtC);

        btnSendBack = findViewById(R.id.btnSendBack);

        btnSendBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a,b,c;

                if(edtA.getText().toString().trim().isEmpty() || edtB.getText().toString().trim().isEmpty() || edtC.getText().toString().isEmpty()) {
                    Intent intent = new Intent();
                    intent.putExtra("result","Không thể giải do không nhập");

                    setResult(RESULT_OK,intent);
                    finish();
                }
                else {
                    a = Float.parseFloat(edtA.getText().toString());
                    b = Float.parseFloat(edtB.getText().toString());
                    c = Float.parseFloat(edtC.getText().toString());

                    giaiPTBac2(a,b,c);
                }

                Intent intent = new Intent();
                intent.putExtra("result",ketqua);

                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

    public static void giaiPTBac2(float a, float b, float c) {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                ketqua =  "Phương trình vô nghiệm!";
            } else {
                ketqua = "Phương trình có một nghiệm: " + "x = " + (-c / b);
            }
            return;
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            ketqua = "Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2;
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            ketqua = "Phương trình có nghiệm kép: " + "x1 = x2 = " + x1;
        } else {
            ketqua = "Phương trình vô nghiệm!";
        }
    }

}
