package _00holub_on_design_patterns.Holub_02_FactoriesAndSingletons.singleton81of434;

/**
 * Created by Gra_m on 2022 06 23
 *
 * Issue: not thread-safe could synchronize but then this overhead for every use.
 */

class Singleton {
	private static Singleton instance = null;

	private Singleton(){}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}



}
