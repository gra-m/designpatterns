package practice.creational.singleton._one;

/**
 * Created by Gra_m on 2022 05 26
 */

public class JustOneOfMeA {
	private static JustOneOfMeA justOneOfMe;

	public JustOneOfMeA() {
	}

	public static JustOneOfMeA getJustOneOfMe() {
		if(justOneOfMe == null)
			return justOneOfMe = new JustOneOfMeA();
		else
			return justOneOfMe;
	}

}
