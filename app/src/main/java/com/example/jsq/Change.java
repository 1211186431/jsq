package com.example.jsq;

import java.math.BigInteger;

public class Change {
    public double chang_du_change(int i1,int i2,double data) {
        double newdate=0;
        double k1=1;  //多少倍的米
        double k2=1;
        switch(i1) {
            case 1:    //千米
                k1=1000;
                break;
            case 2:    //米
                k1=1;
                break;
            case 3:   //英寸
                k1=0.0254;
                break;
            case 4:   //英尺
                k1=0.3048;
                break;
            case 5:   //码
                k1=0.9144;
                break;
        }
        switch(i2) {
            case 1:    //千米
                k2=1000;
                break;
            case 2:    //米
                k2=1;
                break;
            case 3:   //英寸
                k2=0.0254;
                break;
            case 4:   //英尺
                k2=0.3048;
                break;
            case 5:   //码
                k2=0.9144;
                break;
        }
        newdate=(k1/k2)*data;
        return newdate;
    }
    public double ti_ji_change(int i1,int i2,double data) {
        double newdate=0;
        double k1=1;  //多少倍的升
        double k2=1;
        switch(i1) {
            case 1:    //毫升
                k1=0.001;
                break;
            case 2:    //立方厘米
                k1=0.001;
                break;
            case 3:   //升
                k1=1;
                break;
            case 4:   //立方米
                k1=1000;
                break;
            case 5:   //立方英寸
                k1=61023.74;
                break;
        }
        switch(i2) {
            case 1:    //毫升
                k2=0.001;
                break;
            case 2:    //立方厘米
                k2=0.001;
                break;
            case 3:   //升
                k2=1;
                break;
            case 4:   //立方米
                k2=1000;
                break;
            case 5:   //立方英寸
                k2=61023.74;
                break;
        }
        newdate=(k1/k2)*data;
        return newdate;
    }
    public String jin_zhi_change(int i1,int i2,String data) {
        return new BigInteger(data, i1).toString(i2);
    }
    public int xu_hao(String s) {
        int i = 0;
        switch (s) {
            case "千米":
            case "毫升":
                i = 1;
                break;
            case "米":
            case "立方厘米":
            case "二进制":
                i = 2;
                break;
            case "英寸":
            case "升":
                i = 3;
                break;
            case "英尺":
            case "立方米":
                i = 4;
                break;
            case "码":
            case "立方英寸":
                i = 5;
                break;
            case "八进制":
                i=8;break;
            case "十进制":i=10;break;
            case "十六进制":i=16;break;
        }
        return i;
    }
}
