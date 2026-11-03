package string;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java";
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res+=s.charAt(i);
		}
		System.out.println(res);
	}

}
