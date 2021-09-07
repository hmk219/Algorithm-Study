//다음의 숫자들을 오름차순으로 정렬하는 프로그램을 작성하세요.
//        1 10 5 8 7 6 4 3 2 9

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for (int i=0; i<9; i++) {
            int j = i;
            while (j>=0 && arr[j]>arr[j+1]) {
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
