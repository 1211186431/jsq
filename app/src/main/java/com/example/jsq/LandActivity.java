package com.example.jsq;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class LandActivity extends AppCompatActivity {
    ArrayList<String> list = new ArrayList<String>();
    int needClear = 1;
    Tool tool = new Tool();
    String[] i1 = {""};
    String[] i2 = {""};
    double before;
    String Tag = "tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.land);
        if (savedInstanceState == null) {
            Log.e(Tag, "-------onCreate--------" + savedInstanceState);
        } else {
            TextView ttt = findViewById(R.id.txt);

            Log.e(Tag, "-------onCreate--------" + savedInstanceState.getStringArrayList("oldlist").toString());
            list = savedInstanceState.getStringArrayList("oldlist");
            ttt.setText(savedInstanceState.getString("old"));
        }
    }

    public void onclickZero(View view) {
        if (needClear == -1)
            list.clear();
        TextView txt = (TextView) findViewById(R.id.txt);
        String old = tool.NeedClear(needClear, txt.getText().toString());
        needClear = 1;
        txt.setText(old + "0");
        list.add("0");
    }

    public void onclickPercent(View view) {
        TextView txt = (TextView) findViewById(R.id.txt);
        needClear = 1;
        String old = tool.NeedClear(needClear, txt.getText().toString());
        txt.setText(old + "%");
        list.add("%");
    }

    public void onclickPoint(View view) {
        TextView txt = (TextView) findViewById(R.id.txt);
        needClear = 1;
        String old = tool.NeedClear(needClear, txt.getText().toString());
        txt.setText(old + ".");
        list.add(".");
    }

    public void onclickOne(View view) {
        if (needClear == -1)
            list.clear();
        TextView txt = (TextView) findViewById(R.id.txt);
        String old = tool.NeedClear(needClear, txt.getText().toString());
        needClear = 1;
        txt.setText(old + "1");
        list.add("1");
    }

    public void onclickTwo(View view) {
        if (needClear == -1)
            list.clear();
        TextView txt = (TextView) findViewById(R.id.txt);
        String old = tool.NeedClear(needClear, txt.getText().toString());
        needClear = 1;
        ;
        txt.setText(old + "2");
        list.add("2");
    }

    public void onclickThree(View view) {
        if (needClear == -1)
            list.clear();
        TextView txt = (TextView) findViewById(R.id.txt);
        String old = tool.NeedClear(needClear, txt.getText().toString());
        needClear = 1;
        txt.setText(old + "3");
        list.add("3");
    }

    public void onclickFour(View view) {
        if (needClear == -1)
            list.clear();
        TextView txt = (TextView) findViewById(R.id.txt);
        String old = tool.NeedClear(needClear, txt.getText().toString());
        needClear = 1;
        txt.setText(old + "4");
        list.add("4");
    }

    public void onclickFive(View view) {
        if (needClear == -1)
            list.clear();
        TextView txt = (TextView) findViewById(R.id.txt);
        String old = tool.NeedClear(needClear, txt.getText().toString());
        needClear = 1;
        txt.setText(old + "5");
        list.add("5");
    }

    public void onclickSix(View view) {
        if (needClear == -1)
            list.clear();
        TextView txt = (TextView) findViewById(R.id.txt);
        String old = tool.NeedClear(needClear, txt.getText().toString());
        needClear = 1;
        txt.setText(old + "6");
        list.add("6");
    }

    public void onclickAdd(View view) {
        TextView txt = (TextView) findViewById(R.id.txt);
        needClear = 1;
        String old = tool.NeedClear(needClear, txt.getText().toString());
        txt.setText(old + "+");
        list.add("+");
    }

    public void onclickSeven(View view) {
        if (needClear == -1)
            list.clear();
        TextView txt = (TextView) findViewById(R.id.txt);
        String old = tool.NeedClear(needClear, txt.getText().toString());
        needClear = 1;
        txt.setText(old + "7");
        list.add("7");
    }

    public void onclickEight(View view) {
        if (needClear == -1)
            list.clear();
        TextView txt = (TextView) findViewById(R.id.txt);
        String old = tool.NeedClear(needClear, txt.getText().toString());
        needClear = 1;
        txt.setText(old + "8");
        list.add("8");
    }

    public void onclickNine(View view) {
        if (needClear == -1)
            list.clear();
        TextView txt = (TextView) findViewById(R.id.txt);
        String old = tool.NeedClear(needClear, txt.getText().toString());
        needClear = 1;
        txt.setText(old + "9");
        list.add("9");
    }

    public void onclickSub(View view) {
        TextView txt = (TextView) findViewById(R.id.txt);
        needClear = 1;
        String old = tool.NeedClear(needClear, txt.getText().toString());
        txt.setText(old + "-");
        list.add("-");
    }

    public void onclickClear(View view) {
        TextView txt = (TextView) findViewById(R.id.txt);
        needClear = 1;
        txt.setText("");
        list.clear();
    }

    public void onclickDiv(View view) {
        TextView txt = (TextView) findViewById(R.id.txt);
        needClear = 1;
        String old = tool.NeedClear(needClear, txt.getText().toString());
        txt.setText(old + "/");
        list.add("/");
    }

    public void onclickMul(View view) {
        TextView txt = (TextView) findViewById(R.id.txt);
        needClear = 1;
        String old = tool.NeedClear(needClear, txt.getText().toString());
        txt.setText(old + "*");
        list.add("*");
    }

    public void onclickBack(View view) {
        needClear = 1;
        TextView txt = (TextView) findViewById(R.id.txt);
        StringBuilder now = new StringBuilder();
        if (list.size() == 0) {

        } else {
            // Log.v("tag",(list.get(list.size()-1)));
            list.remove(list.size() - 1);

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals("s")) {
                    now.append("sin");
                }
                if (list.get(i).equals("c")) {
                    now.append("cos");
                }
                if (list.get(i).equals("T")) {
                    now.append("^(3)");
                }
                if (list.get(i).equals("^")) {
                    now.append("^(2)");
                }
                if (list.get(i).equals("l")) {
                    now.append("log");
                } else if (list.get(i).equals("1") || list.get(i).equals("7") ||
                        list.get(i).equals("2") || list.get(i).equals("8") ||
                        list.get(i).equals("3") || list.get(i).equals("9") ||
                        list.get(i).equals("4") || list.get(i).equals("0") ||
                        list.get(i).equals("5") || list.get(i).equals(".") ||
                        list.get(i).equals("6") || list.get(i).equals("(") ||
                        list.get(i).equals(")") || list.get(i).equals("*") ||
                        list.get(i).equals("+") || list.get(i).equals("/") ||
                        list.get(i).equals("-") || list.get(i).equals("%")) {
                    now.append(list.get(i));
                }

            }
        }

        txt.setText(now.toString());
    }

    public void onclickEquals(View view) {
        Expression e = new Expression();
        StringBuilder s = new StringBuilder();
        TextView txt = findViewById(R.id.txt);
        if (list.isEmpty()) {
            s.append("0");
        } else
            for (int i = 0; i < list.size(); i++) {
                s.append(list.get(i));
            }
        int E[] = {0};
        double a = e.toValue2(e.toPostfix(s.toString()), E);

        if (E[0] == 0) {
            list.clear();
            String result = a + "";
            for (int i = 0; i < result.length(); i++) {
                list.add(result.charAt(i) + "");
            }
            needClear = -1;
            txt.setText(result);
        } else {
            Toast.makeText(LandActivity.this, "计算错误", Toast.LENGTH_LONG).show();
        }

    }

    public void onclickSqu(View view) {
        TextView txt = (TextView) findViewById(R.id.txt);
        needClear = 1;
        String old = tool.NeedClear(needClear, txt.getText().toString());
        txt.setText(old + "^(2)");
        list.add("^");
    }

    public void onclickCub(View view) {
        TextView txt = (TextView) findViewById(R.id.txt);
        needClear = 1;
        String old = tool.NeedClear(needClear, txt.getText().toString());
        txt.setText(old + "^(3)");
        list.add("T");
    }

    public void onclickLog(View view) {
        if (needClear == -1)
            list.clear();
        TextView txt = (TextView) findViewById(R.id.txt);
        String old = tool.NeedClear(needClear, txt.getText().toString());
        needClear = 1;
        txt.setText(old + "log");
        list.add("l");
    }

    public void onclickTan(View view) {
        if (needClear == -1)
            list.clear();
        TextView txt = (TextView) findViewById(R.id.txt);
        String old = tool.NeedClear(needClear, txt.getText().toString());
        needClear = 1;
        txt.setText(old + "tan");
        list.add("t");
    }

    public void onclickLeft_B(View view) {
        if (needClear == -1)
            list.clear();
        TextView txt = (TextView) findViewById(R.id.txt);
        String old = tool.NeedClear(needClear, txt.getText().toString());
        needClear = 1;
        txt.setText(old + "(");
        list.add("(");
    }

    public void onclickRight_B(View view) {
        if (needClear == -1)
            list.clear();
        TextView txt = (TextView) findViewById(R.id.txt);
        String old = tool.NeedClear(needClear, txt.getText().toString());
        needClear = 1;
        txt.setText(old + ")");
        list.add(")");
    }

    public void onclickSin(View view) {
        if (needClear == -1)
            list.clear();
        TextView txt = (TextView) findViewById(R.id.txt);
        String old = tool.NeedClear(needClear, txt.getText().toString());
        txt.setText(old + "sin");
        needClear = 1;
        list.add("s");
    }

    public void onclickCos(View view) {
        if (needClear == -1)
            list.clear();
        TextView txt = (TextView) findViewById(R.id.txt);
        String old = tool.NeedClear(needClear, txt.getText().toString());
        needClear = 1;
        txt.setText(old + "cos");
        list.add("c");
    }

    public void onclickChang(View view) {
        Button btnOne = (Button) findViewById(R.id.chang);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LandActivity.this);
                final View viewDialog = LayoutInflater.from(LandActivity.this).inflate(R.layout.activity_chang_du, null, false);

                Spinner spinner = (Spinner) viewDialog.findViewById(R.id.chang_du1);
                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view,
                                               int pos, long id) {
                        String[] autoInfo = getResources().getStringArray(R.array.chang_du);
                        i1[0] = autoInfo[pos];
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        // Another interface callbac
                    }
                });

                Spinner spinner2 = (Spinner) viewDialog.findViewById(R.id.chang_du2);
                spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view,
                                               int pos, long id) {
                        String[] autoInfo = getResources().getStringArray(R.array.chang_du);
                        i2[0] = autoInfo[pos];
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        // Another interface callback
                        String i2 = "";
                    }
                });
                Button zhuan_huan = viewDialog.findViewById(R.id.c_zhan_huan);
                zhuan_huan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        EditText textView = viewDialog.findViewById(R.id.c_before);
                        Tool tool = new Tool();
                        String b;
                        TextView t2 = viewDialog.findViewById(R.id.c_after);
                        if (textView.getText() != null && textView.getText().toString().length() > 0) {
                            b = textView.getText().toString();
                        } else
                            b = "false";
                        if (tool.isTrue(b)) {
                            before = Double.parseDouble(b);
                            Change change = new Change();
                            double after = change.chang_du_change(change.xu_hao(i1[0]), change.xu_hao(i2[0]), before);

                            t2.setText(after + "");
                        } else
                            t2.setText("错误");

                    }
                });


                builder.setTitle("长度转换")
                        .setView(viewDialog)
                        .setNegativeButton("返回", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                i1[0] = "";
                                i2[0] = "";
                            }
                        });
                builder.create().show();

            }
        });
    }

    public void onclickJin(View view) {
        Button btnOne = (Button) findViewById(R.id.jin);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LandActivity.this);
                final View viewDialog = LayoutInflater.from(LandActivity.this).inflate(R.layout.activity_jin_zhi, null, false);

                Spinner spinner = (Spinner) viewDialog.findViewById(R.id.jin_zhi1);
                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view,
                                               int pos, long id) {
                        String[] autoInfo = getResources().getStringArray(R.array.jin_zhi);
                        i1[0] = autoInfo[pos];
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        // Another interface callbac
                    }
                });

                Spinner spinner2 = (Spinner) viewDialog.findViewById(R.id.jin_zhi2);
                spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view,
                                               int pos, long id) {
                        String[] autoInfo = getResources().getStringArray(R.array.jin_zhi);
                        i2[0] = autoInfo[pos];
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        // Another interface callback
                        String i2 = "";
                    }
                });
                Button zhuan_huan = viewDialog.findViewById(R.id.j_zhan_huan);
                zhuan_huan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        EditText textView = viewDialog.findViewById(R.id.j_before);
                        Tool tool = new Tool();
                        String b;
                        TextView t2 = viewDialog.findViewById(R.id.j_after);
                        if (textView.getText() != null && textView.getText().toString().length() > 0) {
                            b = textView.getText().toString();
                        } else
                            b = "false";
                        Change change = new Change();
                        if (tool.isTrue(b, change.xu_hao(i1[0]))) {
                            String after = change.jin_zhi_change(change.xu_hao(i1[0]), change.xu_hao(i2[0]), b);
                            t2.setText(after + "");
                        } else
                            t2.setText("错误");

                    }
                });


                builder.setTitle("进制转换")
                        .setView(viewDialog)
                        .setNegativeButton("返回", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                i1[0] = "";
                                i2[0] = "";
                            }
                        });
                builder.create().show();

            }
        });
    }

    public void onclickTi(View view) {
        Button btnOne = (Button) findViewById(R.id.ti);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LandActivity.this);
                final View viewDialog = LayoutInflater.from(LandActivity.this).inflate(R.layout.activity_ti_ji, null, false);

                Spinner spinner = (Spinner) viewDialog.findViewById(R.id.ti_ji1);
                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view,
                                               int pos, long id) {
                        String[] autoInfo = getResources().getStringArray(R.array.ti_ji);
                        i1[0] = autoInfo[pos];
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        // Another interface callbac
                    }
                });

                Spinner spinner2 = (Spinner) viewDialog.findViewById(R.id.ti_ji2);
                spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view,
                                               int pos, long id) {
                        String[] autoInfo = getResources().getStringArray(R.array.ti_ji);
                        i2[0] = autoInfo[pos];
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        // Another interface callback
                        String i2 = "";
                    }
                });
                Button zhuan_huan = viewDialog.findViewById(R.id.t_zhan_huan);
                zhuan_huan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        EditText textView = viewDialog.findViewById(R.id.t_before);
                        Tool tool = new Tool();
                        String b;
                        TextView t2 = viewDialog.findViewById(R.id.t_after);
                        if (textView.getText() != null && textView.getText().toString().length() > 0) {
                            b = textView.getText().toString();
                        } else
                            b = "false";
                        if (tool.isTrue(b)) {
                            before = Double.parseDouble(b);
                            Change change = new Change();
                            double after = change.ti_ji_change(change.xu_hao(i1[0]), change.xu_hao(i2[0]), before);

                            t2.setText(after + "");
                        } else
                            t2.setText("错误");

                    }
                });


                builder.setTitle("体积转换")
                        .setView(viewDialog)
                        .setNegativeButton("返回", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                i1[0] = "";
                                i2[0] = "";
                            }
                        });
                builder.create().show();

            }
        });
    }

    public void onclickE(View view) {
        if (needClear == -1)
            list.clear();
        TextView txt = (TextView) findViewById(R.id.txt);
        String old = tool.NeedClear(needClear, txt.getText().toString());
        needClear = 1;
        txt.setText(old + Math.E);
        list.add(Math.E + "");
    }

    public void onclickPi(View view) {
        if (needClear == -1)
            list.clear();
        TextView txt = (TextView) findViewById(R.id.txt);
        String old = tool.NeedClear(needClear, txt.getText().toString());
        needClear = 1;
        txt.setText(old + Math.PI);
        list.add(Math.PI + "");
    }

    public void onclickHelp(View view) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(LandActivity.this);
//        final View viewDialog = LayoutInflater.from(LandActivity.this).inflate(R.layout.activity_help, null, false);
//        builder.setTitle("帮助")
//                .setView(viewDialog)
//                .setNegativeButton("返回", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//        builder.create().show();
        Intent intent=new Intent(LandActivity.this,CActivity.class);
        startActivity(intent);
    }
    public void onclickHelp2(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(LandActivity.this);
        final View viewDialog = LayoutInflater.from(LandActivity.this).inflate(R.layout.activity_help, null, false);
        builder.setTitle("帮助")
                .setView(viewDialog)
                .setNegativeButton("返回", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        builder.create().show();
    }
    protected void onSaveInstanceState(Bundle outState) {

        // TODO Auto-generated method stub

        super.onSaveInstanceState(outState);
        TextView e = findViewById(R.id.txt);

        outState.putString("old", e.getText().toString());
        outState.putStringArrayList("oldlist", list);
        Log.v(Tag, "sussess");
    }

}