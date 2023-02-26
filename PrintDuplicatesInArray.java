package week3.day1;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		//declare an integer array
		int[] number= {11,22,33,44,55,66,22,77,11};
		//iterate the array
		for(int i=0;i<number.length;i++) {
			//iterate from i+1
			for(int j=i+1;j<number.length;j++) {
				//compare both the value
				if(number[i]==number[j]) {
					System.out.println(number[i]);
				}
			}
		}

	}

}
