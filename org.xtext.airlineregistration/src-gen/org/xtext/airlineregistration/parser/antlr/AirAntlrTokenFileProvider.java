/*
 * generated by Xtext 2.26.0
 */
package org.xtext.airlineregistration.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AirAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/airlineregistration/parser/antlr/internal/InternalAir.tokens");
	}
}
