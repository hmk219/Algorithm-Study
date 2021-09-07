/*삽입 정렬을 완전히 이해하기 위해서 삽입 정렬이 수행되는 과정을 일일이 출력하는 프로그램을 작성해 볼 수 있습니다.
다음과 같이 여러 개의 숫자가 들어왔을 때 이를 삽입 정렬하는 과정을 출력해보세요.

< 예시 입력 >
26 5 37 1 61 11 59 15 48 19

< 예시 출력 >
26
5 26
5 26 37
1 5 26 37
1 5 26 37 61
1 5 11 26 37 61
1 5 11 26 37 59 61
1 5 11 15 26 37 59 61
1 5 11 15 26 37 48 59 61
1 5 11 15 19 26 37 48 59 61 */

public class InsertionSort2 {
    public static void main(String[] args) {
        int[] arr = {26, 5, 37, 1, 61, 11, 59, 15, 48, 19};

        for (int i=0; i<9; i++) {

            for (int k=0; k<=i; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();

            int j = i;
            while (j>=0 && arr[j]>arr[j+1]) {
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
