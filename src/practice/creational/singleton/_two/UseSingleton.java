package practice.creational.singleton._two;

/**
 * Created by Gra_m on 2022 05 26
 */

class UseSingleton {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		if(singleton1.equals(singleton2))
			System.out.println("The singleton pattern is working");
		else
			System.out.println("Whoops");
	}
}
