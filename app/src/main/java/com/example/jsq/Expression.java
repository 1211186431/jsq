package com.example.jsq;

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
                        stack.push(ch + " "); // ջ��string����

                    } else {
                        postfix.append("-"); // 如果是表示负数的-号直接加到后缀表达式里面
                    }
                    i++;
                    break;
                case '*':
                case '/':
                    while (stack.isEmpty() == false
                            && (stack.lastElement().equals("*") || stack.lastElement().equals("/"))) {
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
                    String out = stack.pop(); // Ҫ��ջ�ķ���
                    while (out != null && !out.equals("(")) {
                        postfix.append(out);
                        out = stack.pop();
                    }
                    i++;
                    break;
                default:
                    while ((i < infix.length() && ch >= '0' && ch <= '9') || ch == '.') {
                        postfix.append(ch);
                        i++;
                        if (i < infix.length()) { // ��λ��
                            ch = infix.charAt(i); // �����
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

    public static int toValue(StringBuffer postfix) {
        Stack<Integer> stack = new Stack<Integer>();
        int i;
        for (i = 0; i < postfix.length(); i++) {
            char t = postfix.charAt(i);
            if (t >= '0' && t <= '9') {
                int value = 0; // �ַ�ת��Ϊ��
                while (t != ' ') {
                    value = value * 10 + t - '0';
                    t = postfix.charAt(++i); // ��һλ
                }
                stack.push(value);

            } else {
                if (t != ' ') {
                    int x = stack.pop();
                    int y = stack.pop();
                    switch (t) {
                        case '+':
                            stack.push(x + y);
                            break;
                        case '-':
                            stack.push(y - x);
                            break;
                        case '*':
                            stack.push(x * y);
                            break;
                        case '/':
                            stack.push(y / x);
                            break;
                    }

                }

            }

        }
        return stack.pop();
    }

    public static float toValue2(StringBuffer postfix) {
        float value = 0;
        Stack<Float> stack = new Stack<Float>();
        String str = postfix.toString();
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("+") || s[i].equals("-") || s[i].equals("*") || s[i].equals("/")) {
                float x = stack.pop();
                float y = stack.pop();
                System.out.println("x=" + x);
                System.out.println("y=" + y);
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
            } else {

                float f = Float.parseFloat(s[i]);
                stack.push(f);
            }

        }
        value = stack.pop();
        return value;
    }
}