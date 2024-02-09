import java.util.Scanner;
// Time complexity is : O(n^2)
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of values : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" values : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before sorting : ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println("");
            for (int a : arr) {
                System.out.print(a + " ");
            }
        }
        System.out.println("");
        System.out.println("After sorting : ");
        for (int a : arr) {
            System.out.print(a + " ");
        }

    }
}
