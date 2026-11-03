package string;

public class VowelsConsonantsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="PROGramming";
		s=s.toUpperCase();
		int ccount=0;int vcount=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			switch(ch) {
			case 'A','E','I','O','U':{
				vcount++;
				break;
			}
			default:ccount++;
			}
		}
		System.out.println("Vowels Count : "+vcount);
		System.out.println("Consonants Count : "+ccount);
	}

}
