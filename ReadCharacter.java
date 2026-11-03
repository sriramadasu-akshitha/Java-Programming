package stringRecursion;

public class ReadCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java";
		print(s,0);
	}
	public static void print(String s,int index) {
		if(index>=s.length()) return;
		System.out.println(s.charAt(index));
		print(s,++index);
	}

}
