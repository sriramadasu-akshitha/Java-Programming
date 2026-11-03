package string;

public class DigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a$1b2@c3";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				System.out.println(ch);
			}
		}

	}

}
