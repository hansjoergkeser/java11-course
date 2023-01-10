package org.example.chapter6.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TraditionalSearch {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));

//		print(animals, (Animal a) -> a.canHop());
//		print2(animals);
		print3(animals, a -> a.canHop());
	}

	private static void print(List<Animal> animals, CheckTrait checkTrait) {
		for (Animal animal : animals) {
			if (checkTrait.test(animal)) {
				System.out.print(animal + " ");
			}
		}
	}

	private static void print2(List<Animal> animals) {
		for (Animal animal : animals) {
			if (animal.canHop()) {
				System.out.print(animal + " ");
			}
		}
	}

	private static void print3(List<Animal> animals, Predicate<Animal> checker) {
		for (Animal animal : animals) {
			if (checker.test(animal)) {
				System.out.print(animal + " ");
			}
		}
	}

}
