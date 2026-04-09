import java.util.Arrays;

public class searchIn2D {
    public static void main(String[] args) {
        int arr[] [] = {
                {23, 3, 12},
                {33, 6, 17, 88, 3},
                {4, 78},
        };
        int target = 78;
        int [] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int [] search(int [] [] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
