import javax.lang.model.util.ElementScanner6;

public class timkiemnhiphan {
    int binarysearch(int arr(), int x){
        int n = 0
        int r = arr.length - 1;
        while(1<= r){
            int m = 1 + (r - 1)/2;
            // kiểm tra nếu x là giữa
            if (arr[m] == x) {
                return m;
                // kiểm tra nếu x là đầu múp của phải trái
                if (arr[m] < x) {
                    l = m + 1;
                    //kiểm tra nếu x là nhỏ nhất
                else
                    r = m - 1;
                }
            }
        }return -1;
    }
}
