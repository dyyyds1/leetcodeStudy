package august_Code_Exercise;

public class lc978 {
    public int maxTurbulenceSize(int[] arr) {
        int n=arr.length;
        //f为某一个节点为上升趋势，g反之
        int[] f=new int[n];
        int[] g=new int[n];
        for (int i = 0; i < n; i++) {
            f[i]=g[i]=1;
        }
        int fmax=1,gmax=1;
        for (int i = 1; i < n; i++) {
            if (arr[i]>arr[i-1]){
                f[i]=g[i-1]+1;
            }
            if (arr[i]<arr[i-1]){
                g[i]=f[i-1]+1;
            }
            fmax=Math.max(fmax,f[i]);
            gmax=Math.max(gmax,g[i]);
        }
       return Math.max(fmax,gmax);
    }
}
