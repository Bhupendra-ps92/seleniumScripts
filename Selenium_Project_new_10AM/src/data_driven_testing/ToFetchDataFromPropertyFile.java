package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testData/testData1.properties");
		Properties property = new Properties();
		property.load(fis);

		String url = property.getProperty("url");
		String username = property.getProperty("username");
		String password = property.getProperty("password");

		System.out.println(url);
		System.out.println(username);
		System.out.println(password);

	}

}
