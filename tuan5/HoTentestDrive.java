public class Main {
    public static void main(String[] args) {

        List<SanPham> dsHoTen;
        dsHoTen = new ArryList<>();

        dsHoTen.add("Trần", "Trung", 10 / 08 / 2002, 5.0f);
        dsHoTen.add("Đỗ", "Phong", 14 / 02 / 2002, 5.4f);
        dsHoTen.add("Lộ", "Dao", 19 / 04 / 1992, 7.0f);
        indsHoTen(dsHoTen);
        sapxepdsHoTentheoten(dsHoTen);
        indsHoTen(dsHoTen);
        System.out.println("sau sắp xếp");
        Hoten hoten = timHoTentheoten("Trung", dsHoTen);
        Hoten.inthongtin();
        if (Hoten != null) {
            Hoten.inthongtin();

        } else {
            System.out.println("không tìm thấy tên");

        }
        String hoten = "Trung";
        xoaHoTen(hoten, dsHoTen);
        indsHoTen(dsHoTen);
    }

    // hàm
    void nhapdsHoTen(){
        Scanner hoten = new Scanner(System.in);
        Ho = scanner.nextInt();
        Ten = scanner.nextInt();
        NamSinh = scanner.nextInt():
        diem = scanner.nextFloat():

    }

    void indsHoTen() {
        System.out.println("danh sách ho tên" + dsHoTen);
        for (Hoten hoten : dsHoTen) {
            Hoten.inthongtin();
        }
    }

    void sapxepdsHoTentheoten(List<Hoten>dsHoTen){
    comparator<Hoten> comp;
    com = new comparator<Hoten>(){
        public int compare(Hoten o1, Hoten o2) { 
        return Double.compare(o1.dongten, o2.dongten)
        }
    };
    Collections.sort(dsHoTen, comp)
    }

    HoTen timHoTen(String tennhap, List<HoTen>dsHoTen){
    HoTen hoten != null;
    for (HoTen hoten : dsHoTen) {
        if(HoTen.hoten.equals(hoten))
        result = hoten;
        }
        
    }return=result;

    static void xoaHoTen(List<HoTen>dsHoTen){
        HoTen hoten = timHoTentheoten(hoten, dsHoTen);
        dsHoTen.remove(HoTen);
    }

    int luachon;for()
    {
        System.out.println("1.Nhập danh sách họ tên ");
        System.out.println("2. Xem danh sách họ tên");
        System.out.println("3. Tìm họ tên");
        System.out.println("4. Xóa họ tên");
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
            System.out.println("Bạn chọn chức năng tìm họ tên!");
            break;
        case 4:
            System.out.println("Bạn chọn chức năng xóa họ tên!");

            break;

        case 5:
            System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
            System.exit(0); // thoát chương trình
            break;
        }
    }

}
