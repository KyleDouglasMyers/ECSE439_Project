/*
 * generated by Xtext 2.26.0
 */
package org.xtext.airlineregistration;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class AirStandaloneSetup extends AirStandaloneSetupGenerated {

	public static void doSetup() {
		new AirStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}