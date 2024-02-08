import java.util.Scanner;
// Time complexity is : O(n)
public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target value : ");
        int target = sc.nextInt();
        int result = linearSearch(arr,target);
        if(result != -1) {
            System.out.println("Element found at the position : "+result);
        }
        else {
            System.out.println("Element not found in the array");
        }

    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return  -1;
    }
}
