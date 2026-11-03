package string;

public class LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="JAVA$@";
		System.out.println(s);
		System.out.println(toLowerCase(s));
	}
	public static String toLowerCase(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') {
				ch+=32;
				res+=ch;
			}else {
				res+=ch;
			}
		}
		return res;
	}

}
