import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int r = sc.nextInt();
        System.out.print("Columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                System.out.print("Enter "+i+j+" element: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("What to Search?: ");
        int to_find = sc.nextInt();
        searchElement2DArray(to_find,arr,r,c);
    }

    public static void searchElement2DArray(int n, int[][] arr, int r,int c){
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                if(arr[i][j] == n){
                    System.out.println("Found at i: "+i+", j: "+j);
                    return;
                }else {
                    System.out.println("Not Found!");
                }
            }
        }
    }
}
