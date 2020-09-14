package com.example.jsq;

import java.util.ArrayList;
import java.util.Stack;

public class Expression {
    public static StringBuffer toPostfix(String infix) {
        Stack<String> stack = new Stack<String>(); // ������ջ
        StringBuffer postfix = new StringBuffer(infix.length() * 2); // �������
        int i = 0;
        while (i < infix.length()) {
            char ch = infix.charAt(i);
            switch (ch) {
                case '+':
                case '-':
                    Boolean a2 = (i != 0) && (ch == '-') && (infix.charAt(i - 1) >= '0' && infix.charAt(i - 1) <= '9'); // 表示-号前面为数字的时候
                    Boolean a3 = (i != 0) && (ch == '-') && (infix.charAt(i - 1) == ')'); // 表示-号前面为)的时候
                    if (a2.booleanValue() || a3.booleanValue() || ch == '+') {
                        while (stack.isEmpty() == false && !stack.lastElement().equals("(")) { // �жϳ�ջ
                            postfix.append(stack.pop());
                        }
                        stack.push(ch + " ");
                        i++;
                        break;
                    } else {
                        while (stack.isEmpty() == false && (isPriority(stack.lastElement(), 100))) {
                            postfix.append(stack.pop());
                        }
                        stack.push("f ");
                        i++;
                        break;
                    }

                case '*':
                case '/':
                    while (stack.isEmpty() == false && (isPriority(stack.lastElement(), 10))) {
                        postfix.append(stack.pop());
                    }
                    stack.push(ch + " ");
                    i++;
                    break;
                case '(':
                    stack.push(ch + "");
                    i++;
                    break;
                case ')':
                    if(!stack.isEmpty()) {
                        String out = stack.pop();
                        while (out != null && !out.equals("(")) {
                            postfix.append(out);
                            if(stack.isEmpty()) {
                                postfix.append("..");
                            }
                            else {
                                out = stack.pop();
                                break;
                            }
                        }
                    }
                    else
                        postfix.append("..");
                    i++;
                    break;
                case 's': //sin
                case 'c': //cos
                case 'T': // 三次方
                case '^': // 平方
                case 't'://tan
                case 'l'://log
                case '%'://百分号
                    while (stack.isEmpty() == false && (isPriority(stack.lastElement(), 100))) {
                        postfix.append(stack.pop());
                    }
                    stack.push(ch + " ");
                    i++;
                    break;

                default:
                    while (i < infix.length() && ((ch >= '0' && ch <= '9') || ch == '.')) {  //点后面没符号不能终止
                        postfix.append(ch);
                        i++;
                        if(i<infix.length()) {
                            ch=infix.charAt(i);
                        }
                    }
                    postfix.append(" ");
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix;

    }

    public static double toValue2(StringBuffer postfix,int E[]) { //E[0]判断错误
        double value = 0;
        int e=1;
        Stack<Double> stack = new Stack<Double>();
        String str = postfix.toString();
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (isPriority(s[i], 2)) {
                double x=1;
                double y=1;
                if(stack.isEmpty()||!isTrue(s[i])) {
                    e=-1;
                }
                else {
                    x = stack.pop();
                }

                if(stack.isEmpty()||!isTrue(s[i])) {
                    e=-1;
                }
                else {
                    y = stack.pop();
                }
                switch (s[i]) {
                    case "+":
                        stack.push(x + y);
                        break;
                    case "-":
                        stack.push(y - x);
                        break;
                    case "*":
                        stack.push(x * y);
                        break;
                    case "/":
                        stack.push(y / x);
                        break;
                }
            } else if (isPriority(s[i], 100)) {
                double x = 1;
                if(stack.isEmpty()||!isTrue(s[i])) {
                    e=-1;
                }
                else {
                    x = stack.pop();
                }
                switch (s[i]) {
                    case "^": // 平方
                        stack.push(x * x);
                        break;
                    case "f": // 负号
                        stack.push((-1) * x);
                        break;
                    case "T":
                        stack.push(x * x * x);// 三次方
                        break;
                    case "s":  //sin
                        stack.push(Math.sin(x));
                        break;
                    case "c":  //cos
                        stack.push(Math.cos(x));
                        break;
                    case "t":  //tan
                        stack.push(Math.tan(x));
                        break;
                    case "l":  //log
                        stack.push(Math.log(x));
                        break;
                    case "%":
                        stack.push(x/100);
                        break;
                }
            } else {
                double f;
                if(!isTrue(s[i])) {
                    e=-1;
                    f=0;
                }
                else {
                    f= Double.parseDouble(s[i]);
                }
                stack.push(f);
            }

        }
        if(e==1) {
            value = stack.pop();
        }
        else {
            E[0]=-1;
        }
        return value;
    }

    public static boolean isPriority(String a, int l) {
        boolean P = false;
        if (l == 2) {
            if (a.equals("+") || a.equals("-") || a.equals("*") || a.equals("/")) {
                P = true;
            }
        }
        if (l == 10) {
            if (a.equals("*") || a.equals("/") || a.equals("^") || a.equals("f") || a.equals("T")||a.equals("s")||a.equals("c")||a.equals("t")||a.equals("l")||a.equals("%")) {
                P = true;
            }
        }
        if (l == 100) {
            if (a.equals("^") || a.equals("f") || a.equals("T")||a.equals("s")||a.equals("c")||a.equals("t")||a.equals("l")||a.equals("%")) {
                P = true;
            }
        }
        return P;
    }
    public static boolean isTrue(String s){  //判断点是否正确
        boolean isTrue=true;
        int n=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='.') {
                n++;
                if(i==0) {
                    isTrue=false;
                    break;
                }
            }
            if(n>1) {
                isTrue=false;
                break;
            }
            if(s.charAt(i)=='('||s.charAt(i)==')'){
                isTrue=false;
                break;
            }

        }

        return isTrue;
    }
}
