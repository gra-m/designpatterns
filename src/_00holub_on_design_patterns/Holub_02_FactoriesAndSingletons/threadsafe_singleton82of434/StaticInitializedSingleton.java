package _00holub_on_design_patterns.Holub_02_FactoriesAndSingletons.threadsafe_singleton82of434;

/**
 * Created by Gra_m on 2022 06 23
 *
 * Issue: You may not have the necessary info to create Singleton, info may need to be passed to its constructor..
 */

public class StaticInitializedSingleton {
	private static final StaticInitializedSingleton instance;
	static {
		instance = new StaticInitializedSingleton();
	}


	public StaticInitializedSingleton getInstance() {return instance;}
}
