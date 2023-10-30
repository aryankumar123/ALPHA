package Array2D;

public class StairCaseSearch {
    public static void main(String args[]) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 10 }
        };   
        int key = 8;               
        stairCaseSearch(matrix,key);                                    // optimal 
    }


    static boolean stairCaseSearch(int[][] matrix , int key) {
        int row = 0; int col = matrix[0].length -1;
        while(row < matrix.length && col >=0){
            if(matrix[row][col] == key){
                System.out.println( "found at " + row + "," + col);
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
       System.out.println("key not found");
       return false;
    }
}
