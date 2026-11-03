package string;

public class PalindromeInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I Love My Mom and Dad";
		String [] arr=s.split(" ");
		for(int k=0;k<arr.length;k++) {
			if(palindrome(arr[k])) {
				System.out.println(arr[k]);
			}
		}

	}
	public static boolean palindrome(String s) {
		if(s.length()<2) return true;
		s=s.toUpperCase();
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;j--;
		}
		return true;
	}

}
