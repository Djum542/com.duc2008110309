package com.ductm2008110309.kiemtraGKlan2;
public class BookNode {
    int data;
    Node next;
    public Node(){}
}
public Node(int Book){
    Node head = null;
    Node tail = null;

    Book = data;
}
public void isEmpty(){
    if(empty()){
        head = null;
        tail = null;
    }else{

    }
}
   public void themBook(){
       // them dau
    Node newNode = new Node(Book);
    if(empty()){
    head = newNode;
    tail = newNode;
    newNode.next = head;
    newNode = head; 
    }
    // them cuoi
    Node newNode = new Node(Book);
    if(empty()){
        head = newNode;
        tail = newNode;

    }else{
        tai.next = newNode;
        tail = newNode;
    }
    public void BookSearchid(){
        Node current = head;
        wwhile(current != null){
            current = current.next;
            
                
            }
        }
        public void delBook(){
            // xoa cuoi
            int temp;
            while(temp != null){
           Node temp = head;
            temp.next = tail;
            tail = temp;
            }
            // xoa dau
            int temp;
            Node temp = head;
            temp = head;
        }
    }

   }