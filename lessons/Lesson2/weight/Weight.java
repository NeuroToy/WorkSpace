package lessons.Lesson2.weight;

import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		
		System.out.println("Введите свой рост:");
		Scanner value = new Scanner(System.in);
		int height = value.nextInt();
		System.out.println("Введите свой вес:");
		Scanner value2 = new Scanner(System.in);
		int weight = value2.nextInt();
		int optimal = height - 100;
		if (weight < optimal) {
			System.out.println("Ваш вес ниже нормы, рекомендуется набрать до " + optimal + "кг");
		}
		else if (weight > optimal) {
			System.out.println("Ваш вес выше нормы, рекомендуется сбросить до " + optimal + "кг");
		}
		else if (weight == optimal) {
			System.out.println("Ваш вес оптимален!");
		}

	}

}
