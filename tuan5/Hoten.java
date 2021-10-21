public class Hoten {
    String Ho;
    String Ten;
    Date NamSinh;
    float diem;

    public Hoten(String Ho, String Ten, Date NamSinh, float diem){
        this.Ho = Họ;
        this.Ten = Tên;
        this.NamSinh = Năm sinh;
        this.diem = Diem;
    }

    // in thoong tin san pham
    void inthongtin() {
        System.out.print("Họ" + Ho);

        System.out.print("Tên" + Ten);
        System.out.print("năm sinh" + NamSinh);
        System.out.print("Điểm" + diem);
    }
}
