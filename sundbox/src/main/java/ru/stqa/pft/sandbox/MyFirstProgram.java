package ru.stqa.pft.sandbox;

import java.sql.SQLOutput;

public class MyFirstProgram {
	public static void main(String[] args) {
	hello("World");
	hello("user");
	hello("Алексей");

	double len = 5;
		System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

	double a = 5;
	double b = 6;
		System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b +" = " + area(a,b));
}
public static void hello(String sombody) {

	System.out.println("Hello, " + sombody + "!");
}
public static double area(double l){
		return l*l;
}
	public static double area(double a, double b){
		return  a*b;
	}
}