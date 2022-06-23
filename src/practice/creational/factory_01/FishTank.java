package practice.creational.factory_01;

/**
 * Created by Gra_m on 2022 05 27
 */

public class FishTank implements Product{
	String id;
	Double size;
	String brand;

	@Override
	public String toString() {
		return "FishTank{" +
				"id='" + id + '\'' +
				", size=" + size +
				", brand='" + brand + '\'' +
				'}';
	}
}
