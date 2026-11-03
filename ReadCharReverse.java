package stringRecursion;

public class ReadCharReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java";
		print(s,s.length()-1);

	}
	public static void print(String s,int index) {
		if(index<0)return;
		System.out.println(s.charAt(index));
		print(s,--index);
	}

}
