package de.uni_paderborn.fujaba.muml.tests;

import java.net.URL;

import org.muml.core.tests.QVTOCompileErrorTest;

public class PIMQVTOCompileTest extends QVTOCompileErrorTest {
	
	public boolean shouldCheck(String bundleName, URL url) {
		// Disable checking of GMF reconcile qvto scripts
		if (bundleName.endsWith(".diagram")	&& url.getPath().startsWith("/model/")) {
			return false;
		}
		// Disable checking of GMF-templates helper qvto scripts
		if (bundleName.equals("de.uni_paderborn.fujaba.common") || bundleName.endsWith("de.uni_paderborn.fujaba.muml.common")) {
			return false;
		}
		return true;
	}

}
