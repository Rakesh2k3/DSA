import java.util.Scanner;
// time complexity is O(n)
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of values : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" values : ");
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before sorting :");
        for(int a : arr){
            System.out.print(a +" ");
        }
        int key,j;
        for(int i=1; i<arr.length; i++){
            key = arr[i];
            j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            System.out.println();
            for(int a : arr) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
        System.out.println("After sorting :");
        for(int a : arr){
            System.out.print(a +" ");
        }
    }
}
