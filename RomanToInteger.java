package string;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="VII";
		System.out.println(romanToInt(str));
	}
	public static int romanToInt(String str) {
		int res=0;
		for(int i=0;i<str.length();i++) {
			int r1=integers(str.charAt(i));
			if(i+1<str.length()) {
				int r2=integers(str.charAt(i+1));
				if(r1>=r2) {
					res+=r1;
				}
				else {
					res+=r2-r1;
					i++;
				}
			}else {
				res+=r1;
			}
		}
		return res;
	}
	public static int integers(char ch) {
		switch(ch) {
		case 'I':return 1;
		case 'V':return 5;
		case 'X':return 10;
		case 'L':return 50;
		case 'C':return 100;
		case 'D':return 500;
		case 'M':return 1000;
		}
		return 0;
	}

}
