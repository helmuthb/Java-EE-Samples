package at.polycollege.helloworld;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.Scanner;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BitcoinBean implements Serializable {
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
