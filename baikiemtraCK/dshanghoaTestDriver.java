import java.util.LinkedList;
import java.util.Scanner;

public class dshanghoaTestDriver {
    public static void main(String[] args) {
        dshanghoa<String> Hanghoa = new LinkedList<>();
        Hanghoa.add("Thực phẩm ", "THP358784", "thịt", "150.0000", "150", "30/11/2021");
        Scanner nhap = new Scanner(System.in);
        int chon;
        do{
            System.out.println("============= MENU ===========");
            System.out.println(">>1, Thêm hàng hóa vào danh sách");
            System.out.println(">>2, Xóa hàng hóa trong danh sách");
            System.out.println(">>3, Thay đổi thông tin hàng hóa trong danh sách");
            System.out.println(">>4, Tìm kiếm hàng hóa trong danh sách");
            System.out.println(">>5, Sắp xếp hàng hóa trong danh sách");
            System.out.println(">>6, In ra hàng hóa trong danh sách");
            System.out.println(">>7, kết thúc chương trình");
            System.out.println(">>1, Nhập vào lựa chọn từ (1-> 7): ");
            chon = nhap.nextInt();
            witch(chon){
                case 1:
                    dshanghoa.themdau();
                    dshanghoa.themcuoi();
                    break;
                case 2:
                    dshanghoa.delete();
                    break;
                case 3:
                    dshanghoa.thaydoi();
                    break;
                case 4:
                    dshanghoa.findhanghoa();
                    break;
                case 5:
                    dshanghoa.selectionShort();
                    dshanghoa.bubbleSort();
                    break;
                case 6:
                    dshanghoa.printf();
                    break;
                case 7:
                    System.out.println("Kết thúc");
                    break;
            }
            System.out.println("Quay lại MENU (1:yes/0:no):");
            chon = nhap.nextInt();
            
        }while(chon == 1);
        nhap.close();
    }
}
