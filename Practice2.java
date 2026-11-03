package string;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Programming";
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		System.out.println(s.indexOf('r'));
		System.out.println(s.indexOf('r',3));
		System.out.println(s.lastIndexOf('m'));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,7));
		System.out.println(s.replace("ing","er"));
		String s1="  Java Programming ";
		System.out.println(s1.trim());
	}

}
