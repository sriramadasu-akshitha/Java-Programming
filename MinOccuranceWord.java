package string;

public class MinOccuranceWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="apple banana orange apple banana apple";
		String [] arr=str.split(" ");
		int minfreq=arr.length;
		String minchar=" ";
		for(int i=0;i<arr.length;i++) {
			int freq=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					freq++;
				}
			}
			if(freq<minfreq) {
				minfreq=freq;
				minchar=arr[i];
			}
		}
		System.out.println(minchar+"--->"+minfreq);

	}

}
