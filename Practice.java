package programming_practice;


public class Practice {

	public static void main(String[] args) {
		int num=3;
		for(int i=1;i<=num;i++) {
			int n=1;int m=i;
			for(int j=1;j<2*num;j++) {
				if(i+j>num && j-i<num) {
					System.out.print(m+++"");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

