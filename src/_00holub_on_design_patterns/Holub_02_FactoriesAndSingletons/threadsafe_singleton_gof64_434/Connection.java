package _00holub_on_design_patterns.Holub_02_FactoriesAndSingletons.threadsafe_singleton_gof64_434;

import java.net.URL;

/**
 * Created by Gra_m on 2022 06 23
 */

public class Connection {
	private static URL server;
	private static Connection instance;

	public static void pointAt(URL server) {
	server = server;
	}

	private  Connection() {
		//return establishConnectionTo(server);
	}

	public synchronized static Connection getInstance() {
		if (instance == null)
			instance = new Connection();
		return instance;
	}



}
