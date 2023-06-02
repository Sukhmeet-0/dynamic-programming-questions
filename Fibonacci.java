import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int qb[]=new int[n+1];
        System.out.println(fibb(n));
        System.out.println(fib(n,qb));
    }
    public static int fibb(int a){
        if(a==0||a==1){
            return a;
        }
        System.out.print("hello: "+a+" , ");
        return fibb(a-1)+fibb(a-2);
    }


 // using dynamic approach

public static int fib(int a,int[]qb){
    if(a==0||a==1){
        return a;
    }
    if(qb[a]!=0){
        return qb[a];
    }
    System.out.print("hello: "+a+" , ");
    int aa=fib(a-1,qb)+fib(a-2,qb);
    qb[a]=aa;
    return aa;
}}
