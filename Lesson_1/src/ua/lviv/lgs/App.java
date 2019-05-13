package ua.lviv.lgs;

public class App {
	public static void main(String[] args) {
		// 1. Написати по одній змінній кожного типу примітивних типів даних
		
		byte b = 1;
		short s;
		s = 50;
		int i = 10;
		long l;
		l = 248l;
		
		float f = 346.765f;
		double d = 34.25;
		
		char c;
		c = 'A';
		boolean b1 = false;
		
		//2. Вивести на консоль мінімальне та максимальне значення типів даних
		
		System.out.println("byte "+ Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
		System.out.println("short "+ Short.MAX_VALUE + " " + Short.MIN_VALUE);
		System.out.println("int "+ Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
		System.out.println("long "+ Long.MAX_VALUE + " " + Long.MIN_VALUE);
		System.out.println("float "+ Float.MAX_VALUE + " " + Float.MIN_VALUE);
		System.out.println("double "+ Double.MAX_VALUE + " " + Double.MIN_VALUE);
		System.out.println("char "+ Character.MAX_VALUE + " " + Character.MIN_VALUE);
		// boolean приймає два значення: true або false
		
		// 3. Створити масив, наповнити його 10 значеннями типу int, 
		//    знайти максимальне та мінімальне значення в масиві та вивести їх на консоль
		
		int [] array = new int[10];
		
		for (int j = 0; j<array.length; j++) {
			array[j] = j*3;
		}
		
		int min = array[0];
		int max = array[0];
		
		for (int j = 0; j<array.length; j++) {
			if(min>array[j]) {
				min = array[j];
			}
			if(max<array[j]) {
				 max = array[j];
			 }
			
		}
		 
		 System.out.println("min = " + min);
		 System.out.println("max = " + max);
		
	}

}
