public class array2d {
    public static void main(String[] args) {
        int[][] arr = {{1,4,5},
                       {2,3,6},
                       {4,7,9}};

        for (int i = 0;i < arr.length;i++){
            for(int j = 0;j< arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        }
    }

