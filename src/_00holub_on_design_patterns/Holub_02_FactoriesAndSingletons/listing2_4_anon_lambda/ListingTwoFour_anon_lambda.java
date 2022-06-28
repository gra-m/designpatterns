package _00holub_on_design_patterns.Holub_02_FactoriesAndSingletons.listing2_4_anon_lambda;

/**
 * Created by Gra_m on 2022 06 23
 */

public class ListingTwoFour_anon_lambda {
	public static void main(String[] args) {
		Employee employeeOfUnknownClass = Employee.Factory.create();
		System.out.println("In listing2_4 the instantiation of a Peon was encapsulated entirely by making it a nested private class\n" +
				"this, listing2_4_anon_lambda hides the name of 'Peon' even from the programmer, and\n" + employeeOfUnknownClass.getClass());

		employeeOfUnknownClass.youAreFired();
	}
}
