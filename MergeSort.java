import java.util.Scanner;
// Time complexity is : O(n logn)
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of values : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" values : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting : ");
        for(int a : arr){
            System.out.print(a+" ");
        }
        mergeSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("After Sorting : ");
        for(int a : arr){
            System.out.print(a+" ");
        }
    }

    private static void mergeSort(int[] arr, int l, int r) {

        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int lArr[] = new int[n1];
        int rArr[] = new int[n2];
        for(int x=0; x<n1; x++){
            lArr[x] = arr[l+x];
        }
        for(int x=0; x<n2; x++){
            rArr[x] = arr[mid+1+x];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2) {
            if(lArr[i]<=rArr[j]){
                arr[k] = lArr[i];
                i++;
            }
            else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
}
