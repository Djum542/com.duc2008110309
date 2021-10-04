public class Main {
    public static void main(String[] args) {
        Scanner scanner = new scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Nhập vào a");
        double b = scanner.nextDouble();
        System.out.println("nhập vào b"); 
        double c = scanner.nextDouble();
        System.out.println("nhập vào c");
        
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

    }
}
