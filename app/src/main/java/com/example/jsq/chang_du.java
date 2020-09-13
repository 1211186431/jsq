package com.example.jsq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class chang_du extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chang_du);
    }


    public void onclickChang_zhuan(View view) {
        EditText textView=findViewById(R.id.c_before);
        String b= textView.getText().toString();
        double before=Double.parseDouble(b);
        final String[] i1 = {""};
        final String[] i2 = {""};
        Spinner spinner=(Spinner)findViewById(R.id.chang_du1);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {
                String[] autoInfo = getResources().getStringArray(R.array.chang_du);
                i1[0] =autoInfo[pos];
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        Spinner spinner2=(Spinner)findViewById(R.id.chang_du2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {
                String[] autoInfo = getResources().getStringArray(R.array.chang_du);
                i2[0] =autoInfo[pos];
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
                String i2="";
            }
        });
        Change change=new Change();
        double after=change.chang_du_change(change.xu_hao(i1[0]),change.xu_hao(i2[0]),before);
        TextView t2=findViewById(R.id.c_after);
        t2.setText(after+"");
    }
}