package stringRecursion;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java";
		System.out.println(print(s,s.length()-1));
	}
	public static String print(String s,int index) {
		if(index<1)return s.charAt(index)+"";
		return s.charAt(index)+""+print(s,--index);
	}

}
