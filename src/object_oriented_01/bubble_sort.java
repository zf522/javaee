/**
 * FileName: bubble_sort
 * Author:   16681
 * Date:     2019/3/20 19:53
 * Descriptioin: 对数组进行冒泡排序
 */
package object_oriented_01;

public class bubble_sort {
    public  static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {25, 24, 12, 76, 101, 96, 28};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printarr(arr);
    }
}
