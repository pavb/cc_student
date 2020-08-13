package ml.brainin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Aufgabe_ArrayList {

	public static void main(String[] args) {
		System.out.println("------ A1 -----");
		List<Integer> listA1 = getArray(20, 100);
		listA1.iterator().forEachRemaining((number)->System.out.print(number+" "));
		System.out.println();

		System.out.println("------ A2 -----");
		List<String> listA2 = Arrays.asList("mo", "di", "mi", "do", "fr");
		listA2.stream().forEach((str)->System.out.print(str+" "));
		System.out.println();

		System.out.println("------ A3 -----");
		
		List<String> listA3 = Arrays.asList("mo", "di", "mi", "do", "fr");
		Iterator<String> iterator = listA3.iterator();
		iterator.forEachRemaining((number)->System.out.print(number+" "));
		System.out.println();
		
		System.out.println("------ A4 -----");
		List<Integer> listA4 = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80);
		for (int i = 0; i <listA4.size(); i++) {
			if (i%2 == 0) {
				System.out.print(listA4.get(i)+" ");
			}
		}
		System.out.println();
		
		System.out.println("------ A5 -----");
		List<Integer> listA5 = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80);
		Collections.reverse(listA5);
		listA5.stream().forEach((number)->System.out.print(number+" "));	
		System.out.println();

		System.out.println("------ A6 -----");
		List<Integer> listA6 = getArray(20, 100);
		Collections.sort(listA6);
		listA6.stream().forEach((number)->System.out.print(number+" "));	
		System.out.println();

		System.out.println("------ A7 -----");
		List<Integer> listA7 = getArray(10, 50);
		int index = listA7.indexOf(12);
		System.out.println(index >=0?("Current index of 12 is : "+index):"Thre is no 12 in the list ");
		System.out.println();

		System.out.println("------ A8 -----");
		List<Integer> listA8 = getArray(10, 50);
		for (int i = listA8.size()-1; i>=0; i--) {
			int number = listA8.get(i);
			if (number%2 != 0) {
				listA8.remove(i);
			}
		}
		System.out.println();
		listA8.stream().forEach((number)->System.out.print(number+" "));
		System.out.println();

		System.out.println("------ A9 -----");
		List<Integer> listA9 = getArray(10, 50);
		listA9.removeIf((number)-> number%2 !=0);
		listA9.stream().forEach((number)->System.out.print(number+" "));
		System.out.println();
	
		System.out.println("------ A10 -----");
		List<Integer> listA10= getArray(10, 50);
		IntStream.range(0, listA10.size()).forEachOrdered(i -> {
			if (listA10.get(i)%2 !=0) {
				listA10.set(i,0);
			}
		});
		listA10.stream().forEach((number)->System.out.print(number+" "));
		System.out.println();

		System.out.println("------ A11 -----");
		List<Integer> listA11 = getArray(10, 50);
		Integer[] array = listA11.toArray(new Integer[0]);
		System.out.println("Current array : ");
		for (int number : array) {
			System.out.print(number+" ");
		}

	}
	private static List<Integer> getArray(int size, int random) {
		List<Integer> result = new ArrayList<>();
		System.out.println("Current list : ");
		for (int i = 0; i <size; i++) {
			int number = (int)(Math.random() * (random) + 1);
			result.add(i,number);
			System.out.print(number+" ");
		}
		System.out.println();
		return result;
	}
}
