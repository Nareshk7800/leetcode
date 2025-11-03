class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        for(int point:cardPoints){
            total+=point;
        }
        if(k==n)
        return total;
        int windowsize = n-k;
        int current = 0;

        for(int i=0;i<windowsize;i++){
            current+=cardPoints[i];
        }
        int min = current;

        for(int i=windowsize;i<n;i++){
            current+=cardPoints[i]-cardPoints[i-windowsize];
            min = Math.min(min,current);
        }
        return total-min;
    }
}