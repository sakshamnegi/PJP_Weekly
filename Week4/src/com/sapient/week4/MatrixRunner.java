package com.sapient.week4;


public class MatrixRunner {

	public static void main(String[] args) {

		Matrix m1 = new Matrix(3, 3);
		System.out.println("Enter 3x3 matrix ");
		m1.readMatrix();
		Matrix m2 = new Matrix(3, 3);
		System.out.println("Matrix 1 :");
		m1.displayMatrix();
		System.out.println("Enter 3x3 matrix ");
		m2.readMatrix();
		System.out.println("Matrix 2 :");
		m2.displayMatrix();
		Matrix m3 = m1.addMatrix(m2);
		System.out.println("Matrix 3 = Matrix 1 + Matrix 2 : ");
		m3.displayMatrix();
		Matrix m4 = m1.multiplyMatrix(m2);
		System.out.println("Matrix 4 = Matrix 1 * Matrix 2");
		m4.displayMatrix();
		System.out.println("Is Matrix 1 scalar ? : " + m1.isScalar());

		m1 = null;
		m2 = null;
		m3 = null;
		m4 = null;
		System.gc();

	}

}
