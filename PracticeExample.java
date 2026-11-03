package array_2;

public class PracticeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr=new int[3][3];
		System.out.println(arr);
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[0].length);
		//reading default values
		System.out.println(arr[0][0]);
		System.out.println(arr[1][2]);
		System.out.println(arr[2][1]);
		//initializing values
		arr[0][0]=5;
		arr[1][2]=3;
		arr[2][1]=7;
		System.out.println(arr[0][0]);
		System.out.println(arr[1][2]);
		System.out.println(arr[2][1]);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
