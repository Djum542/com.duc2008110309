package com.ductm2008110309.tuan7
public class MySingleLinkedList {
    Node head, tail;

    public MySingleLinkedList() {
        head = tail = null;
    }

    public addNode(int data){
        // tao mơi nut
        Node newNode = new Node(data);
        //kiem tra danh sach
        if (head = null) {
            //neu danh sach rong
            head = newNode;
            tail = newNode;
            
        }
        else{
            //newNode se duoc lien ket
            // thanh phan lien ket
            tail.next = newNode;
            // newNode se tro thanh nut cuoi
            tail = newNode;
        }
    }

    public void frint{
        // tạo một nút (curent) giữ nút (head)
        Node current = head;
        if(head = null){
            System.out.println("Danh sach rong");
            return;

        }
        System.out.println("Xuat ra cac nut tren lien ket");
        while () {current != null){
            System.out.println(current.info + " ");
            current = current.next;
            }
            System.out.println();
        }
    }
}
