package string;

public class ReadOccuranceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="JAVA";
		System.out.println(s);
		for(int i=0;i<s.length();i++) {
			int freq=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					freq++;
				}
			}
			System.out.println(s.charAt(i)+"--->"+freq);
		}

	}

}
