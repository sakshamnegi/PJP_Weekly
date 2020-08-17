package com.sapient.week4;

public class Matrix {

	private int[][] matrix;

	public Matrix(int i, int j) {
		matrix = new int[i][j];
	}

	public Matrix() {
		matrix = new int[3][3];
	}

	public Matrix(int matrix[][]) {
		this.matrix = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				this.matrix[i][j] = matrix[i][j];
			}
		}
	}

	public Matrix(Matrix obj) {
		this.matrix = new int[obj.matrix.length][obj.matrix[0].length];
		for (int i = 0; i < obj.matrix.length; i++) {
			for (int j = 0; j < obj.matrix[0].length; j++) {
				this.matrix[i][j] = obj.matrix[i][j];
			}
		}

	}

	public void readMatrix() {
		int row = matrix.length;
		int col = matrix[0].length;
		for (int i = 0; i < row; i++) {
			System.out.println("Enter row " + (i + 1) + " elements ");
			for (int j = 0; j < col; j++) {
				matrix[i][j] = Reader.read.nextInt();
			}
		}
	}

	public void displayMatrix() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "   ");
			}
			System.out.println();
		}
	}

	public Matrix addMatrix(Matrix m) {
		int row = m.matrix.length;
		int col = m.matrix[0].length;
		if (row != matrix.length || col != matrix[0].length) {
			System.out.println("Dimensions don't match!");
			return null;
		}
		Matrix resultMatrix = new Matrix(row, col);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				resultMatrix.matrix[i][j] = m.matrix[i][j] + matrix[i][j];
			}
		}
		return resultMatrix;
	}

	public boolean isScalar() {
		int x = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i == j && matrix[i][j] != x) {
					return false;
				}
				if (i != j && matrix[i][j] != 0) {
						return false;
				}
			}
		}

		return true;
	}

	public Matrix multiplyMatrix(Matrix m) {
		int r1 = matrix.length;
		int r2 = m.matrix.length;
		int c1 = matrix[0].length;
		int c2 = m.matrix[0].length;
		if (c1 != r2) {
			System.out.println("Can't multiply matrices");
			return null;
		}
		Matrix resultMatrix = new Matrix(r1, c2);
		int sum;
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				sum = 0;
				for (int k = 0; k < c1; k++) {
					sum = sum + (matrix[i][k] * m.matrix[k][j]);
				}
				resultMatrix.matrix[i][j] = sum;
			}
		}
		return resultMatrix;

	}

	public void finalize() {

		System.out.println(this + " Object destroyed ");
	}

}
