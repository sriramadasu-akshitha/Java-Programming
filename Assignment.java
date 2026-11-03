package array_2;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5;
		int [][] arr=assignmentMatrix(size);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]<10) {
					System.out.print(arr[i][j]+"  ");
				}
				else {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();		}

	}
	public static int [][] assignmentMatrix(int size){
		int [][] arr=new int[size][size];
		int value = 1;
	    for (int col = 0; col < size; col++) {

	        if (col % 2 == 0) {
	            for (int row = 0; row < size; row++) {
	                arr[row][col] = value++;
	            }
	        } else {
	            for (int row = size - 1; row >= 0; row--) {
	                arr[row][col] = value++;
	            }
	        }
	    }

		return arr;
	}

}
