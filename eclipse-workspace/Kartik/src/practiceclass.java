import java.util.Scanner;

public class practiceclass {

	public static void main(String[] args) {
		
		
	}
	

	public void numberexchange() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of 1st number");
		int a=sc.nextInt();
		System.out.println("enter value of 2nd number");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		
	}
	public void reversenumber() {
		int a=22;
		int temp=a;
		int rem=0;
		int rev=0;
		while(a>0) {
			rem=a%10;
			rev=(rev*10)+rem;
			a=a/10;
		}
		System.out.println(rev);
		if(temp==rev) {
			System.out.println(rev);
			
		}
	}
	public void spaceremoval() {
		Scanner sc= new Scanner(System.in);
		String temp=sc.nextLine();
		String newstring="";
		String[] k=temp.split(" ");
		for(int i=0; i<k.length;i++) {
			newstring=newstring+k[i];
		}
		System.out.println(newstring);
	}
	public void fibonacci() {
		int num1=0;
		int num2=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of  number");
		int number=sc.nextInt();
		for(int i=0;i<number;i++) {
			System.out.print(num1+" ");
			int num3=num1+num2;
			num1=num2;
			num2=num3;
		}
		
		
			
	}
	
	
	public void samenuminarray() {
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2= {2,4,6,8};
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
		
	}
	
	
	public void amstrong() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of 1st number");
		int a=sc.nextInt();
		int b=a;
		double temp =0;
		int sum=0;
		while(a>0) {
			temp=a%10;
			sum=(int)(sum+Math.pow(temp,3));
			a=a/10;
			
		}
		System.out.println(sum);
		if(b==sum) {
			System.out.println("It is amstrong number");
		}
		else {
			System.out.println("It is not an amstrong number");
		}
	}
	public void oddeven() {
		double b=00.56;
		 if(b%2==0) {
			 System.out.println("number is Even");
		 }
		 else {
			 System.out.println("number is odd");
		 }
		
	}
    public void factorialcode() {
    	Scanner sc=new Scanner(System.in);
		System.out.println("enter value of 1st number");
		int a=sc.nextInt();
		int fac=1;
		while(a>0) {
			fac=fac*a;
			a--;
			
		}
		System.out.println(fac);
		
		
    }


public void startpattern1() {
	char k='*';
	Scanner sc= new Scanner(System.in);
	int count=sc.nextInt();
	int dervided= count*2;
	System.out.println(dervided);
	for(int i=1;i<=dervided-1;i++) {
		if(i<=count) {
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				
				
			}
			
			
		}
		
		else {
			for(int l=dervided-i;l>0;l--) {
				
				System.out.print(k);
			}
		}
		
		
		System.out.println("");
	}
	}
public void countinnumber() {
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	int count=0;
	while(num>0) {
		count++;
		num=num/10;
	}
	System.out.println(count);}
public void reversestring() {
	Scanner sc= new Scanner(System.in);
	String k=sc.nextLine();
	String rev="";
	char temp;
	System.out.println(k);
	for(int i=k.length()-1;i>=0;i--) {
		temp=k.charAt(i);
		rev=rev+temp;
	}
	System.out.println(rev);}
}

