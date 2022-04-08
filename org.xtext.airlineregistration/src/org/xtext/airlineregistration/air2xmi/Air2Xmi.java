package org.xtext.airlineregistration.air2xmi;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.airlineregistration.AirStandaloneSetup;

public class Air2Xmi {

	public static void main(String[] args) throws IOException {
		// TODO change paths to correspond to your desired location
		String packagePath = "src/org/xtext/airlineregistration/air2xmi/";
		String airFilePath = packagePath + "MyOfficial.air";
		String xmiFilePath = packagePath + "MyOfficial.xmi";

		XtextResourceSet resourceSet = new AirStandaloneSetup().createInjectorAndDoEMFRegistration()
				.getInstance(XtextResourceSet.class);

		Resource xtextResource = resourceSet.getResource(URI.createURI(airFilePath), true);

		EcoreUtil.resolveAll(xtextResource);

		Resource xmiResource = resourceSet.createResource(URI.createURI(xmiFilePath));

		xmiResource.getContents().add(xtextResource.getContents().get(0));

		xmiResource.save(null);
	}

}
