class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] output = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int x = queries[i][0];
            int y = queries[i][1];
            int r = queries[i][2];
            
            for(int j = 0; j < points.length; j++){
                if(distanceCalc(x, y, points[j][0], points[j][1]) <= r){
                    output[i]++;
                }
            }
        }
        return output;
    }
    
    public double distanceCalc(int x1, int y1, int x2, int y2){
        double a = Math.pow((x2 - x1), 2);
        double b = Math.pow((y2 - y1), 2);
        return Math.sqrt(a + b);
    }
}
