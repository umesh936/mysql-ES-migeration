package migerate;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConfigReader {
	private static final String CLASS_NAME = "ConfigReader :";

	private static String profile = null;
	private static Properties prop = null;

	public static void intializeProfile() {
		loadPropertyFile();
		profile = prop.getProperty("ACTIVE_PROFILE");
		log.debug(CLASS_NAME + "Initialized the Profile : " + profile);
	}

	public static void intializeProfile(String env) {
		profile = env;
		loadPropertyFile();
		log.debug(CLASS_NAME + "Initialized the Profile : " + profile);
	}

	public static String GetParameter(String stringToRead, boolean readWithProfile) {
		if (readWithProfile)
			return (String) prop.get(profile + "_" + stringToRead);
		else
			return (String) prop.get(stringToRead);
	}

	private static void loadPropertyFile() {
		if (prop == null)
			prop = new Properties();
		ClassLoader classLoader = ConfigReader.class.getClassLoader();
		File file = new File(classLoader.getResource("databaseconfig.cfg").getFile());
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			prop.load(fis);
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
