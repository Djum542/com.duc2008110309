import java.util.concurrent.atomic.DoubleAdder;

public class apple {
    Double ID;
    float KL;
    String color;
    public apple(){

    }
    public apple(Double ID,float KL,String coloString){
        ID = ID;
        KL = KL;
        color = color;
    }
    public void inTT(){
        System.out.println(======== danh sách apple ========);
        System.out.println("mã sản phẩm" + ID,"khối lượng" + KL,"màu sắc" + color);;
    }
}
