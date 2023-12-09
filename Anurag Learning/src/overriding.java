class name{
	void show() {
		System.out.println("my name is anurag");
	}
}
class nickName extends name{
	@Override
	void show() {
		System.out.println("My name is sipun");
	}
}
public class overriding {
	public static void main(String args[]) {
		name obj=new nickName();
		obj.show();
	}
}
