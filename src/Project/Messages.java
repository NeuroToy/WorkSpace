package Project;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Messages {
	private final String BUNDLE_NAME = "Project.messages"; //$NON-NLS-1$

	private Locale locale = null;

	public void setLocale(Locale loc) {
		locale = loc;
	}

	private ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, locale);

	private void messages() {
	}

	public String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
