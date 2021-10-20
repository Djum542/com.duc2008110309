import java.util.Scanner;

public class danhsach {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String ho = Scanner.nextLine();
    String ten = Scanner.nextLine();
    System.out.println("Ho va Ten: ");
    Arry.sort(a);
    System.out.println("Sau sort" + Array.toString(a));
    Arry.fill(a, 0);
    System.out.println("Sau fill" + Arry.toString(a));
    String ten = Scanner.nextLine();
    int i = Arry.binarySearch(a);
    System.out.priln("nhap vao vi chi" + i);
    System.out.println("====== MENU ======");
    
    boolean cont = true;
		do {
			System.out.println("Chọn chức năng : [1- 5]");
			int chon = input.nextInt();
			switch (chon) {
			case 1:
				System.out.println("Thực hiện chức năng 1");
				break;
			case 2:
				System.out.println("Thực hiện chức năng 2");
				break;
			case 3:
				System.out.println("Thực hiện chức năng 3");
				break;
            case 4:
				System.out.println("Thực hiện chức năng 4");
				break;
			default:
				System.out.println("Tạm biệt");
				cont = false;
				break;
			}
		} while (cont);
}
}
