package hello;

public class Addition {
	//int a = 0, b= 0,c=0 ;
	int c=0;
	
	void add(int a , int b) {
		c=a+b;
		System.out.println("add is " + c);
	}
	
	void sub(int a,int b) {
		c=a-b;
		System.out.println("sub is " + c);
	}
	
	
	public static void main(String args[]) {
		
		Addition ad= new Addition();
		ad.add(5, 6);
		ad.sub(5, 2);
	//System.out.println();
		
	}

}
