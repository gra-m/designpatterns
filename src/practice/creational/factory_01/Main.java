package practice.creational.factory_01;

/**
 * Created by Gra_m on 2022 05 27
 */

public class Main {
	public static void main(String[] args) {
		ProductFactory productFactory = new ProductFactory();

		Product tv1 = productFactory.getProduct(1);
		Product ft1 = productFactory.getProduct(2);

		System.out.println(tv1.getClass());
		System.out.println(ft1.getClass());

	}
}
