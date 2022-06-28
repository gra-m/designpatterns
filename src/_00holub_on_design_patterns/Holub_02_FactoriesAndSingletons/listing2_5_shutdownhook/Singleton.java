package _00holub_on_design_patterns.Holub_02_FactoriesAndSingletons.listing2_5_shutdownhook;

/**
 * Created by Gra_m on 2022 06 24
 * What?: A shutdown hook is a dormant thread that only kicks in when all user threads have been terminated (prog shutdown).
 */

public class Singleton {
	private static Singleton instance = new Singleton(); // basic singleton, no runtime info like current url required
	private volatile boolean objectClosed = false; // used to check if methods called after singleton close

	private Singleton() {
		Runtime.getRuntime().addShutdownHook(
				new Thread(){
					public void run(){
						objectClosed = true;
						// code to clean up global resources used by Singleton
					}
				}
		);

		// code setting up global resources for singleton
	}

	public static Singleton getInstance() {
		return instance;
	}

	public void methodCallThatCouldResolveBeforeGlobalResourcesClosed() throws Exception {
		if (objectClosed)
			throw new Exception("Tried to use Singleton resource after shutdown");
	}


}
