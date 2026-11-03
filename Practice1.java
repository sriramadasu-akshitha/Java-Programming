package string;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java";
		s1=s1+"Program";
		String s2="JavaProgram";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		String s3=s1+"";
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}

}
