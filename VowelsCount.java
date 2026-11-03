package string;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="PROGramming";
		s=s.toUpperCase();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			switch(ch) {
			case 'A','E','I','O','U':{
				count++;
				break;
			}
			}
		}
		System.out.println(count);

	}

}
