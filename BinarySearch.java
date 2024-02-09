import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" value");
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target value : ");
        int target = sc.nextInt();
        int result = binarySearch(arr,target);
        if(result != -1){
            System.out.println("Element found at the position : "+result);
        }
        else {
            System.out.println("element not found in the array");
        }

    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left + right)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]<target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;

    }
}
