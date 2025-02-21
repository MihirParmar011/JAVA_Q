public class FindNum {

    public static void main(String[] args) {

        int [] arr = {25,55,25,75,35,85,105,35,75,65,85,45,45};
        int key = 35;
        int count = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==key){
                count++;
            }
        }
        System.out.println(key+" Has Occured "+count+ " times.1");
    }
}
