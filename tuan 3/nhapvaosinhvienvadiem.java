public class SNT{
    public static void main(String[] args){
        int diem;
        Scanner nhapvao = new Scanner(System.in);
        nhapvao = ScannerLine();
        if(diem<5)
        System.out.println("học lực yếu");
        if(6.5<=diem<7.5)
        System.out.println("học lực Trung binh");
        if(7.5<=diem<9)
        System.out.println("học lực Kha");
        if(diem>9)
        System.out.println("học lực Gioi");
    }
}