package array_2;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a= {{1,2,3},{3,2,1},{2,1,3}};
		int [][] b= {{1,3,2},{2,1,3},{3,2,1}};
		int [][] res=new int[a.length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i].length;k++) {
					res[i][j]=res[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res.length;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}

	}

}
