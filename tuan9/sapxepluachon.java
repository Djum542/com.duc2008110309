 public static void selectionSort(int[], arr) {
    for(int i= 0; i<arr.lenth;i++){
        imt index = i;
        for(int j = 0;j < arr.lenth;j++){
            if(arr[j] < arr[index]){
                index = j; // tim gia tri nh? nh?t

            }
        }
    }
    int smallerNumber = index;
    index = j;
    j = smallerNumber;
}  
    

