class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(interval1,interval2)->interval1[0]-interval2[0]);
        int j=0;
        int end=intervals[0][1];
        List<int[]>answer=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            int start=intervals[i][0];
            if(start>end){
                answer.add(new int[] {intervals[j][0],end});
                j=i;
            }
            
            end=Math.max(intervals[i][1],end);
        }
        answer.add(new int[] {intervals[j][0],end});
        return answer.toArray(new int[answer.size()][2]);
    }
}
            
