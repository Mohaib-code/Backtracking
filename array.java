public class array{
    public static void changeArr(int arr[],int si,int val){
        //Base Case
        if(si == arr.length){
            printArr(arr);
            return;
        }
        //Recursion
        arr[si]=val;
        changeArr(arr, si+1, val+1);
        //Backtrack
        arr[si]=arr[si]-2;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}