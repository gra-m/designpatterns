package _00holub_on_design_patterns.Holub_02_FactoriesAndSingletons.listing2_3;

/**
 * Created by Gra_m on 2022 06 23
 */

public interface Employee {
	void youAreFired();

	class Factory {

		private Factory(){}

		public static Employee create() {
			return new Peon();
		}
	}
}

