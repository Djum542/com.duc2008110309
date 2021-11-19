package com.ductm2008110309.baikiemtraCK;

import org.w3c.dom.Node;

public class node {
    int loai;
    int id;
    int TenSP;
    float DG;
    double SL;
    date NgN;

    Node(){

    }
    Node(int loai,int id,int TenSP,float DG,double SL,date NgN){
        loai = loai;
        id = id;
        TenSP = TenSP;
        DG = DG;
        SL = SL;
        NgN = NgN;
    }
}
