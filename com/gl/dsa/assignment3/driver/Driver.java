package com.gl.dsa.assignment3.driver;
import java.util.Scanner;
import com.gl.dsa.assignment3.question1.stackImpli;

public class Driver {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the total number of in the building: ");
		int N = ab.nextInt();
		int floors[] =  new int[N];
		for(int i = 0; i < N; i++) {
			System.out.println("Enter the floor size given on day: "+(i+1));
			floors[i] = ab.nextInt();
		}
		ab.close();
		stackImpli si = new stackImpli();
		si.display(floors);

	}

}
