package com.example.jsq;

import java.util.ArrayList;

public class Tool {
    public String NeedClear(int i, String old) {
        String need = "";
        if (i > 0) {
            return old;
        } else {
            return need;
        }
    }

    public boolean isTrue(String s) {
        boolean isTrue = true;
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= '0' && s.charAt(i) <= '9') || s.charAt(i) == '.') {
                if ((i == 0 && s.charAt(i) == '.') || n > 1) {
                    isTrue = false;
                    break;
                }
                if (s.charAt(i) == '.') {
                    n++;
                }
            } else {
                isTrue = false;
                break;
            }

        }
        return isTrue;
    }

    public boolean isTrue(String s, int t) {
        boolean isTrue = true;
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 && s.charAt(i) == '.') || n > 1) {
                isTrue = false;
                break;
            }
            if (s.charAt(i) == '.') {
                n++;
            }

        }
        for (int i = 0; i < s.length(); i++) {

            char str=s.charAt(i);
            if(isTrue &&str=='.'){
                str='0';
            }
            switch (t) {
                case 2:
                    if(!(str=='0'||str=='1')){
                        isTrue=false;
                    }
                    break;
                case 8:
                    if (str<'0'||str>'7'){
                        isTrue=false;
                    }
                    break;
                case 10:
                    if (str<'0'||str>'9')
                    break;
                case 16:
                    if(str<'0'||str>'9'){
                        if (str<'a'||str>'f')
                            isTrue=false;
                    }
                    break;
            }
        }
        return isTrue;
    }
}
