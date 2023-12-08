class construct{
	int a;
	String name;
	construct(){
		a=20;
		name="john";
	}
	void show() {
		System.out.println(a+" "+name);
	}
}

public class consturctor {
	public static void main(String args[]) {
		construct obj = new construct();
		obj.show();
	}
}
