package array_2;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5;
		int [][] arr=new int[size][];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new int[i+1];
			for(int j=0;j<arr[i].length;j++) {
				if(i==j || j==0) {
					arr[i][j]=1;
				}
				else {
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
