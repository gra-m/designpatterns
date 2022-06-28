package _00holub_on_design_patterns.Holub_02_FactoriesAndSingletons.threadsafeJVM1_5plus_singleton82_434;

/**
 * Created by Gra_m on 2022 06 24
 *
 * Intent: double check if null, as a thread could sneak through after first test but before synch test completed.
 * Non working prior to 1.5
 */

public class DoubleChecked {
	private static volatile DoubleChecked instance = null;
	private static Object lock = new Object();

	public static DoubleChecked getInstance()
	{
		if (instance == null) {
			synchronized( lock ){
				if (instance == null)
					instance = new DoubleChecked();
			}
		}
		return instance;
	}

}
