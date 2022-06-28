package _00holub_on_design_patterns.Holub_02_FactoriesAndSingletons.url_connection_dynamicinstantiation_89_434;

import java.io.IOException;

/**
 * Created by Gra_m on 2022 06 28
 */

public class UrlConsoleDisplayApp {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.holub.com/index.html");
		URLConnection connection = url.openConnection();
		connection.setDoInput(true);
		connection.setDoOutput(false);
		connection.connect();
		InputStream in = connection.getInputStream();
		int c;
		while( (c = in.read()) != -1 )
		{ System.out.print( (char)c );
		}
	}
}
