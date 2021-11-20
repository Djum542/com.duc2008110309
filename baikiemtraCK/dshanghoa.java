package com.ductm2008110309.baikiemtraCK;

import org.w3c.dom.Node;

public class dshanghoa {
    Node head = null;
    Node tail = null;
    String nhap = new String();
    int loai;
    int id;
    int TenSP;
    float DG;
    double SL;
    date NgN;
    public dshanghoa(){

    }
    public boolean isEmtpy(hanghoa HH){
        boolean empty;
        if(head = null){
            empty True;
        }else{
            empty False;
        }
    return emtpy;
    }
    // thêm đầu
    public void themdau (hanghoa HH){
        Node newNode = new Node(hanghoa);
        if(isEmtpy()){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
        public void themcuoi(hanghoa HH) {
            Node newNode = new Node(hanghoa);
            if(isEmtpy()){
                head = newNode;
                tail = newNode;

            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
    
    public void findhanghoa(hanghoa HH) {
        Node node = null;
        if(isEmtpy()){
            System.out.print("danh sách rỗng");
        }else{
            Node curent;
            curent = head;
            while(curent != null){
                if(curent.data.loai == loai){
                    node = curent;
                }else{
                    curent = curent.next;
                }
                for(int i = 0;i<1000000;i++){
                if(curent.data.gia == gia){
                    node = curent;
                }else{
                    curent = curent.next;
                }
                if(curent.data.NgN == NgN){
                    node = curent;
                }else{
                    curent = curent.next;
                }
            }
        }
    }
        return Node;
    }
    public delete(){
        if(isEmtpy()){
            System.out.println("không có gì để xóa");
        }else{
            Node curent;
            curent = head;
            while(curent != null){
                if(curent.next == tail){
                    tail = curent;
                    tail.next =null;
                }
                curent = curent.next;
            }
        }
    }
    public void thaydoi(hanghoa HH){
        Node newNode = new Node();
            
        
        if(isEmtpy()){
            System.out.println("danh sách rỗng");
        }else{
            Node current = head;
            while(current != null){
                if(current.next.id == id){
                    System.out.println("hàng cần thay đổi"+hanghoa);
                    loai = newNode;
                    id = newNode;
                    TenSP = newNode;
                    DG = newNode;
                    SL = newNode;
                    NgN = newNode;
                }
            }
        }
    }
    public static void selectionShort(loai[] gia){
    
        // sắp xếp tăng dần
        for(int i = 0;i < gia.length;i++){
            int index = i;
            for(int a = i + 1;a<gia.length;a++){
                if(gia[a] < gia[index]){
                index = a;
                }
            }
            int bigerGia = gia[index];
             gia[index]  = bigerGia;
        }
        }
        public static void bubbleSort(int[] gia){
            int n = gia.length;
            int temp = 0;
            for(int i = 0;i<n;i++){
                for(int j = 1;j<(n-i);j++){
                    if(gia[j-1]>gia[j]){
                        temp = gia[j];
                        gia[j] = gia[j-1];
                        gia[j-1] = temp;
                    }
                }
            }
        }
        // sắp xếp theo ngày
        public static void selectionShort(loai[] NgN){
    
            // sắp xếp tăng dần
            for(int i = 0;i < NgN.length;i++){
                int index = i;
                for(int a = i + 1;a<NgN.length;a++){
                    if(NgN[a] < NgN[index]){
                    index = a;
                    }
                }
                int bigerNgN = NgN[index];
                 NgN[index]  = bigerNgN;
            }
            }
            public static void selectionShort(loai[] gia){
                // sắp xếp giảm dần
                for(int i = 0;i < gia.length;i++){
                    int index = i;
                    for(int a = i + 1;a<gia.length;a++){
                        if(gia[a] < gia[index]){
                        index = a;
                        }
                    }
                    int bigerGia = gia[index];
                     gia[index]  = bigerGia;
            }
        }
        public void printf(hanghoa HH){
            System.out.println(" In danh sách hàng hóa"+inhanghoa);
        }
}
