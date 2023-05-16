
import java.util.Scanner;
public class utility {
	
	public static int factor(int numb)
	{
		int fact=1;
		for  (int i= 1;i<=numb;i++)    fact=fact*i;
		return fact;
	}
	public static int summation(int numb)
	{
		int res=0;
		for (;numb>0;numb/=10)   res+=numb%10;
		return res;
	}
	
	public static int power(int base,int exp)
	
	{
		int pow=1;
		for (int i=1;i<=exp;i++)  pow*=base;
		return pow;
	}
	public static int reverse(int num)
	
	{
		int rvrs= 0;
		for (;num>0;num/=10)  
			
		 rvrs= rvrs*10+(num%10);
		return rvrs;
	}
	
	public static int length(int num)
	{
		int leng=0;
		for(int i=1;i<=num;i++)
			leng++;
		return leng;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number ");
		int num =sc.nextInt();
		System.out.println("enter base  number ");
		int bs =sc.nextInt();
		System.out.println("and enter exp  number ");
		int exp =sc.nextInt();
		System.out.println("enter a number ");
		int numb =sc.nextInt();
		
		int res=factor(num);
		int sum=summation(numb);
		int power=power(bs,exp);
		int rvrs=reverse(numb);
		int lng=length(numb); 
		
		System.out.println(num+" factorial is "+res);
		System.out.println(numb+" summation of each digit in this number is "+sum);
		System.out.println(bs+"'s power "+exp+" is "+power);
		System.out.println(numb+" reverse number of this number is "+rvrs);
		System.out.println(numb+" length of this number is "+ lng);
	}

}
