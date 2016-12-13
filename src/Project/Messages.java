package Project;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Messages {

	private String language;
	private String country;

	private final static String BUNDLE_NAME = "Project.messages";

	public Locale currentLocale = new Locale(language, country);

	public void setCurrentLocale(Locale current_Locale) {
		currentLocale = current_Locale;
	}

	private final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, currentLocale);

	public String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
