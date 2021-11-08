package com.ductm2008110309.kiemtraGKlan2;

import java.util.LinkedList;

public class BookNodetestDriver {
    public static void main(String[] args) {
        public static LinkedList bienNhap = new LinkedList<>();
            System.out.println("Chưa có sach: ");
            System.out.print("Hãy nhập ID sach: ");
            int id = bienNhap.nextInt();
            
            System.out.print("Hãy nhập don gia: ");
            float DG = bienNhap.nextFloat();
            
            System.out.print("Hãy nhập so luong: ");
            bienNhap.nextLine();
            String SL = bienNhap.nextLine();
            
            BookNode book = new BookNode(id, DG, SL);
            BookNode head = book;
    }
}
