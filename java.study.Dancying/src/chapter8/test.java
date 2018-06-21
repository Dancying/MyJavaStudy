package chapter8;

public class test {
	
	public static void main(String[] args) {
		
		int n = 500;
		for (int k = 2; k < n; k++) {
			
				for (int i = 2; i < k; i++) {
					if(k % i == 0) {
						break;
					}
					if(i == k) {
						System.out.println(k + "\t");
					}
					
				}
			
			
		}
	}

}
