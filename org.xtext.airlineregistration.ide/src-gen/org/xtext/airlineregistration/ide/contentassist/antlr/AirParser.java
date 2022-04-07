/*
 * generated by Xtext 2.26.0
 */
package org.xtext.airlineregistration.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.airlineregistration.ide.contentassist.antlr.internal.InternalAirParser;
import org.xtext.airlineregistration.services.AirGrammarAccess;

public class AirParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(AirGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, AirGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEntityAccess().getAlternatives(), "rule__Entity__Alternatives");
			builder.put(grammarAccess.getEmployeeAccess().getAlternatives(), "rule__Employee__Alternatives");
			builder.put(grammarAccess.getAirportAccess().getGroup(), "rule__Airport__Group__0");
			builder.put(grammarAccess.getAirlineAccess().getGroup(), "rule__Airline__Group__0");
			builder.put(grammarAccess.getAirplaneAccess().getGroup(), "rule__Airplane__Group__0");
			builder.put(grammarAccess.getScheduledFlightAccess().getGroup(), "rule__ScheduledFlight__Group__0");
			builder.put(grammarAccess.getSpecificFlightAccess().getGroup(), "rule__SpecificFlight__Group__0");
			builder.put(grammarAccess.getSpecificFlightAccess().getGroup_13(), "rule__SpecificFlight__Group_13__0");
			builder.put(grammarAccess.getScheduleAccess().getGroup(), "rule__Schedule__Group__0");
			builder.put(grammarAccess.getScheduleAccess().getGroup_4(), "rule__Schedule__Group_4__0");
			builder.put(grammarAccess.getPilotAccess().getGroup(), "rule__Pilot__Group__0");
			builder.put(grammarAccess.getFlightAttendantAccess().getGroup(), "rule__FlightAttendant__Group__0");
			builder.put(grammarAccess.getBagHandlerAccess().getGroup(), "rule__BagHandler__Group__0");
			builder.put(grammarAccess.getGatePersonnelAccess().getGroup(), "rule__GatePersonnel__Group__0");
			builder.put(grammarAccess.getPassengerAccess().getGroup(), "rule__Passenger__Group__0");
			builder.put(grammarAccess.getPassengerAccess().getGroup_5(), "rule__Passenger__Group_5__0");
			builder.put(grammarAccess.getModelAccess().getEntitiesAssignment(), "rule__Model__EntitiesAssignment");
			builder.put(grammarAccess.getAirportAccess().getNameAssignment_1(), "rule__Airport__NameAssignment_1");
			builder.put(grammarAccess.getAirportAccess().getAnameAssignment_2(), "rule__Airport__AnameAssignment_2");
			builder.put(grammarAccess.getAirportAccess().getLocationAssignment_3(), "rule__Airport__LocationAssignment_3");
			builder.put(grammarAccess.getAirlineAccess().getNameAssignment_1(), "rule__Airline__NameAssignment_1");
			builder.put(grammarAccess.getAirlineAccess().getDescriptionAssignment_2(), "rule__Airline__DescriptionAssignment_2");
			builder.put(grammarAccess.getAirplaneAccess().getNameAssignment_1(), "rule__Airplane__NameAssignment_1");
			builder.put(grammarAccess.getAirplaneAccess().getTypeAssignment_2(), "rule__Airplane__TypeAssignment_2");
			builder.put(grammarAccess.getAirplaneAccess().getSeatsAssignment_3(), "rule__Airplane__SeatsAssignment_3");
			builder.put(grammarAccess.getScheduledFlightAccess().getNameAssignment_1(), "rule__ScheduledFlight__NameAssignment_1");
			builder.put(grammarAccess.getScheduledFlightAccess().getFromAssignment_3(), "rule__ScheduledFlight__FromAssignment_3");
			builder.put(grammarAccess.getScheduledFlightAccess().getToAssignment_5(), "rule__ScheduledFlight__ToAssignment_5");
			builder.put(grammarAccess.getScheduledFlightAccess().getAirlineAssignment_7(), "rule__ScheduledFlight__AirlineAssignment_7");
			builder.put(grammarAccess.getScheduledFlightAccess().getTimeAssignment_9(), "rule__ScheduledFlight__TimeAssignment_9");
			builder.put(grammarAccess.getSpecificFlightAccess().getNameAssignment_1(), "rule__SpecificFlight__NameAssignment_1");
			builder.put(grammarAccess.getSpecificFlightAccess().getFnameAssignment_2(), "rule__SpecificFlight__FnameAssignment_2");
			builder.put(grammarAccess.getSpecificFlightAccess().getScheduledFlightAssignment_4(), "rule__SpecificFlight__ScheduledFlightAssignment_4");
			builder.put(grammarAccess.getSpecificFlightAccess().getDateAssignment_6(), "rule__SpecificFlight__DateAssignment_6");
			builder.put(grammarAccess.getSpecificFlightAccess().getPilotAssignment_8(), "rule__SpecificFlight__PilotAssignment_8");
			builder.put(grammarAccess.getSpecificFlightAccess().getPlaneAssignment_10(), "rule__SpecificFlight__PlaneAssignment_10");
			builder.put(grammarAccess.getSpecificFlightAccess().getStaffAssignment_12(), "rule__SpecificFlight__StaffAssignment_12");
			builder.put(grammarAccess.getSpecificFlightAccess().getStaffAssignment_13_1(), "rule__SpecificFlight__StaffAssignment_13_1");
			builder.put(grammarAccess.getScheduleAccess().getNameAssignment_0(), "rule__Schedule__NameAssignment_0");
			builder.put(grammarAccess.getScheduleAccess().getSpecificFlightsAssignment_3(), "rule__Schedule__SpecificFlightsAssignment_3");
			builder.put(grammarAccess.getScheduleAccess().getSpecificFlightsAssignment_4_1(), "rule__Schedule__SpecificFlightsAssignment_4_1");
			builder.put(grammarAccess.getPilotAccess().getNameAssignment_1(), "rule__Pilot__NameAssignment_1");
			builder.put(grammarAccess.getPilotAccess().getPinameAssignment_2(), "rule__Pilot__PinameAssignment_2");
			builder.put(grammarAccess.getPilotAccess().getAirlineAssignment_4(), "rule__Pilot__AirlineAssignment_4");
			builder.put(grammarAccess.getFlightAttendantAccess().getNameAssignment_1(), "rule__FlightAttendant__NameAssignment_1");
			builder.put(grammarAccess.getFlightAttendantAccess().getFanameAssignment_2(), "rule__FlightAttendant__FanameAssignment_2");
			builder.put(grammarAccess.getFlightAttendantAccess().getAirlineAssignment_4(), "rule__FlightAttendant__AirlineAssignment_4");
			builder.put(grammarAccess.getBagHandlerAccess().getNameAssignment_1(), "rule__BagHandler__NameAssignment_1");
			builder.put(grammarAccess.getBagHandlerAccess().getBhnameAssignment_2(), "rule__BagHandler__BhnameAssignment_2");
			builder.put(grammarAccess.getBagHandlerAccess().getAirportAssignment_4(), "rule__BagHandler__AirportAssignment_4");
			builder.put(grammarAccess.getGatePersonnelAccess().getNameAssignment_1(), "rule__GatePersonnel__NameAssignment_1");
			builder.put(grammarAccess.getGatePersonnelAccess().getGpnameAssignment_2(), "rule__GatePersonnel__GpnameAssignment_2");
			builder.put(grammarAccess.getGatePersonnelAccess().getAirportAssignment_4(), "rule__GatePersonnel__AirportAssignment_4");
			builder.put(grammarAccess.getPassengerAccess().getNameAssignment_1(), "rule__Passenger__NameAssignment_1");
			builder.put(grammarAccess.getPassengerAccess().getPanameAssignment_2(), "rule__Passenger__PanameAssignment_2");
			builder.put(grammarAccess.getPassengerAccess().getSpecificFlightAssignment_4(), "rule__Passenger__SpecificFlightAssignment_4");
			builder.put(grammarAccess.getPassengerAccess().getSpecificFlightAssignment_5_1(), "rule__Passenger__SpecificFlightAssignment_5_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private AirGrammarAccess grammarAccess;

	@Override
	protected InternalAirParser createParser() {
		InternalAirParser result = new InternalAirParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AirGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AirGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
