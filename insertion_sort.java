import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int arr[]={10,4,3,6,5,-1,-5};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void insertion(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;

                }

            }

        }
    }
}
