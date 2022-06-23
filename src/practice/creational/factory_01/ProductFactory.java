package practice.creational.factory_01;

/**
 * Created by Gra_m on 2022 05 27
 */

public class ProductFactory {

	public Product getProduct(Integer productCode) {
		return switch (productCode) {
			case (1) -> new LedTv();
			case (2) -> new FishTank();
			default -> null;
		};
	}
}
