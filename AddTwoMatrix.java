package array_2;

public class AddTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a= {{1,2,3},{3,2,1},{2,1,3}};
		int [][] b= {{1,3,2},{2,1,3},{3,2,1}};
		int [][] res=new int[a.length][a.length];
		System.out.println("Matrix a");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix b");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				res[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Addition");
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
