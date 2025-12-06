package practice;

public class practice_2 {

	public static void main(String[] args) {
		practice_2 obj= new practice_2();
		int x=obj.x(3);
		System.out.println(x);
		
	}
	
	public int x(int x) {
		int u=x();
		int z=y(10);
		int y= x*2;
		return u+z+y;
	}
	
	public static int x() {
		return 9;
	}

	public int y(int x) {
		int y= x/2;
		return y;
	}
}
