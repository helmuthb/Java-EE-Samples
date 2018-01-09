package at.polycollege.helloworld;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class HelloWorld {

	static final String bitcoinUrl =
			"https://blockchain.info/tobtc?currency=EUR&value=1000000";

	public static String checkColor(String color) {
		switch(color.toLowerCase()) {
		case "yellow":
		case "green":
		case "red":
			return color.toLowerCase();
		default:
			return "white";
		}
	}
	
	public static String getBitcoins() throws IOException {
		URL url = new URL(bitcoinUrl);
		Scanner scanner = new Scanner(url.openStream(), "UTF-8");
		String out = scanner.useDelimiter("\\A").next();
		scanner.close();
		return out;
	}
}
