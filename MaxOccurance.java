package string;

public class MaxOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcaba";
		System.out.println(s);
		int maxfreq=0;char maxchar=' ';
		for(int i=0;i<s.length();i++) {
			int freq=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j))
				{
					freq++;
				}
			}
			if(freq>maxfreq) {
				maxfreq=freq;
				maxchar=s.charAt(i);
			}
		}
		System.out.println(maxchar+"--->"+maxfreq);

	}

}
