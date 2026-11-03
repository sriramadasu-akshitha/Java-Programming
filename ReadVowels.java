package string;

public class ReadVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="PROGramming";
		s=s.toUpperCase();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			switch(ch) {
			case 'A','E','I','O','U':
				System.out.println(ch);
			    break;
			}
		}
	}

}
