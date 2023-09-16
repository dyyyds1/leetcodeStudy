package top100;

public class lc495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length==1){
            return duration;
        }
        int ret=0;
        for (int i = 0; i < timeSeries.length-1; i++) {
            if (timeSeries[i+1]-timeSeries[i]>=duration){
                ret+=duration;
            }else {
                ret+=timeSeries[i+1]-timeSeries[i];
            }
        }

        return ret+duration;
    }
}
