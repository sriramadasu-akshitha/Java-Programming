package array_2;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int [][] res=new int[arr.length][arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				res[j][i]=arr[i][j];
			}
		}
		System.out.println("Transpose of a matrix");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}

	}

}
