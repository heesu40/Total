package chap01;
// 최대값 구하기 , 최소값 구하기

public class max_min {
	
	static int max3(int a , int b , int c) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		return max;
	}
	
	static int max4(int a , int b , int c , int d) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if( d > max) {
			max = d;
		}
		
		return max;
	}
	
	static int min4(int a , int b , int c , int d) {
		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		if( d < min) {
			min = d;
		}
		
		return min;
	}
	public static void main(String[] args) {
		
		System.out.println("최대값은: " + max3(1,2,3));
		System.out.println("최대값은: " + max4(1,2,3,4));
		System.out.println("최소값은: " + min4(1,2,3,4));
		
	}

}
