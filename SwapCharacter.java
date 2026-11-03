package string;

public class SwapCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		int i=0;
		int j=1;
		System.out.println(swap(s,i,j));
	}
	public static String swap(String s,int i,int j) {
		if(i==j)return s;
		char [] ch=s.toCharArray();
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return new String(ch);
	}

}
