package _00holub_on_design_patterns.Holub_02_FactoriesAndSingletons.listing2_3;

/**
 * Created by Gra_m on 2022 06 23
 */

public class ListingTwoThree {
	public static void main(String[] args) {
		Employee employeeOfUnknownClass = Employee.Factory.create();
		System.out.println("If you refactor and add an interface, all 'new' calls also have to be refactored, unless you have used factory pattern \n" +
				"that encapsulates the creation of objects\n" + employeeOfUnknownClass.getClass());
	}
}
