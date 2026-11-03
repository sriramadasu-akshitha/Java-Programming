package string;

public class ArrangeVowelsInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Person";
		System.out.println(str);
		String vowel="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='A' || ch=='E' ||ch=='I' ||ch=='O' || ch=='U' ||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowel+=ch;
			}
		}
		int j=vowel.length()-1;
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='A' || ch=='E' ||ch=='I' ||ch=='O' || ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				res+=vowel.charAt(j);
				j--;
			}
			else {
				res+=ch;
			}
		}
		System.out.println(res);
	}

}
