package chap01;
// �ִ밪 ���ϱ� , �ּҰ� ���ϱ�

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
		
		System.out.println("�ִ밪��: " + max3(1,2,3));
		System.out.println("�ִ밪��: " + max4(1,2,3,4));
		System.out.println("�ּҰ���: " + min4(1,2,3,4));
		
	}

}
