package utils;

import java.io.IOException;
import java.util.Properties;

public class Configuration {
private	Properties properties;

public String getProperty(String key) {
	return properties.getProperty(key);
}

	public Configuration() throws IOException{
		loadproperties();

	}

	public void loadproperties() throws IOException {
		properties = new Properties();
		try {
		properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
