import java.util.Scanner;public class Main {	public static void main(String[] args) {		Scanner sc=new Scanner(System.in);				int N=sc.nextInt();		int max=Integer.MIN_VALUE;		int min=Integer.MAX_VALUE;				int maxdp[]=new int[3];		int mindp[]=new int[3];				for(int i=0;i<N;i++) {			int a=sc.nextInt();			int b=sc.nextInt();			int c=sc.nextInt();			int d,e,f;			if(i>=1) {								d=Math.max(maxdp[0]+a, maxdp[1]+a);				e=Math.max(maxdp[0]+b, Math.max(maxdp[1]+b, maxdp[2]+b));				f=Math.max(maxdp[1]+c, maxdp[2]+c);				maxdp[0]=d;				maxdp[1]=e;				maxdp[2]=f;								d=Math.min(mindp[0]+a, mindp[1]+a);				e=Math.min(mindp[0]+b, Math.min(mindp[1]+b, mindp[2]+b));				f=Math.min(mindp[1]+c, mindp[2]+c);				mindp[0]=d;				mindp[1]=e;				mindp[2]=f;			}else if(i==0) {				maxdp[0]=mindp[0]=a;				maxdp[1]=mindp[1]=b;				maxdp[2]=mindp[2]=c;			}					}				for(int i=0;i<3;i++) {			max=Math.max(max, maxdp[i]);			min=Math.min(min, mindp[i]);		}		System.out.println(max+" "+min);	}}