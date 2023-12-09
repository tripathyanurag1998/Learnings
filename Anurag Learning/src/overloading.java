class data{
	void add() {
		int a=20,b=30,c;
		c=a+b;
		System.out.println(c);
	}
	void add(int a,int b) {
		int c;
		c=a+b;
		System.out.println(c);
	}
	void add(int x,double y) {
		double z;
		z=x+y;
		System.out.println(z);
	}
}
public class overloading {
	public static void main(String args[]) {
		data obj = new data();
		obj.add();
		obj.add(5,6);
		obj.add(4, 10.5);
	}
}
