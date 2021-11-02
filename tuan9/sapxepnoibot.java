public class bubbleSort{
static void  bubbleSort(int[], ar){
    int n = arr.length;
    int temp = 0;
    for(int i = 0;i < arr.length;i++){
        for(int j = 0;j < n-i;j++){
            if(arr[j]> arr[j-1]){
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr = temp;
            }
        }
    }
}
}