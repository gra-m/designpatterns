package _00holub_on_design_patterns.Holub_02_FactoriesAndSingletons.threadsafe_singleton_gof64_434;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Gra_m on 2022 06 23
 *
 */

public class Main {
	public static void main(String[] args) throws MalformedURLException {

		for(String arg : args)
			System.out.println("\n" + arg);


		URL url = new URL (args[0]);
		Connection.pointAt(url);
		Connection connection1 = Connection.getInstance();
		Connection connection2 = Connection.getInstance();

		System.out.println(connection1.equals(connection2));
	}
}
