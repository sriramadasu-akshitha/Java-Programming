package string;

public class ReverseEachWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World Hii";
		String res="";
		String [] arr=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			String s=arr[i];
			String rev="";
			for(int j=s.length()-1;j>=0;j--) {
				rev+=s.charAt(j);
			}
			if(i==arr.length-1)
			{
				res+=rev;
			}
			else {
				res+=rev+" ";
			}
		}
		System.out.println(res);

	}

}
