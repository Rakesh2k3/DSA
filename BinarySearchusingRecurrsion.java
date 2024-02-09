import java.util.Scanner;

public class BinarySearchusingRecurrsion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of values : ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" values");
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target value : ");
        int target = sc.nextInt();
        int result = binarySearch(arr,target,0,arr.length-1);
        if(result != -1){
            System.out.print("Element found at the position "+result);
        }
        else {
            System.out.println("Element not found in the array");
        }

    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, right);
            } else {
                return binarySearch(arr, target, left, mid - 1);
            }
        }
        return -1;
    }
}
