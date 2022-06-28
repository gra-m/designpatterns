package _00holub_on_design_patterns.Holub_02_FactoriesAndSingletons.listing2_4_zabstract_class_version88_434;

/**
 * Created by Gra_m on 2022 06 28
 *
 *
 */

abstract class Employee {
	abstract void youAreFired();
	static Employee create()
	{ return new Employee() {
		@Override
		public void youAreFired() {
			System.out.println("From abstract class:\n'It would certainly be nice if Java supported static methods in" +
					"interfaces, but it doesn’t.'");
		}
	};
	}

}

interface Employee2 {
	void youAreFired();
	static Employee2 create() {
		return new Employee2() {
			@Override
			public void youAreFired() {
				System.out.println("\nFrom interface with static create method:\nNo need for abstract class" +
						"for this Singleton/AbstractFactory mix anymore.");
			}
		};
	}
}

class Employee1And2 {
	public static void main(String[] args) {
		Employee employee = Employee.create();
		Employee2 employee2 = Employee2.create();

		employee.youAreFired();
		employee2.youAreFired();
	}
}
