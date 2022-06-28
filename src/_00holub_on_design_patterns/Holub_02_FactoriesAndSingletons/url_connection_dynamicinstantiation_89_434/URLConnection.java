package _00holub_on_design_patterns.Holub_02_FactoriesAndSingletons.url_connection_dynamicinstantiation_89_434;


/**
 * Copied 2022 06 28
 *
 *
 *
 */

interface URLConnection {
	void setDoInput (boolean on);
	void setDoOutput (boolean on);
	void connect();
	InputStream getInputStream();
}

abstract class InputStream {
	public abstract int read();
}

class URL {
	private String spec;

	public URL(String spec) {
		this.spec = spec;
	}

	public URLConnection openConnection() {
		if (spec.startsWith("http:")) return new HttpURLConnection(URL.this);
		else if (spec.startsWith("ftp:")) return new FtpURLConnection(URL.this);
//...
		else
			throw new IllegalArgumentException("Unknown Protocol");
	}


	class HttpURLConnection implements URLConnection {
		public HttpURLConnection(URL toHere) { /*...*/ }

		public InputStream getInputStream() {
			return new InputStream() {
				public int read() { // code goes here to read using the HTTP Protocol
					return -1;
				}
			};
		}

		public void setDoInput(boolean on) { /*...*/ }

		public void setDoOutput(boolean on) { /*...*/ }

		public void connect() { /*...*/ }
	}

	class FtpURLConnection implements URLConnection {
		public FtpURLConnection(URL toHere) { /*...*/ }

		public InputStream getInputStream() {
			return new InputStream() {
				public int read() { // code goes here to read using the HTTP Protocol
					return -1;
				}
			};
		}

		public void setDoInput(boolean on) { /*...*/ }

		public void setDoOutput(boolean on) { /*...*/ }

		public void connect() { /*...*/ }
	}
}
