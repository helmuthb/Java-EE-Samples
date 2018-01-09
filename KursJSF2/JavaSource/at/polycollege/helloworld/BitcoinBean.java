package at.polycollege.helloworld;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class BitcoinBean {
	static final String bitcoinUrl =
			"https://blockchain.info/tobtc?currency=EUR&value=1000000";

	public String getBitcoins() throws IOException {
		URL url = new URL(bitcoinUrl);
		Scanner scanner = new Scanner(url.openStream(), "UTF-8");
		String out = scanner.useDelimiter("\\A").next();
		scanner.close();
		return out;
	}
}
