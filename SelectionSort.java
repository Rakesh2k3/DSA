import java.util.Scanner;

// Time complexity is L O(n^2)

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" values : ");
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before sorting : ");
        for(int a : arr){
            System.out.print(a+" ");
        }
        int minindex;
        int temp;
        for(int i=0; i<arr.length-1; i++){
            minindex =i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minindex] > arr[j]){
                    minindex = j;
                }
            }
            temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
            System.out.println();
            for(int a : arr) {
                System.out.print(a+" ");
            }

        }
        System.out.println();
        System.out.println("After sorting : ");
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}
