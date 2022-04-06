/*
 * generated by Xtext 2.26.0
 */
package org.xtext.airlineregistration.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.airlineregistration.parser.antlr.internal.InternalAirParser;
import org.xtext.airlineregistration.services.AirGrammarAccess;

public class AirParser extends AbstractAntlrParser {

	@Inject
	private AirGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAirParser createParser(XtextTokenStream stream) {
		return new InternalAirParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public AirGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AirGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}