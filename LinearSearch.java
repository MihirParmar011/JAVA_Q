public class LinearSearch {
    public static int linearSearch(int[] arr, int key){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]== key){
                return i;
            }
        } return -1;
    }

    public static void main(String[] args) {

        int[] arr = {15,54,53,32,65,37,49,59,12,60};
        int key = 32;

        int result =linearSearch(arr, key);
        if (result != -1){
            System.out.println(key+" is in Index: "+result);
        }else {
            System.out.println(key+" not found in array.");
        }

    }
}
