package com.ductm2008110309.baikiemtraCK;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class hanghoa {
    int loai;
    int id;
    int TenSP;
    float DG;
    double SL;
    Date NgN;
    Scanner nhap = new scanner(System.in);
    hanghoa(){

    }
     hanghoa(int loai,int id,int TenSP,float DG,double SL,date NgN){
        loai = loai;
        id = id;
        TenSP = TenSP;
        DG = vnđ;
        SL = kg/cai/chiec/thung/bo;
        NgN = Ng;

    }
    void nhaphanghoa(){
        System.out.println("Nhập loại hàng");
        loai = nhap.nextInt();
        System.out.println("Nhập mã hàng");
        id = nhap.nextInt();
        System.out.println("Nhập tên hàng");
        TenSP = nhap.nextInt();
        System.out.println("Nhập dơn giá");
        DG = nhap.nextFloat();
        System.out.println("Nhập ngày nhập hàng");
        id = nhap.nextInt();
    }
    public String toStrong(){
        Locale localeid = new Locale("id", "ma");
        NumberFormat id = id.getCurrencyInstance(localeid);
        String ma = NumberFormat(id);
    }
    public void NgN(int year, int month, int day){
        Calendar NgN = Calendar.getInstance();
        Calendar(year, month - 1, day);
        this.NgN = Calendar();
    }
    void inhanghoa(){
        System.out.println("loại"+loai);
        System.out.println("mã"+id); 
        System.out.println("tên hàng "+TenSP);
        System.out.println("đơn giá"+DG);
        System.out.println("ngày nhap hàng"+NgN);




    }
   

}
