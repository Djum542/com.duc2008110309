package com.ductm2008110309.baikiemtraCK;

import org.w3c.dom.Node;
import java.util.Arrays;
import java.util.List;

public class hanghoaLinkedList {
    Node head = null;
    Node tail = null;
    String nhap = new String();
    int loai;
    int id;
    int TenSP;
    float DG;
    double SL;
    date NgN;
    public void hanghoaLinkedList(){
        hanghoaLinkedList<String> Hanghoa = new LinkedList<>();
        Hanghoa.add("Thực phẩm ", "THP358784", "thịt", "150.000", "150", "30/11/2021");
        Hanghoa.add("Thực phẩm ", "THP676575", "Bơ ", "15.000", "300", "30/11/2021");
        Hanghoa.add("Thực phẩm ", "THP629388", "sữa chua", "20.000", "1000", "30/11/2021");
        Hanghoa.add("Thực phẩm ", "THP532837", "Xúc xích", "55.000", "1200", "30/11/2021");
        Hanghoa.add("Thực phẩm ", "THP237382", "Lạp xưởng", "180.000", "500", "30/11/2021");
        Hanghoa.add("Thực phẩm ", "THP236382", "Kem", "4.000", "325", "30/11/2021");
        Hanghoa.add("Thực phẩm ", "THP364647", "Dầu thực vật", "62.000", "150", "30/11/2021");
        Hanghoa.add("Thực phẩm ", "THP472829", "Mì tôm", "135.000", "500", "30/11/2021");
        Hanghoa.add("Thực phẩm ", "THP382362", "Mực", "120.000", "650", "30/11/2021");
        Hanghoa.add("Thực phẩm ", "THP469327", "Tôm", "90.000", "700", "30/11/2021");
        Hanghoa.add("Thực phẩm ", "THP434938", "Gạo", "14.000", "1000", "30/11/2021");
        Hanghoa.add("Thực phẩm ", "THP537498", "Ngũ cốc", "68.000", "727", "30/11/2021");
        Hanghoa.add("Thực phẩm ", "THP456343", "Sữa", "240.000", "3540", "30/11/2021");
        Hanghoa.add("Thực phẩm ", "THP343873", "Bia", "167.000", "4500", "30/11/2021");
        Hanghoa.add("Thực phẩm ", "THP463745", "Nước ngọt", "448.000", "4300", "30/11/2021");
        Hanghoa.add("Thực phẩm ", "THP564364", "Gia vị", "745.000", "4578", "30/11/2021");
        Hanghoa.add("Gốm sứ", "GS585494", "Bình ", "88.000", "380", "25/07/2021");
        Hanghoa.add("Gốm sứ ", "GS358784", "Hộp ", "125.000", "4678", "25/07/2021");
        Hanghoa.add("Gốm sứ ", "GS568338", "Đĩa", "134.000", "457", "25/07/2021");
        Hanghoa.add("Điện tử ", "DT563478", "tivi", "3.460.000", "487", "06/5/2021");
        Hanghoa.add("Điện tử ", "DT647346", "Tủ lạnh", "6.760.000", "867", "06/5/2021");
        Hanghoa.add("Điện tử ", "DT675438", "Lò vi ba", "4.050.000", "486", "06/5/2021");
        Hanghoa.add("Điện tử ", "DT5462384", "Quạt ", "1.578.000", "459", "06/5/2021");

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
    // tìm hang hóa
    public void findhanghoa(hanghoa HH) {
        Node node = null;
        //điều kiện
        if(isEmtpy()){
            System.out.print("danh sách rỗng");
        }else{
            Node curent;
            curent = head;
            //vòng lặp
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
    // thay đổi thông tin hàng hóa
    public void thaydoi(hanghoa HH){
        Node newNode = new Node();
            
        //điều kiện
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
    // sắp xếp lựa chọn
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
        public String printf(){
            System.out.println(" In danh sách hàng hóa" + );
        }
        public void tonghanghoa(hanghoa HH){
            List<String> list = Arrays.asList();

        int count = 0;

        for (String string : list) {

            System.out.println(string);

            count++;

        }


    }


}

