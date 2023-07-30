package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File file = new File("./Configuration/config.properties");
		try {

			FileInputStream stream = new FileInputStream(file);
			pro = new Properties();
			pro.load(stream);
			System.out.println("Config object Print Stream-->"+pro);

		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}
	}

	public String getURL() {
		String url1 = (String) pro.get("url");
		return url1;
	}

	public String getEmail() {
		String email1 = (String) pro.get("email");
		return email1;
	}

	public String getPass() {
		String password1 = (String) pro.get("password");
		return password1;
	}

	public String getcvv() {
		String cvv = (String) pro.get("cvv");
		return cvv;
	}

	public String getchrome() {
		String chrom = (String) pro.get("chromepath");
		return chrom;
	}

	public String getmozila() {
		String mozila = (String) pro.get("mozilapath");
		return mozila;
	}

	public String getIe() {
		String ie = (String) pro.get("iepath");
		return ie;
	}

}
