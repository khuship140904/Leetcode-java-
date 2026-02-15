//1351. Count negative numbers in a sorted matrix

public class E {
    public int countNegatives(int[][] grid){
        int count=0;

        for(int i=0; i<grid.length;i++){
            for(int j=0; j<grid[i].length;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        E e = new E();

        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

        System.err.println(e.countNegatives(grid));
    }
    
}
