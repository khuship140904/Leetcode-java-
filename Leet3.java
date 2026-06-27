//812. Largest Triangle Area

public class Leet3 {
    public double largestTriangleArea(int[][] points) {
         double largestArea = 0;
         int i = points.length;

                for(int k = 0 ; k<i;k++){
                     for(int l = k+1 ; l<i;l++){
                         for(int m = l+1 ; m<i;m++){
                            int x1 = points[k][0];
                            int y1 = points[k][1];

                            int x2 = points[l][0];
                            int y2 = points[l][1];

                            int x3 = points[m][0];
                            int y3 = points[m][1];

                            double area = Math.abs(
                                         x1 * (y2 - y3)
                                       + x2 * (y3 - y1)
                                       + x3 * (y1 - y2)
                                        ) / 2.0;
                            if (area>largestArea) {
                                largestArea = area;   
                            }
                        }
                    }
                }

                return largestArea;
        
    }

    public static void main(String[] args) {
        Leet3 leet3 = new Leet3();
       int[][] points = {{0,0},{0,1},{1,0},{0,2},{2,0}};

        double largestArea = leet3.largestTriangleArea(points);

        System.out.println(largestArea);
    }
}
