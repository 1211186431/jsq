package com.example.jsq;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> list=new ArrayList<String>();
    int needClear=1;
    Tool tool=new Tool();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickZero(View view) {
        if(needClear==-1)
            list.clear();
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=tool.NeedClear(needClear,txt.getText().toString());
        needClear=1;
        txt.setText(old+"0");
        list.add("0");
    }

    public void onclickPercent(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        needClear=1;
        String old=tool.NeedClear(needClear,txt.getText().toString());
        txt.setText(old+"%");
        list.add("%");
    }

    public void onclickPoint(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        needClear=1;
        String old=tool.NeedClear(needClear,txt.getText().toString());
        txt.setText(old+".");
        list.add(".");
    }

    public void onclickOne(View view) {
        if(needClear==-1)
            list.clear();
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=tool.NeedClear(needClear,txt.getText().toString());
        needClear=1;
        txt.setText(old+"1");
        list.add("1");
    }

    public void onclickTwo(View view) {
        if(needClear==-1)
            list.clear();
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=tool.NeedClear(needClear,txt.getText().toString());
        needClear=1;;
        txt.setText(old+"2");
        list.add("2");
    }

    public void onclickThree(View view) {
        if(needClear==-1)
            list.clear();
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=tool.NeedClear(needClear,txt.getText().toString());
        needClear=1;
        txt.setText(old+"3");
        list.add("3");
    }

    public void onclickFour(View view) {
        if(needClear==-1)
            list.clear();
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=tool.NeedClear(needClear,txt.getText().toString());
        needClear=1;
        txt.setText(old+"4");
        list.add("4");
    }

    public void onclickFive(View view) {
        if(needClear==-1)
            list.clear();
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=tool.NeedClear(needClear,txt.getText().toString());
        needClear=1;
        txt.setText(old+"5");
        list.add("5");
    }

    public void onclickSix(View view) {
        if(needClear==-1)
            list.clear();
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=tool.NeedClear(needClear,txt.getText().toString());
        needClear=1;
        txt.setText(old+"6");
        list.add("6");
    }

    public void onclickAdd(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        needClear=1;
        String old=tool.NeedClear(needClear,txt.getText().toString());
        txt.setText(old+"+");
        list.add("+");
    }

    public void onclickSeven(View view) {
        if(needClear==-1)
            list.clear();
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=tool.NeedClear(needClear,txt.getText().toString());
        needClear=1;
        txt.setText(old+"7");
        list.add("7");
    }

    public void onclickEight(View view) {
        if(needClear==-1)
            list.clear();
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=tool.NeedClear(needClear,txt.getText().toString());
        needClear=1;
        txt.setText(old+"8");
        list.add("8");
    }

    public void onclickNine(View view) {
        if(needClear==-1)
            list.clear();
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=tool.NeedClear(needClear,txt.getText().toString());
        needClear=1;
        txt.setText(old+"9");
        list.add("9");
    }

    public void onclickSub(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        needClear=1;
        String old=tool.NeedClear(needClear,txt.getText().toString());
        txt.setText(old+"-");
        list.add("-");
    }

    public void onclickClear(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        needClear=1;
        txt.setText("");
        list.clear();
    }

    public void onclickDiv(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        needClear=1;
        String old=tool.NeedClear(needClear,txt.getText().toString());
        txt.setText(old+"/");
        list.add("/");
    }

    public void onclickMul(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        needClear=1;
        String old=tool.NeedClear(needClear,txt.getText().toString());
        txt.setText(old+"*");
        list.add("*");
    }

    public void onclickBack(View view) {
        needClear=1;
        TextView txt = (TextView)findViewById(R.id.txt);
        StringBuilder now= new StringBuilder();
        if(list.size()==0){

        }
        else{
           // Log.v("tag",(list.get(list.size()-1)));
            list.remove(list.size()-1);

            for(int i=0;i<list.size();i++){
                if(list.get(i).equals("s")){
                    now.append("sin");
                }
                if(list.get(i).equals("c")){
                    now.append("cos");
                }
                if(list.get(i).equals("T")){
                    now.append("^(3)");
                }
                if(list.get(i).equals("^")){
                    now.append("^(2)");
                }
                if(list.get(i).equals("l")){
                    now.append("log");
                }
                else if(list.get(i).equals("1")||list.get(i).equals("7")||
                        list.get(i).equals("2")||list.get(i).equals("8")||
                        list.get(i).equals("3")||list.get(i).equals("9")||
                        list.get(i).equals("4")||list.get(i).equals("0")||
                        list.get(i).equals("5")||list.get(i).equals(".")||
                        list.get(i).equals("6")||list.get(i).equals("(")||
                        list.get(i).equals(")")||list.get(i).equals("*")||
                        list.get(i).equals("+")||list.get(i).equals("/")||
                        list.get(i).equals("-")||list.get(i).equals("%")){
                    now.append(list.get(i));
                }

            }
        }

        txt.setText(now.toString());
    }

    public void onclickEquals(View view) {
        Expression e=new Expression();
        StringBuilder s= new StringBuilder();
        TextView txt=findViewById(R.id.txt);
        for(int i=0;i<list.size();i++){
            s.append(list.get(i));
        }
        int E[]={0};
        double a=e.toValue2(e.toPostfix(s.toString()),E);

        if(E[0]==0){
            list.clear();
            String result=a+"";
            for(int i=0;i<result.length();i++){
                list.add(result.charAt(i)+"");
            }
            needClear=-1;
            txt.setText(result);
        }
        else{
            Toast.makeText(MainActivity.this,"计算错误",Toast.LENGTH_LONG).show();
        }

    }

    public void onclickSqu(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        needClear=1;
        String old=tool.NeedClear(needClear,txt.getText().toString());
        txt.setText(old+"^(2)");
        list.add("^");
    }

    public void onclickCub(View view) {
        TextView txt = (TextView)findViewById(R.id.txt);
        needClear=1;
        String old=tool.NeedClear(needClear,txt.getText().toString());
        txt.setText(old+"^(3)");
        list.add("T");
    }

    public void onclickLog(View view) {
        if(needClear==-1)
            list.clear();
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=tool.NeedClear(needClear,txt.getText().toString());
        needClear=1;
        txt.setText(old+"log");
        list.add("l");
    }

    public void onclickTan(View view) {
        if(needClear==-1)
            list.clear();
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=tool.NeedClear(needClear,txt.getText().toString());
        needClear=1;
        txt.setText(old+"tan");
        list.add("t");
    }

    public void onclickLeft_B(View view) {
        if(needClear==-1)
            list.clear();
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=tool.NeedClear(needClear,txt.getText().toString());
        needClear=1;
        txt.setText(old+"(");
        list.add("(");
    }

    public void onclickRight_B(View view) {
        if(needClear==-1)
            list.clear();
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=tool.NeedClear(needClear,txt.getText().toString());
        needClear=1;
        txt.setText(old+")");
        list.add(")");
    }

    public void onclickSin(View view) {
        if(needClear==-1)
            list.clear();
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=tool.NeedClear(needClear,txt.getText().toString());
        txt.setText(old+"sin");
        needClear=1;
        list.add("s");
    }

    public void onclickCos(View view) {
        if(needClear==-1)
            list.clear();
        TextView txt = (TextView)findViewById(R.id.txt);
        String old=tool.NeedClear(needClear,txt.getText().toString());
        needClear=1;
        txt.setText(old+"cos");
        list.add("c");
    }

}