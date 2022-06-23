package practice.creational.singleton._two;

/**
 * Created by Gra_m on 2022 05 26
 */

public class Singleton {
	private static Singleton instance = new Singleton();

	public Singleton() {}

	public static Singleton getInstance(){
		return instance;
	}
}
