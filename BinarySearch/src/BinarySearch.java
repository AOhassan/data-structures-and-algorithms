public class BinarySearch {
    public static int binarySearch(int[] arr, int num){

        int front = 0;
        int back = arr.length - 1;
        int half = (front + back) / 2;

        while(front <= back){
            if(arr[half] == num) {
                return half;
            }
            else if (num > arr[half]){
                front = half + 1;
            }
            else {
                back = half - 1;
            }
        }

        return -1;

    }
}
