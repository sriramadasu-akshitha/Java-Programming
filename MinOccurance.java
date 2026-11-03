package string;

public class MinOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcaba";
		System.out.println(s);
		int minfreq=s.length();
		char minchar=' ';
		for(int i=0;i<s.length();i++) {
			int freq=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					freq++;
				}
			}
			if(freq<minfreq) {
				minfreq=freq;
				minchar=s.charAt(i);
			}
		}
		System.out.println(minchar+"--->"+minfreq);

	}

}
