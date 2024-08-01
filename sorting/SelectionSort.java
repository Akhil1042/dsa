package sorting;

import commonUtil.CommonUtil;

public class SelectionSort {

    /*
     * Selection Sort:
     * The algorithm repeatedly selects the smallest(or largest) element from the list unsorted
     * portion and move them into sorted portion of the list.
     */

    public static int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }
            // if(arr[i]>arr[smallest]){
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
            // }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,6,2,7,2,4};
        CommonUtil.display(arr);
        arr = selectionSort(arr);
        CommonUtil.display(arr);
    }
}
