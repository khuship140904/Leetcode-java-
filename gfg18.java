//search in a matrix

public class gfg18 {
    public boolean searchMatrix(int[][] mat, int x) {
        boolean flag = false;
        for(int i = 0 ; i<mat.length ; i++){
            for(int j = 0 ; j<mat[i].length ; j++){
                if (x==mat[i][j]) {
                    flag = true;
                    
                }
            }

        }
      return flag;  
        
    }

    public static void main(String[] args) {
        gfg18 g18 = new gfg18();
        int[][] mat = {{6, 23, 21}, {4, 45, 32}, {69, 11, 87}};
        int x = 32;
        System.out.println(g18.searchMatrix(mat , x));
    }
}

