package com.ductm2008110309.kiemtraGKlan2
public class BookInventory {
    ArryList<Book> 
    inventory = new ArryList();
    public BookInventory(){}
    public void Them(Book book){
        inventory.add(book);

    }
   
    public void inBookInventory(){
        for (Book book : inventory) {
            apple.printApple();
        }
    }

    public  findBookMoney(String money){
        ArrayList<Book> results = new ArrayList<>();

        for (Book book : inventory) {
            if(book.money.equalsIgnoreCase(money)){
                results.add(book);
            
        }
        }

        return results;
    }

        
    
}
