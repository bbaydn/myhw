package evennumbers;

import java.util.function.IntConsumer;

public class EvenNumberOperations {
	private static int sum = 0;
	private static int multiply = 1;
	private static int[] squared = new int[5];
	public static void main(String[] args) {

		Consumer<Integer> calculator = i -> System.out.print(i + " ");
		doEvenNumberOperation(calculator, 10);
		
		System.out.println();
		
		doEvenNumberOperation(i->sum+=i, 10);
		System.out.println(sum);
				
		doEvenNumberOperation(i->multiply*=i, 10);
		System.out.println(multiply);

		doEvenNumberOperation(i-> squared[i/2 -1]=i*i, 10);
		for(int j : squared)
			System.out.println(j + " ");

	}

	public static void doEvenNumberOperation(Consumer<Integer> consumer, int number) {
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				consumer.accept(i);
			}
		}

//		Consumer<Integer> isEven = x -> {
//			for (int i = 1; i <= x; i++) {
//				if (i % 2 == 0) {
//					System.out.print(i + " ");
//				};
//			}
//		};
//		isEven.accept(10);
	}

}
