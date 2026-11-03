package string;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="MaLAYalAM";
		if(palindrome(s)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}

	}
	public static boolean palindrome(String s) {
		if(s.length()<2) return true;
		s=s.toUpperCase();
		int i=0;int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)){
				return false;
			}
			i++;j--;
		}
		return true;
	}

}
