import java.util.Arrays;

//다음의 숫자들을 오름차순으로 정렬하는 프로그램을 작성하세요.
//        1 10 5 8 7 6 4 3 2 9
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for (int i=0; i<10; i++) {
            int min = 99;
            int index = 0;
            int temp;
            for (int j=i; j<10; j++) {
                if (arr[j]<min) {
                    min = arr[j];
                    index = j;
                }
                System.out.println(min);
                System.out.println(index);
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}