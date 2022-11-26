package com.company;


public class Main {

	public static void main(String[] args) {
		boolean[] simpleList = new boolean[1000];
		for (int i =0; i<1000; i++){
			simpleList[i] = true;
		}
		int k = 2;
		while (k * k <= 1000) {
			if (simpleList[k]) {
				int i = k * k;
				while (i < 1000) {
					simpleList[i] = false;
					i += k;
				}
			}
			k += 1;
		}
		for (int i = 0; i < 1000; i++) {
			if (simpleList[i] == true) {
				System.out.println(i + "\t");
			}
		}
	}
}
