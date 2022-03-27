package jungol;

public class Jungol570 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == 0 | j == 0) {
					a[i][j] = 1;
				} else {
					a[i][j] = a[i - 1][j] + a[i][j - 1];
				}
			}
		}
			for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a.length; j++) {
	                System.out.printf("%d ", a[i][j]);
	            }
	            System.out.println();
	        }
	    }
	}

