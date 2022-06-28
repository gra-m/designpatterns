package _00holub_on_design_patterns.Holub_02_FactoriesAndSingletons.listing2_4_1private_inner_class;

/**
 * Created by Gra_m on 2022 06 23
 */

public class ListingTwoFour {
	public static void main(String[] args) {
		Employee employeeOfUnknownClass = Employee.Factory.create();
		System.out.println("In listing2_3 the instantiation of a Peon was encapsulated by making it package protected\n" +
				"this, listing2_4 hides Peon from classes in the same package too, by using a nested private class.\n" + employeeOfUnknownClass.getClass());

		System.out.println(employeeOfUnknownClass.youAreFired());
	}
}
