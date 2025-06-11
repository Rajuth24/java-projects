package demo;

public class Bublesort {

	public static void main(String[] args) {
		String []b= {"dhoni","jadeja","duba"};
		for(int i=0;i<b.length-1;i++) {
			for(int j=0;j<b.length-i-1;j++) {
				if( b[j].compareTo(b[j+1])>0) {
					String temp=b[j];
				b[j]=b[j+1];
					b[j+1]=temp;
					
				}
			}
		}
		for(String ba:b) {
			System.out.println(ba);
		}
		

	}

}
