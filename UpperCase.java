package string;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java$@";
		System.out.println(s);
		System.out.println(toUpperCase(s));
	}
	public static String toUpperCase(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z') {
				ch-=32;
				res+=ch;
			}
			else {
				res+=ch;
			}
		}
		return res;
	}

}
