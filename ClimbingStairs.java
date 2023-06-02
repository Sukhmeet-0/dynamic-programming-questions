import java.util.Scanner;

//climbing stairs with 1,2 or 3 steps
public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countpaths(n));
        int qb[]=new int[n+1];
        System.out.println(cp(n,qb));
        System.out.println(cptab(n));
    }
    public static int countpaths(int n){
        if(n==0){
            return 1;
        }else if(n<0){
            return 0;
        }
        System.out.print("hello"+n+" , ");
        return countpaths(n-1)+countpaths(n-2)+countpaths(n-3);
    }

    // dynamic approac using memorization
    public static int cp(int n,int []qb){
        if(n==0){
            return 1;
        }else if(n<0){
            return 0;
        }
        if(qb[n]>0){
            return qb[n];
        }
        System.out.print("hello"+n+" , ");
        int aa=cp(n-1,qb)+cp(n-2,qb)+cp(n-3,qb);
        qb[n]=aa;
        return aa;
    }
    // using tabulation
    public static int cptab(int n){
        int[]dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }else if(i==2){
                dp[i]=dp[i-1]+dp[i-2];
            }else{
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }
        }
        return dp[n];
    }
}
