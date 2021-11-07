public class selectionSort {
public static void selectionSort(int[], arr) {
    for(int i= 0; i<arr.lenth;i++){
        int index = i;
        for(int j = 0;j < arr.lenth;j++){
            if(arr[j] < arr[index]){
                index = j; // tim gia tri nho nhất

            }
        }
    }
    int smallerNumber = index;
    arr[index] = arr[i];
    arr[i] = smallerNumber;
    }  
}
