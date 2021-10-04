public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sodien = scanner.nextDouble();
        System.out.println("số điện");
        double sotien = scanner.nextDouble();
        System.out.println("số tiền");
        if(sodien<50)
        tien = sodien*1000;
        System.out.println("số tiền điện dưới 50 số" tien);
        if(sodien>=50)
        tien =50*1000+ (sodien-50)*1200;
        System.out.println("số tiền điện trên 50 số" tien);
    }
}
