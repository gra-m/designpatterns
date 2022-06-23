package practice.creational.factory_reflection;

/**
 * Created by Gra_m on 2022 05 27
 */

public class Main {
	static {
		try {
			Class.forName("OneProduct");
			Class.forName("AnotherProduct");
		} catch (ClassNotFoundException any) {
			any.printStackTrace();
		}
	}

	public static void main(String[] args) {

	}
}
