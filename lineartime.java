package demo;

public class lineartime {

	
		public static void printAllElements(int[] arr) {
			for(int i=0;i<arr.length;i++) {
				System.out.println("Elements " + i + ":" + arr[i]);
			}
		}
		public static void main(String[] args) {
			int[] num = { 10,20,30,40,50,60,70,80,90,100,200,300,400,500,600,700,800,900,1000};
			printAllElements(num);

	}

}
