package _00holub_on_design_patterns.Holub_02_FactoriesAndSingletons.listing2_4_anon;

/**
 * Created by Gra_m on 2022 06 23
 */

public interface Employee {
	void youAreFired();

	class Factory{
		private Factory(){}
		public static Employee create() {
			return new Employee() {
				public void youAreFired() {
					//lots of code here
					System.out.println("youAreFired was called");
				}
			};
		}

		/* Not even the programmer knows the class now..
		private static class Peon implements Employee {
			@Override
			public void youAreFired() {

			}
		}*/
	}
}
