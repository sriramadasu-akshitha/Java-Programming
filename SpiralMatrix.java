package array_2;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5;
		int [][] arr=spiralMatrix(size);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]<10) {
					System.out.print(arr[i][j]+"  ");
				}
				else {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}

	}
	public static int [][] spiralMatrix(int size){
		int[][] arr=new int[size][size];
		char dir='r';
		int row=0;
		int col=-1;
		for(int i=1;i<=size*size;i++) {
			switch(dir) {
			case 'r':{
				col++;
				arr[row][col]=i;
				if(col==size-1 ||arr[row][col+1]!=0) {
					dir='d';
				}
				break;
			}
			case 'd':{
				row++;
				arr[row][col]=i;
				if(row==size-1 || arr[row+1][col]!=0) {
					dir='l';
				}
				break;
			}
			case 'l':{
				col--;
				arr[row][col]=i;
				if(col==0 || arr[row][col-1]!=0) {
					dir='u';
				}
				break;
			}
			case 'u':{
				row--;
				arr[row][col]=i;
				if(row==1 || arr[row-1][col]!=0) {
					dir='r';
				}
				break;
			}
			}
		}
		return arr;
	}

}
