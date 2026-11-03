package string;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		int start=0;
		int end=str.length()-1;
		permutations(str,start,end);
	}
	public static void permutations(String str,int start,int end) {
		if(start==end) {
			System.out.println(str);
			return;
		}
		for(int k=start;k<=end;k++) {
			str=swap(str,start,k);
			permutations(str,start+1,end);
			str=swap(str,start,k);
		}
	}
	public static String swap(String str,int i,int j) {
		if(i==j)return str;
		char [] ch=str.toCharArray();
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return new String(ch);
	}
}
