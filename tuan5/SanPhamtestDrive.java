import java.until.ArryList;
import java.until.List;
public class SanPhamtestDrive{
    public static void main(String[] args) {
        List<SanPham>dsSanPham;
        dsSanPham = new ArryList<>();

        dsSanPham.add("mì hảo", 3000, 0, 0.1f);
        dsSanPham.add("tương chin su", 18000, 0, 0.1f);
        dsSanPham.add("vinamilk", 24000, 0, 0.1f);
        indsSanPham(dsSanPham);
        sapxepdsSanphamtheogia(dsSanPham);
        indsSanPham(dsSanPham);
        System.out.println("sau sắp xếp");
        SanPham sanpham = timSanPhamtheoten("mì hảo", dsSanPham);
        SanPham.inthongtin();
        if(SanPham != null){
            SanPham.inthongtin();

        }else{
            System.out.println("không tìm thấy sản phẩm");

        }
        String tensanpham = "mi hảo";
        xoaSanPham (tensanpham, dsSanPham);
        inSanPham(dsSanPham);
    }
    //hàm
    void nhapdsSanPham(){
        Scanner SanPham = new Scanner(System.in);
        thuesanpham = scanner.nextInt();
        dongia = scanner.nextDouble();
        giamgia = scanner.nextDouble():
        thuesanpham = scanner.nextFloat():

    }
    void indsSanPham(){
        System.out.println("danh sách sản phẩm" + dsSanPham);
        for (SanPham sanpham : dsSanPham) {
            SanPham.inthongtin();
        }
    }
    void sapxepdsSanphamtheogia(List<SanPham>dsSanPham){
    comparator<SanPham> comp;
    com = new comparator<SanPham>(){
        public int compare(SanPham o1, SanPham o2) { 
        return Double.compare(o1.dongia, o2.dongia)
        }
    };
    Collections.sort(dsSanPham, comp)
    }
    SanPham timSanPham(String tennhap, List<SanPham>dsSanPham){
    SanPham sanpham != null;
    for (SanPham sanpham : dsSanPham) {
        if(SanPham.tensanpham.equals(tensanpham))
        result = tensanpham;
        }
        
    }
    return = result;

    static void xoaSanPham(List<SanPham>dsSanPham){
        SanPham sanpham = timSanPhamtheoten(tensanpham, dsSanPham);
        dsSanPham.remove(SanPham);
    }
    int luachon;
    for () {
        System.out.println("1.Nhập danh sách sản phẩm ");
        System.out.println("2. Xem danh sách sản phẩm");
        System.out.println("3. Tìm sản phẩm");
        System.out.println("4. Xóa sản phẩm");
        System.out.println("5. Thoát");
         
        do {
            System.out.println("Bấm số để chọn (1/2/3/4/5): ");
            luachon = scanner.nextInt();
        } while ((luachon < 1) || (luachon > 5));
         
        switch (luachon) {
            case 1:
                System.out.println("Bạn chọn chức năng nhập danh sách!");
                break;
            case 2:
                System.out.println("Bạn chọn chức năng xem danh sách!");
                break;
            case 3:
                System.out.println("Bạn chọn chức năng tìm sản phẩm!");
                break;
            case 4:
                System.out.println("Bạn chọn chức năng xóa sản phẩm!");
                
                break;

            case 5:
                System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                System.exit(0); // thoát chương trình
                break;
        }
    }
    
}