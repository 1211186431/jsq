package com.example.jsq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickZero(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"0");
    }

    public void onclickPercent(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"%");
    }

    public void onclickPoint(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+".");
    }

    public void onclickOne(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"1");
    }

    public void onclickTwo(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        String num="";
        Button button=(Button)findViewById(R.id.two);
        num=button.getText().toString();
        txt.setText(old+num);
    }

    public void onclickThree(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"3");
    }

    public void onclickFour(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"4");
    }

    public void onclickFive(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"5");
    }

    public void onclickSix(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"6");
    }

    public void onclickAdd(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"+");
    }

    public void onclickSeven(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"7");
    }

    public void onclickEight(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"8");
    }

    public void onclickNine(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"9");
    }

    public void onclickSub(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"-");
    }

    public void onclickClear(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        txt.setText("");
    }

    public void onclickDiv(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"/");
    }

    public void onclickMul(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"*");
    }

    public void onclickBack(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        String[] old2=old.split("");
        String now="";
        if(old2.length!=0){
            for(int i=0;i<old2.length-1;i++){
                now=now+old2[i];
            }
        }
        txt.setText(now);
    }

    public void onclickEquals(View view) {
        Expression e=new Expression();
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        String str=e.toPostfix(old).toString();
        String[] s=str.split(" ");
        double a=e.toValue2(e.toPostfix(old));
        txt.setText(a+"");
    }

    public void onclickSqu(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"^");
    }

    public void onclickCub(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"T");
    }

    public void onclickLog(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"l");
    }

    public void onclickTan(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"t");
    }

    public void onclickLeft_B(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"(");
    }

    public void onclickRight_B(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+")");
    }

    public void onclickSin(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"s");
    }

    public void onclickCos(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=txt.getText().toString();
        txt.setText(old+"c");
    }
}