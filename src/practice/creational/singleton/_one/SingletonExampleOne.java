package practice.creational.singleton._one;

/**
 * Created by Gra_m on 2022 05 26
 */

public class SingletonExampleOne {
	public static void main(String[] args) {
		JustOneOfMeA singleton1 = JustOneOfMeA.getJustOneOfMe();
		JustOneOfMeA singleton2 = JustOneOfMeA.getJustOneOfMe();


		System.out.println(singleton1.equals(singleton2));
	}
}
