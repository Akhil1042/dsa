package sorting;

public class Bubblesort{
    public static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void display(int[] arr){
        System.out.println("Displaying elements: ");
        for(int i:arr){
            System.out.print(i + ", ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        System.out.println("Bubble sort");
        int[] arr = new int[]{5,2,2,5,1};
        display(arr);
        bubbleSort(arr);
        display(arr);
        
    }
}