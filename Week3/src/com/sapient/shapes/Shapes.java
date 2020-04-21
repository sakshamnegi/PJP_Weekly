package com.sapient.shapes;

public class Shapes {

	private int numberOfSides;

	public Shapes(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}

	public void calculateShapeArea(int numberOfSides, int sideLength) {
		if (numberOfSides == 1) {
			new Circle().calculateArea(sideLength);
		} else if (numberOfSides == 3) {
			new Triangle().calculateArea(sideLength);
		} else if (numberOfSides == 4) {
			new Square().calculateArea(sideLength);
		} else {
			System.out.println("No Shapes Present");
		}
	}

	public static void main(String[] args) {
		Shapes test1 = new Shapes(3);
		int testSide1 = 12;
		test1.calculateShapeArea(test1.numberOfSides, testSide1);

		Shapes test2 = new Shapes(4);
		int testSide2 = 15;
		test2.calculateShapeArea(test2.numberOfSides, testSide2);

		Shapes test3 = new Shapes(5);
		int testSide3 = 15;
		test3.calculateShapeArea(test3.numberOfSides, testSide3);

	}

	}


