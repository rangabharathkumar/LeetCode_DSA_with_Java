class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long left=1;
        int min_time=Integer.MAX_VALUE;
        for(int wtime : workerTimes){
            min_time=Math.min(min_time,wtime);
        }
        long right =(long)min_time*(long)mountainHeight*(mountainHeight +1)/2;
        long out=right;
        while(left <=right){
            long mid=left+(right-left)/2;

            if(work_finish(mid,mountainHeight,workerTimes)){
                out=mid;
                right =mid-1;
            }else{
                left=mid+1;
            }
        }
        return out;
    }

    private boolean work_finish(long time,int mountainHeight,int[]workerTimes){
        long total_height=0;

        for(int wtime : workerTimes){
            double D =1+8.0 *time /wtime;

            long x=(long)((-1+Math.sqrt(D))/2);

            total_height +=x;
            if(total_height >= mountainHeight)return true;
        }
        return total_height >= mountainHeight;
    }
}