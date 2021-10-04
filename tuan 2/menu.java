public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Nhập vào a");
        double b = scanner.nextDouble();
        System.out.println("nhập vào b"); 
        double c = scanner.nextDouble();
        System.out.println("nhập vào c");
        double sodien = scanner.nextDouble();
        System.out.println("số điện");
        double sotien = scanner.nextDouble();
        System.out.println("số tiền");
        //Giai phương trình bậc 1
        if(a==0)
        
            if(b==0){
                System.out.println(" vô số nghiệm");
            
            }
            else{
                System.out.println("vô nghiệm");
            }
        else{
            x = -b/a;
            System.out.println("giá trị can tìm" x);
        }
        // Giai phương trình bậc 2
        if(a!=0){
            Delta = (b*b)-4*a*c;
            System.out.println("giá trị của delta");
            if(Delta<0)
            System.out.println(" vô nghiệm");
            if(Delta=0)
            x = -b/(2*a);
            System.out.println("có nghiệm kép" x);
            if(Delta>0)
            x1= (-b+Math.sqrt(delta))/(2*a);
            x2= (-b-Math.sqrt(delta))/(2*a);
            System.out.println("nghiệm phân biệt" x1,x2);
        }
        // Tính tiền điện
        if(sodien<50)
        tien = sodien*1000;
        System.out.println("số tiền điện dưới 50 số" tien);
        if(sodien>=50)
        tien =50*1000+ (sodien-50)*1200;
        System.out.println("số tiền điện trên 50 số" tien);
        
        boolean cont = true;
		do {
			System.out.println("Chọn chức năng : [1- 4]");
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
			default:
				System.out.println("Tạm biệt");
				cont = false;
				break;
			}
		} while (cont);
    }
}
