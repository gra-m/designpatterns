package _00holub_on_design_patterns.Holub_02_FactoriesAndSingletons.listing2_4_1private_inner_class;

/**
 * Created by Gra_m on 2022 06 23
 */

public interface Employee {
	String youAreFired();

	class Factory{
		private Factory(){}
		public static Employee create() {
			return new Peon();
		}

		private static class Peon implements Employee {
			@Override
			public String youAreFired() {
				return "Return from Peon";
			}
		}


	}
}
