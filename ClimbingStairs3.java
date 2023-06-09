import java.util.Scanner;

// steps as ith element
public class ClimbingStairs3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Integer []dp=new Integer[n+1];
        dp[n]=0;
        for(int i=n-1;i>=0;i--){
            if(a[i]>0){
                int min=Integer.MAX_VALUE;
                for(int j=1;j<=a[i] && i+j<dp.length ;j++){
                    if(dp[i+j]!=null){
                        min=Math.min(min,dp[i+j]);
                    }
                }
                if(min!=Integer.MAX_VALUE){
                    dp[i]=min+1;
                }else{
                    dp[i]=null;
                }
            }
        }
        System.out.println(dp[0]);
    }
}
