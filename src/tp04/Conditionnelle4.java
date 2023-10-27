package tp04;
import java.util.Arrays;

public class Conditionnelle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		int p6 = mediane5(p1, p2, p3, p4, p5);
		System.out.println(p6);
	}
	
	public static int mediane5(int p1, int p2, int p3, int p4, int p5) {
		int[] array_int = new int[5];
		array_int[0] = p1;
		array_int[1] = p2;
		array_int[2] = p3;
		array_int[3] = p4;
		array_int[4] = p5;
		tri_insertion(array_int);
		return array_int[3];
//		int n1, n2, n3, n4, n5;
//		if (p1 >= p2) {
//			n1 = p2; 
//			n2 = p1;
//			}
//		else {
//			n1 = p1;
//			n2 = p2;
//		}
//		
//		if (p3 >= n2) n3 = p3;
//		else if (p3 >= n1) {
//			n3 = n2;
//			n2 = p3;
//		}
//		else {
//			n3 = n2;
//			n2 = n1;
//			n1 = p3;
//		}
//		
//		if (p4 >= n3) n4 = p4;
//		else if (p4 >= n2) {
//			n4 = n3;
//			n3 = p4;
//		}
//		else if (p4 >= n1) {
//			n4 = n3;
//			n3 = n2;
//			n2 = p4;
//		}
//		else {
//			n4 = n3;
//			n3 = n2;
//			n2 = n1;
//			n1 = p4;
//		}
//		
//		if (p5 >= n4) n5 = p5;
//		else if (p5 >= n3) {
//			n5 = n4;
//			n4 = p5;
//		}
//		else if (p5 >= n2) {
//			n5 = n4;
//			n4 = n3;
//			n3 = p5;
//		}
//		else if (p5 >= n1) {
//			n5 = n4;
//			n4 = n3;
//			n3 = n2;
//			n2 = p5;
//		}
//		else {
//			n5 = n4;
//			n4 = n3;
//			n3 = n2;
//			n2 = n1;
//			n1 = p5;
//		}
//		return n3;
	}
	
	public static void tri_insertion(int array[]) {
		for (int step = 1; step < array.length; step++) {
			int pivot = array[step];
			int j = step - 1;
			while (j>= 0 && array[j] > pivot) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = pivot;
		}
	}
}
