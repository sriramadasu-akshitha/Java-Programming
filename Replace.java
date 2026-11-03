package string;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="JAVA";
		char oldChar='A';
		char newChar='$';
		System.out.println(s);
		System.out.println(replace(s,oldChar,newChar));
	}
	public static String replace(String s,char oldChar,char newChar) {
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==oldChar) {
				res+=newChar;
			}
			else {
				res+=ch;
			}
			
		}
		return res;
	}

}
