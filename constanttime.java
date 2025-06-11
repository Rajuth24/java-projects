package demo;

public class constanttime {

	
		public static void printFirstElement(int[]arr) {
			if(arr.length >0) {
				System.out.println("First element is: "+arr[0]);
			}else {
				System.out.println("Array is empty");
		
			}
		}
		public static void main(String[] args) {
			int []num= {10,24,28,06};
			printFirstElement(num);
		

	}

}
