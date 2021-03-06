package org.xtext.airlineregistration.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.airlineregistration.services.AirGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAirParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Airport'", "'Airline'", "'Airplane'", "'ScheduledFlight'", "'from'", "'to'", "'with'", "'at'", "'Flight'", "'scheduledFlight'", "'on'", "'pilot'", "'airplane'", "'staff'", "','", "'flights'", "'Pilot'", "'FlightAttendant'", "'BagHandler'", "'GatePersonnel'", "'Passenger'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAirParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAirParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAirParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAir.g"; }



     	private AirGrammarAccess grammarAccess;

        public InternalAirParser(TokenStream input, AirGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected AirGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalAir.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAir.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalAir.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAir.g:71:1: ruleModel returns [EObject current=null] : ( (lv_entities_0_0= ruleEntity ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;



        	enterRule();

        try {
            // InternalAir.g:77:2: ( ( (lv_entities_0_0= ruleEntity ) )* )
            // InternalAir.g:78:2: ( (lv_entities_0_0= ruleEntity ) )*
            {
            // InternalAir.g:78:2: ( (lv_entities_0_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=11 && LA1_0<=14)||LA1_0==19||(LA1_0>=27 && LA1_0<=31)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAir.g:79:3: (lv_entities_0_0= ruleEntity )
            	    {
            	    // InternalAir.g:79:3: (lv_entities_0_0= ruleEntity )
            	    // InternalAir.g:80:4: lv_entities_0_0= ruleEntity
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_entities_0_0=ruleEntity();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"entities",
            	    					lv_entities_0_0,
            	    					"org.xtext.airlineregistration.Air.Entity");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalAir.g:100:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalAir.g:100:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalAir.g:101:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalAir.g:107:1: ruleEntity returns [EObject current=null] : (this_Airport_0= ruleAirport | this_Airline_1= ruleAirline | this_ScheduledFlight_2= ruleScheduledFlight | this_SpecificFlight_3= ruleSpecificFlight | this_Schedule_4= ruleSchedule | this_Employee_5= ruleEmployee | this_Airplane_6= ruleAirplane | this_Passenger_7= rulePassenger ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Airport_0 = null;

        EObject this_Airline_1 = null;

        EObject this_ScheduledFlight_2 = null;

        EObject this_SpecificFlight_3 = null;

        EObject this_Schedule_4 = null;

        EObject this_Employee_5 = null;

        EObject this_Airplane_6 = null;

        EObject this_Passenger_7 = null;



        	enterRule();

        try {
            // InternalAir.g:113:2: ( (this_Airport_0= ruleAirport | this_Airline_1= ruleAirline | this_ScheduledFlight_2= ruleScheduledFlight | this_SpecificFlight_3= ruleSpecificFlight | this_Schedule_4= ruleSchedule | this_Employee_5= ruleEmployee | this_Airplane_6= ruleAirplane | this_Passenger_7= rulePassenger ) )
            // InternalAir.g:114:2: (this_Airport_0= ruleAirport | this_Airline_1= ruleAirline | this_ScheduledFlight_2= ruleScheduledFlight | this_SpecificFlight_3= ruleSpecificFlight | this_Schedule_4= ruleSchedule | this_Employee_5= ruleEmployee | this_Airplane_6= ruleAirplane | this_Passenger_7= rulePassenger )
            {
            // InternalAir.g:114:2: (this_Airport_0= ruleAirport | this_Airline_1= ruleAirline | this_ScheduledFlight_2= ruleScheduledFlight | this_SpecificFlight_3= ruleSpecificFlight | this_Schedule_4= ruleSchedule | this_Employee_5= ruleEmployee | this_Airplane_6= ruleAirplane | this_Passenger_7= rulePassenger )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case RULE_ID:
                {
                alt2=5;
                }
                break;
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt2=6;
                }
                break;
            case 13:
                {
                alt2=7;
                }
                break;
            case 31:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAir.g:115:3: this_Airport_0= ruleAirport
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getAirportParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Airport_0=ruleAirport();

                    state._fsp--;


                    			current = this_Airport_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAir.g:124:3: this_Airline_1= ruleAirline
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getAirlineParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Airline_1=ruleAirline();

                    state._fsp--;


                    			current = this_Airline_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAir.g:133:3: this_ScheduledFlight_2= ruleScheduledFlight
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getScheduledFlightParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScheduledFlight_2=ruleScheduledFlight();

                    state._fsp--;


                    			current = this_ScheduledFlight_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAir.g:142:3: this_SpecificFlight_3= ruleSpecificFlight
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getSpecificFlightParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpecificFlight_3=ruleSpecificFlight();

                    state._fsp--;


                    			current = this_SpecificFlight_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAir.g:151:3: this_Schedule_4= ruleSchedule
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getScheduleParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Schedule_4=ruleSchedule();

                    state._fsp--;


                    			current = this_Schedule_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAir.g:160:3: this_Employee_5= ruleEmployee
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getEmployeeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Employee_5=ruleEmployee();

                    state._fsp--;


                    			current = this_Employee_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAir.g:169:3: this_Airplane_6= ruleAirplane
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getAirplaneParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Airplane_6=ruleAirplane();

                    state._fsp--;


                    			current = this_Airplane_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalAir.g:178:3: this_Passenger_7= rulePassenger
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getPassengerParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Passenger_7=rulePassenger();

                    state._fsp--;


                    			current = this_Passenger_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAirport"
    // InternalAir.g:190:1: entryRuleAirport returns [EObject current=null] : iv_ruleAirport= ruleAirport EOF ;
    public final EObject entryRuleAirport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAirport = null;


        try {
            // InternalAir.g:190:48: (iv_ruleAirport= ruleAirport EOF )
            // InternalAir.g:191:2: iv_ruleAirport= ruleAirport EOF
            {
             newCompositeNode(grammarAccess.getAirportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAirport=ruleAirport();

            state._fsp--;

             current =iv_ruleAirport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAirport"


    // $ANTLR start "ruleAirport"
    // InternalAir.g:197:1: ruleAirport returns [EObject current=null] : (otherlv_0= 'Airport' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aname_2_0= RULE_STRING ) ) ( (lv_location_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleAirport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_aname_2_0=null;
        Token lv_location_3_0=null;


        	enterRule();

        try {
            // InternalAir.g:203:2: ( (otherlv_0= 'Airport' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aname_2_0= RULE_STRING ) ) ( (lv_location_3_0= RULE_STRING ) ) ) )
            // InternalAir.g:204:2: (otherlv_0= 'Airport' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aname_2_0= RULE_STRING ) ) ( (lv_location_3_0= RULE_STRING ) ) )
            {
            // InternalAir.g:204:2: (otherlv_0= 'Airport' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aname_2_0= RULE_STRING ) ) ( (lv_location_3_0= RULE_STRING ) ) )
            // InternalAir.g:205:3: otherlv_0= 'Airport' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aname_2_0= RULE_STRING ) ) ( (lv_location_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAirportAccess().getAirportKeyword_0());
            		
            // InternalAir.g:209:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAir.g:210:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAir.g:210:4: (lv_name_1_0= RULE_ID )
            // InternalAir.g:211:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAirportAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAirportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAir.g:227:3: ( (lv_aname_2_0= RULE_STRING ) )
            // InternalAir.g:228:4: (lv_aname_2_0= RULE_STRING )
            {
            // InternalAir.g:228:4: (lv_aname_2_0= RULE_STRING )
            // InternalAir.g:229:5: lv_aname_2_0= RULE_STRING
            {
            lv_aname_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_aname_2_0, grammarAccess.getAirportAccess().getAnameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAirportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"aname",
            						lv_aname_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAir.g:245:3: ( (lv_location_3_0= RULE_STRING ) )
            // InternalAir.g:246:4: (lv_location_3_0= RULE_STRING )
            {
            // InternalAir.g:246:4: (lv_location_3_0= RULE_STRING )
            // InternalAir.g:247:5: lv_location_3_0= RULE_STRING
            {
            lv_location_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_location_3_0, grammarAccess.getAirportAccess().getLocationSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAirportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"location",
            						lv_location_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAirport"


    // $ANTLR start "entryRuleAirline"
    // InternalAir.g:267:1: entryRuleAirline returns [EObject current=null] : iv_ruleAirline= ruleAirline EOF ;
    public final EObject entryRuleAirline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAirline = null;


        try {
            // InternalAir.g:267:48: (iv_ruleAirline= ruleAirline EOF )
            // InternalAir.g:268:2: iv_ruleAirline= ruleAirline EOF
            {
             newCompositeNode(grammarAccess.getAirlineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAirline=ruleAirline();

            state._fsp--;

             current =iv_ruleAirline; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAirline"


    // $ANTLR start "ruleAirline"
    // InternalAir.g:274:1: ruleAirline returns [EObject current=null] : (otherlv_0= 'Airline' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAirline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;


        	enterRule();

        try {
            // InternalAir.g:280:2: ( (otherlv_0= 'Airline' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ) )
            // InternalAir.g:281:2: (otherlv_0= 'Airline' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // InternalAir.g:281:2: (otherlv_0= 'Airline' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) )
            // InternalAir.g:282:3: otherlv_0= 'Airline' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAirlineAccess().getAirlineKeyword_0());
            		
            // InternalAir.g:286:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAir.g:287:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAir.g:287:4: (lv_name_1_0= RULE_ID )
            // InternalAir.g:288:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAirlineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAirlineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAir.g:304:3: ( (lv_description_2_0= RULE_STRING ) )
            // InternalAir.g:305:4: (lv_description_2_0= RULE_STRING )
            {
            // InternalAir.g:305:4: (lv_description_2_0= RULE_STRING )
            // InternalAir.g:306:5: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_description_2_0, grammarAccess.getAirlineAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAirlineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAirline"


    // $ANTLR start "entryRuleAirplane"
    // InternalAir.g:326:1: entryRuleAirplane returns [EObject current=null] : iv_ruleAirplane= ruleAirplane EOF ;
    public final EObject entryRuleAirplane() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAirplane = null;


        try {
            // InternalAir.g:326:49: (iv_ruleAirplane= ruleAirplane EOF )
            // InternalAir.g:327:2: iv_ruleAirplane= ruleAirplane EOF
            {
             newCompositeNode(grammarAccess.getAirplaneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAirplane=ruleAirplane();

            state._fsp--;

             current =iv_ruleAirplane; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAirplane"


    // $ANTLR start "ruleAirplane"
    // InternalAir.g:333:1: ruleAirplane returns [EObject current=null] : (otherlv_0= 'Airplane' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= RULE_STRING ) ) ( (lv_seats_3_0= RULE_INT ) ) ) ;
    public final EObject ruleAirplane() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_type_2_0=null;
        Token lv_seats_3_0=null;


        	enterRule();

        try {
            // InternalAir.g:339:2: ( (otherlv_0= 'Airplane' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= RULE_STRING ) ) ( (lv_seats_3_0= RULE_INT ) ) ) )
            // InternalAir.g:340:2: (otherlv_0= 'Airplane' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= RULE_STRING ) ) ( (lv_seats_3_0= RULE_INT ) ) )
            {
            // InternalAir.g:340:2: (otherlv_0= 'Airplane' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= RULE_STRING ) ) ( (lv_seats_3_0= RULE_INT ) ) )
            // InternalAir.g:341:3: otherlv_0= 'Airplane' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= RULE_STRING ) ) ( (lv_seats_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAirplaneAccess().getAirplaneKeyword_0());
            		
            // InternalAir.g:345:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAir.g:346:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAir.g:346:4: (lv_name_1_0= RULE_ID )
            // InternalAir.g:347:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAirplaneAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAirplaneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAir.g:363:3: ( (lv_type_2_0= RULE_STRING ) )
            // InternalAir.g:364:4: (lv_type_2_0= RULE_STRING )
            {
            // InternalAir.g:364:4: (lv_type_2_0= RULE_STRING )
            // InternalAir.g:365:5: lv_type_2_0= RULE_STRING
            {
            lv_type_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_type_2_0, grammarAccess.getAirplaneAccess().getTypeSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAirplaneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAir.g:381:3: ( (lv_seats_3_0= RULE_INT ) )
            // InternalAir.g:382:4: (lv_seats_3_0= RULE_INT )
            {
            // InternalAir.g:382:4: (lv_seats_3_0= RULE_INT )
            // InternalAir.g:383:5: lv_seats_3_0= RULE_INT
            {
            lv_seats_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_seats_3_0, grammarAccess.getAirplaneAccess().getSeatsINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAirplaneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"seats",
            						lv_seats_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAirplane"


    // $ANTLR start "entryRuleScheduledFlight"
    // InternalAir.g:403:1: entryRuleScheduledFlight returns [EObject current=null] : iv_ruleScheduledFlight= ruleScheduledFlight EOF ;
    public final EObject entryRuleScheduledFlight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduledFlight = null;


        try {
            // InternalAir.g:403:56: (iv_ruleScheduledFlight= ruleScheduledFlight EOF )
            // InternalAir.g:404:2: iv_ruleScheduledFlight= ruleScheduledFlight EOF
            {
             newCompositeNode(grammarAccess.getScheduledFlightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScheduledFlight=ruleScheduledFlight();

            state._fsp--;

             current =iv_ruleScheduledFlight; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScheduledFlight"


    // $ANTLR start "ruleScheduledFlight"
    // InternalAir.g:410:1: ruleScheduledFlight returns [EObject current=null] : (otherlv_0= 'ScheduledFlight' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'at' ( (lv_time_9_0= RULE_STRING ) ) ) ;
    public final EObject ruleScheduledFlight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_time_9_0=null;


        	enterRule();

        try {
            // InternalAir.g:416:2: ( (otherlv_0= 'ScheduledFlight' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'at' ( (lv_time_9_0= RULE_STRING ) ) ) )
            // InternalAir.g:417:2: (otherlv_0= 'ScheduledFlight' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'at' ( (lv_time_9_0= RULE_STRING ) ) )
            {
            // InternalAir.g:417:2: (otherlv_0= 'ScheduledFlight' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'at' ( (lv_time_9_0= RULE_STRING ) ) )
            // InternalAir.g:418:3: otherlv_0= 'ScheduledFlight' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'with' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'at' ( (lv_time_9_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getScheduledFlightAccess().getScheduledFlightKeyword_0());
            		
            // InternalAir.g:422:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAir.g:423:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAir.g:423:4: (lv_name_1_0= RULE_ID )
            // InternalAir.g:424:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScheduledFlightAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduledFlightRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getScheduledFlightAccess().getFromKeyword_2());
            		
            // InternalAir.g:444:3: ( (otherlv_3= RULE_ID ) )
            // InternalAir.g:445:4: (otherlv_3= RULE_ID )
            {
            // InternalAir.g:445:4: (otherlv_3= RULE_ID )
            // InternalAir.g:446:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduledFlightRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_3, grammarAccess.getScheduledFlightAccess().getFromAirportCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getScheduledFlightAccess().getToKeyword_4());
            		
            // InternalAir.g:461:3: ( (otherlv_5= RULE_ID ) )
            // InternalAir.g:462:4: (otherlv_5= RULE_ID )
            {
            // InternalAir.g:462:4: (otherlv_5= RULE_ID )
            // InternalAir.g:463:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduledFlightRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_5, grammarAccess.getScheduledFlightAccess().getToAirportCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getScheduledFlightAccess().getWithKeyword_6());
            		
            // InternalAir.g:478:3: ( (otherlv_7= RULE_ID ) )
            // InternalAir.g:479:4: (otherlv_7= RULE_ID )
            {
            // InternalAir.g:479:4: (otherlv_7= RULE_ID )
            // InternalAir.g:480:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduledFlightRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_7, grammarAccess.getScheduledFlightAccess().getAirlineAirlineCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getScheduledFlightAccess().getAtKeyword_8());
            		
            // InternalAir.g:495:3: ( (lv_time_9_0= RULE_STRING ) )
            // InternalAir.g:496:4: (lv_time_9_0= RULE_STRING )
            {
            // InternalAir.g:496:4: (lv_time_9_0= RULE_STRING )
            // InternalAir.g:497:5: lv_time_9_0= RULE_STRING
            {
            lv_time_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_time_9_0, grammarAccess.getScheduledFlightAccess().getTimeSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduledFlightRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScheduledFlight"


    // $ANTLR start "entryRuleSpecificFlight"
    // InternalAir.g:517:1: entryRuleSpecificFlight returns [EObject current=null] : iv_ruleSpecificFlight= ruleSpecificFlight EOF ;
    public final EObject entryRuleSpecificFlight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecificFlight = null;


        try {
            // InternalAir.g:517:55: (iv_ruleSpecificFlight= ruleSpecificFlight EOF )
            // InternalAir.g:518:2: iv_ruleSpecificFlight= ruleSpecificFlight EOF
            {
             newCompositeNode(grammarAccess.getSpecificFlightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecificFlight=ruleSpecificFlight();

            state._fsp--;

             current =iv_ruleSpecificFlight; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecificFlight"


    // $ANTLR start "ruleSpecificFlight"
    // InternalAir.g:524:1: ruleSpecificFlight returns [EObject current=null] : (otherlv_0= 'Flight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fname_2_0= RULE_STRING ) ) otherlv_3= 'scheduledFlight' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'on' ( (lv_date_6_0= RULE_STRING ) ) otherlv_7= 'pilot' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'airplane' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'staff' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* ) ;
    public final EObject ruleSpecificFlight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_fname_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_date_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalAir.g:530:2: ( (otherlv_0= 'Flight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fname_2_0= RULE_STRING ) ) otherlv_3= 'scheduledFlight' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'on' ( (lv_date_6_0= RULE_STRING ) ) otherlv_7= 'pilot' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'airplane' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'staff' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* ) )
            // InternalAir.g:531:2: (otherlv_0= 'Flight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fname_2_0= RULE_STRING ) ) otherlv_3= 'scheduledFlight' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'on' ( (lv_date_6_0= RULE_STRING ) ) otherlv_7= 'pilot' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'airplane' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'staff' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )
            {
            // InternalAir.g:531:2: (otherlv_0= 'Flight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fname_2_0= RULE_STRING ) ) otherlv_3= 'scheduledFlight' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'on' ( (lv_date_6_0= RULE_STRING ) ) otherlv_7= 'pilot' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'airplane' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'staff' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )
            // InternalAir.g:532:3: otherlv_0= 'Flight' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fname_2_0= RULE_STRING ) ) otherlv_3= 'scheduledFlight' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'on' ( (lv_date_6_0= RULE_STRING ) ) otherlv_7= 'pilot' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'airplane' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'staff' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSpecificFlightAccess().getFlightKeyword_0());
            		
            // InternalAir.g:536:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAir.g:537:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAir.g:537:4: (lv_name_1_0= RULE_ID )
            // InternalAir.g:538:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSpecificFlightAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecificFlightRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAir.g:554:3: ( (lv_fname_2_0= RULE_STRING ) )
            // InternalAir.g:555:4: (lv_fname_2_0= RULE_STRING )
            {
            // InternalAir.g:555:4: (lv_fname_2_0= RULE_STRING )
            // InternalAir.g:556:5: lv_fname_2_0= RULE_STRING
            {
            lv_fname_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_fname_2_0, grammarAccess.getSpecificFlightAccess().getFnameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecificFlightRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fname",
            						lv_fname_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getSpecificFlightAccess().getScheduledFlightKeyword_3());
            		
            // InternalAir.g:576:3: ( (otherlv_4= RULE_ID ) )
            // InternalAir.g:577:4: (otherlv_4= RULE_ID )
            {
            // InternalAir.g:577:4: (otherlv_4= RULE_ID )
            // InternalAir.g:578:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecificFlightRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_4, grammarAccess.getSpecificFlightAccess().getScheduledFlightScheduledFlightCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getSpecificFlightAccess().getOnKeyword_5());
            		
            // InternalAir.g:593:3: ( (lv_date_6_0= RULE_STRING ) )
            // InternalAir.g:594:4: (lv_date_6_0= RULE_STRING )
            {
            // InternalAir.g:594:4: (lv_date_6_0= RULE_STRING )
            // InternalAir.g:595:5: lv_date_6_0= RULE_STRING
            {
            lv_date_6_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_date_6_0, grammarAccess.getSpecificFlightAccess().getDateSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecificFlightRule());
            					}
            					setWithLastConsumed(
            						current,
            						"date",
            						lv_date_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getSpecificFlightAccess().getPilotKeyword_7());
            		
            // InternalAir.g:615:3: ( (otherlv_8= RULE_ID ) )
            // InternalAir.g:616:4: (otherlv_8= RULE_ID )
            {
            // InternalAir.g:616:4: (otherlv_8= RULE_ID )
            // InternalAir.g:617:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecificFlightRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_8, grammarAccess.getSpecificFlightAccess().getPilotPilotCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getSpecificFlightAccess().getAirplaneKeyword_9());
            		
            // InternalAir.g:632:3: ( (otherlv_10= RULE_ID ) )
            // InternalAir.g:633:4: (otherlv_10= RULE_ID )
            {
            // InternalAir.g:633:4: (otherlv_10= RULE_ID )
            // InternalAir.g:634:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecificFlightRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_10, grammarAccess.getSpecificFlightAccess().getPlaneAirplaneCrossReference_10_0());
            				

            }


            }

            otherlv_11=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getSpecificFlightAccess().getStaffKeyword_11());
            		
            // InternalAir.g:649:3: ( (otherlv_12= RULE_ID ) )
            // InternalAir.g:650:4: (otherlv_12= RULE_ID )
            {
            // InternalAir.g:650:4: (otherlv_12= RULE_ID )
            // InternalAir.g:651:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecificFlightRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_12, grammarAccess.getSpecificFlightAccess().getStaffFlightAttendantCrossReference_12_0());
            				

            }


            }

            // InternalAir.g:662:3: (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAir.g:663:4: otherlv_13= ',' ( (otherlv_14= RULE_ID ) )
            	    {
            	    otherlv_13=(Token)match(input,25,FOLLOW_4); 

            	    				newLeafNode(otherlv_13, grammarAccess.getSpecificFlightAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalAir.g:667:4: ( (otherlv_14= RULE_ID ) )
            	    // InternalAir.g:668:5: (otherlv_14= RULE_ID )
            	    {
            	    // InternalAir.g:668:5: (otherlv_14= RULE_ID )
            	    // InternalAir.g:669:6: otherlv_14= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSpecificFlightRule());
            	    						}
            	    					
            	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_14, grammarAccess.getSpecificFlightAccess().getStaffFlightAttendantCrossReference_13_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecificFlight"


    // $ANTLR start "entryRuleSchedule"
    // InternalAir.g:685:1: entryRuleSchedule returns [EObject current=null] : iv_ruleSchedule= ruleSchedule EOF ;
    public final EObject entryRuleSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedule = null;


        try {
            // InternalAir.g:685:49: (iv_ruleSchedule= ruleSchedule EOF )
            // InternalAir.g:686:2: iv_ruleSchedule= ruleSchedule EOF
            {
             newCompositeNode(grammarAccess.getScheduleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchedule=ruleSchedule();

            state._fsp--;

             current =iv_ruleSchedule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchedule"


    // $ANTLR start "ruleSchedule"
    // InternalAir.g:692:1: ruleSchedule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'flights' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) ;
    public final EObject ruleSchedule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalAir.g:698:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'flights' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) )
            // InternalAir.g:699:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'flights' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
            {
            // InternalAir.g:699:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'flights' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
            // InternalAir.g:700:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'with' otherlv_2= 'flights' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            {
            // InternalAir.g:700:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAir.g:701:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAir.g:701:4: (lv_name_0_0= RULE_ID )
            // InternalAir.g:702:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getScheduleAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getScheduleAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getScheduleAccess().getFlightsKeyword_2());
            		
            // InternalAir.g:726:3: ( (otherlv_3= RULE_ID ) )
            // InternalAir.g:727:4: (otherlv_3= RULE_ID )
            {
            // InternalAir.g:727:4: (otherlv_3= RULE_ID )
            // InternalAir.g:728:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduleRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_3, grammarAccess.getScheduleAccess().getSpecificFlightsSpecificFlightCrossReference_3_0());
            				

            }


            }

            // InternalAir.g:739:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAir.g:740:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getScheduleAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalAir.g:744:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalAir.g:745:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalAir.g:745:5: (otherlv_5= RULE_ID )
            	    // InternalAir.g:746:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getScheduleRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_5, grammarAccess.getScheduleAccess().getSpecificFlightsSpecificFlightCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchedule"


    // $ANTLR start "entryRuleEmployee"
    // InternalAir.g:762:1: entryRuleEmployee returns [EObject current=null] : iv_ruleEmployee= ruleEmployee EOF ;
    public final EObject entryRuleEmployee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmployee = null;


        try {
            // InternalAir.g:762:49: (iv_ruleEmployee= ruleEmployee EOF )
            // InternalAir.g:763:2: iv_ruleEmployee= ruleEmployee EOF
            {
             newCompositeNode(grammarAccess.getEmployeeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmployee=ruleEmployee();

            state._fsp--;

             current =iv_ruleEmployee; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmployee"


    // $ANTLR start "ruleEmployee"
    // InternalAir.g:769:1: ruleEmployee returns [EObject current=null] : (this_Pilot_0= rulePilot | this_FlightAttendant_1= ruleFlightAttendant | this_BagHandler_2= ruleBagHandler | this_GatePersonnel_3= ruleGatePersonnel ) ;
    public final EObject ruleEmployee() throws RecognitionException {
        EObject current = null;

        EObject this_Pilot_0 = null;

        EObject this_FlightAttendant_1 = null;

        EObject this_BagHandler_2 = null;

        EObject this_GatePersonnel_3 = null;



        	enterRule();

        try {
            // InternalAir.g:775:2: ( (this_Pilot_0= rulePilot | this_FlightAttendant_1= ruleFlightAttendant | this_BagHandler_2= ruleBagHandler | this_GatePersonnel_3= ruleGatePersonnel ) )
            // InternalAir.g:776:2: (this_Pilot_0= rulePilot | this_FlightAttendant_1= ruleFlightAttendant | this_BagHandler_2= ruleBagHandler | this_GatePersonnel_3= ruleGatePersonnel )
            {
            // InternalAir.g:776:2: (this_Pilot_0= rulePilot | this_FlightAttendant_1= ruleFlightAttendant | this_BagHandler_2= ruleBagHandler | this_GatePersonnel_3= ruleGatePersonnel )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt5=1;
                }
                break;
            case 28:
                {
                alt5=2;
                }
                break;
            case 29:
                {
                alt5=3;
                }
                break;
            case 30:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalAir.g:777:3: this_Pilot_0= rulePilot
                    {

                    			newCompositeNode(grammarAccess.getEmployeeAccess().getPilotParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Pilot_0=rulePilot();

                    state._fsp--;


                    			current = this_Pilot_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAir.g:786:3: this_FlightAttendant_1= ruleFlightAttendant
                    {

                    			newCompositeNode(grammarAccess.getEmployeeAccess().getFlightAttendantParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FlightAttendant_1=ruleFlightAttendant();

                    state._fsp--;


                    			current = this_FlightAttendant_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAir.g:795:3: this_BagHandler_2= ruleBagHandler
                    {

                    			newCompositeNode(grammarAccess.getEmployeeAccess().getBagHandlerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BagHandler_2=ruleBagHandler();

                    state._fsp--;


                    			current = this_BagHandler_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAir.g:804:3: this_GatePersonnel_3= ruleGatePersonnel
                    {

                    			newCompositeNode(grammarAccess.getEmployeeAccess().getGatePersonnelParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_GatePersonnel_3=ruleGatePersonnel();

                    state._fsp--;


                    			current = this_GatePersonnel_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmployee"


    // $ANTLR start "entryRulePilot"
    // InternalAir.g:816:1: entryRulePilot returns [EObject current=null] : iv_rulePilot= rulePilot EOF ;
    public final EObject entryRulePilot() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePilot = null;


        try {
            // InternalAir.g:816:46: (iv_rulePilot= rulePilot EOF )
            // InternalAir.g:817:2: iv_rulePilot= rulePilot EOF
            {
             newCompositeNode(grammarAccess.getPilotRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePilot=rulePilot();

            state._fsp--;

             current =iv_rulePilot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePilot"


    // $ANTLR start "rulePilot"
    // InternalAir.g:823:1: rulePilot returns [EObject current=null] : (otherlv_0= 'Pilot' ( (lv_name_1_0= RULE_ID ) ) ( (lv_piname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject rulePilot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_piname_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAir.g:829:2: ( (otherlv_0= 'Pilot' ( (lv_name_1_0= RULE_ID ) ) ( (lv_piname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalAir.g:830:2: (otherlv_0= 'Pilot' ( (lv_name_1_0= RULE_ID ) ) ( (lv_piname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalAir.g:830:2: (otherlv_0= 'Pilot' ( (lv_name_1_0= RULE_ID ) ) ( (lv_piname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )
            // InternalAir.g:831:3: otherlv_0= 'Pilot' ( (lv_name_1_0= RULE_ID ) ) ( (lv_piname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPilotAccess().getPilotKeyword_0());
            		
            // InternalAir.g:835:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAir.g:836:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAir.g:836:4: (lv_name_1_0= RULE_ID )
            // InternalAir.g:837:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPilotAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPilotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAir.g:853:3: ( (lv_piname_2_0= RULE_STRING ) )
            // InternalAir.g:854:4: (lv_piname_2_0= RULE_STRING )
            {
            // InternalAir.g:854:4: (lv_piname_2_0= RULE_STRING )
            // InternalAir.g:855:5: lv_piname_2_0= RULE_STRING
            {
            lv_piname_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_piname_2_0, grammarAccess.getPilotAccess().getPinameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPilotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"piname",
            						lv_piname_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPilotAccess().getWithKeyword_3());
            		
            // InternalAir.g:875:3: ( (otherlv_4= RULE_ID ) )
            // InternalAir.g:876:4: (otherlv_4= RULE_ID )
            {
            // InternalAir.g:876:4: (otherlv_4= RULE_ID )
            // InternalAir.g:877:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPilotRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getPilotAccess().getAirlineAirlineCrossReference_4_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePilot"


    // $ANTLR start "entryRuleFlightAttendant"
    // InternalAir.g:892:1: entryRuleFlightAttendant returns [EObject current=null] : iv_ruleFlightAttendant= ruleFlightAttendant EOF ;
    public final EObject entryRuleFlightAttendant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlightAttendant = null;


        try {
            // InternalAir.g:892:56: (iv_ruleFlightAttendant= ruleFlightAttendant EOF )
            // InternalAir.g:893:2: iv_ruleFlightAttendant= ruleFlightAttendant EOF
            {
             newCompositeNode(grammarAccess.getFlightAttendantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlightAttendant=ruleFlightAttendant();

            state._fsp--;

             current =iv_ruleFlightAttendant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlightAttendant"


    // $ANTLR start "ruleFlightAttendant"
    // InternalAir.g:899:1: ruleFlightAttendant returns [EObject current=null] : (otherlv_0= 'FlightAttendant' ( (lv_name_1_0= RULE_ID ) ) ( (lv_faname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleFlightAttendant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_faname_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAir.g:905:2: ( (otherlv_0= 'FlightAttendant' ( (lv_name_1_0= RULE_ID ) ) ( (lv_faname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalAir.g:906:2: (otherlv_0= 'FlightAttendant' ( (lv_name_1_0= RULE_ID ) ) ( (lv_faname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalAir.g:906:2: (otherlv_0= 'FlightAttendant' ( (lv_name_1_0= RULE_ID ) ) ( (lv_faname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )
            // InternalAir.g:907:3: otherlv_0= 'FlightAttendant' ( (lv_name_1_0= RULE_ID ) ) ( (lv_faname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFlightAttendantAccess().getFlightAttendantKeyword_0());
            		
            // InternalAir.g:911:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAir.g:912:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAir.g:912:4: (lv_name_1_0= RULE_ID )
            // InternalAir.g:913:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFlightAttendantAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlightAttendantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAir.g:929:3: ( (lv_faname_2_0= RULE_STRING ) )
            // InternalAir.g:930:4: (lv_faname_2_0= RULE_STRING )
            {
            // InternalAir.g:930:4: (lv_faname_2_0= RULE_STRING )
            // InternalAir.g:931:5: lv_faname_2_0= RULE_STRING
            {
            lv_faname_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_faname_2_0, grammarAccess.getFlightAttendantAccess().getFanameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlightAttendantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"faname",
            						lv_faname_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getFlightAttendantAccess().getWithKeyword_3());
            		
            // InternalAir.g:951:3: ( (otherlv_4= RULE_ID ) )
            // InternalAir.g:952:4: (otherlv_4= RULE_ID )
            {
            // InternalAir.g:952:4: (otherlv_4= RULE_ID )
            // InternalAir.g:953:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlightAttendantRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getFlightAttendantAccess().getAirlineAirlineCrossReference_4_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlightAttendant"


    // $ANTLR start "entryRuleBagHandler"
    // InternalAir.g:968:1: entryRuleBagHandler returns [EObject current=null] : iv_ruleBagHandler= ruleBagHandler EOF ;
    public final EObject entryRuleBagHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBagHandler = null;


        try {
            // InternalAir.g:968:51: (iv_ruleBagHandler= ruleBagHandler EOF )
            // InternalAir.g:969:2: iv_ruleBagHandler= ruleBagHandler EOF
            {
             newCompositeNode(grammarAccess.getBagHandlerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBagHandler=ruleBagHandler();

            state._fsp--;

             current =iv_ruleBagHandler; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBagHandler"


    // $ANTLR start "ruleBagHandler"
    // InternalAir.g:975:1: ruleBagHandler returns [EObject current=null] : (otherlv_0= 'BagHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_bhname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleBagHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_bhname_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAir.g:981:2: ( (otherlv_0= 'BagHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_bhname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalAir.g:982:2: (otherlv_0= 'BagHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_bhname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalAir.g:982:2: (otherlv_0= 'BagHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_bhname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )
            // InternalAir.g:983:3: otherlv_0= 'BagHandler' ( (lv_name_1_0= RULE_ID ) ) ( (lv_bhname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBagHandlerAccess().getBagHandlerKeyword_0());
            		
            // InternalAir.g:987:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAir.g:988:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAir.g:988:4: (lv_name_1_0= RULE_ID )
            // InternalAir.g:989:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBagHandlerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBagHandlerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAir.g:1005:3: ( (lv_bhname_2_0= RULE_STRING ) )
            // InternalAir.g:1006:4: (lv_bhname_2_0= RULE_STRING )
            {
            // InternalAir.g:1006:4: (lv_bhname_2_0= RULE_STRING )
            // InternalAir.g:1007:5: lv_bhname_2_0= RULE_STRING
            {
            lv_bhname_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_bhname_2_0, grammarAccess.getBagHandlerAccess().getBhnameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBagHandlerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bhname",
            						lv_bhname_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getBagHandlerAccess().getWithKeyword_3());
            		
            // InternalAir.g:1027:3: ( (otherlv_4= RULE_ID ) )
            // InternalAir.g:1028:4: (otherlv_4= RULE_ID )
            {
            // InternalAir.g:1028:4: (otherlv_4= RULE_ID )
            // InternalAir.g:1029:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBagHandlerRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getBagHandlerAccess().getAirportAirportCrossReference_4_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBagHandler"


    // $ANTLR start "entryRuleGatePersonnel"
    // InternalAir.g:1044:1: entryRuleGatePersonnel returns [EObject current=null] : iv_ruleGatePersonnel= ruleGatePersonnel EOF ;
    public final EObject entryRuleGatePersonnel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGatePersonnel = null;


        try {
            // InternalAir.g:1044:54: (iv_ruleGatePersonnel= ruleGatePersonnel EOF )
            // InternalAir.g:1045:2: iv_ruleGatePersonnel= ruleGatePersonnel EOF
            {
             newCompositeNode(grammarAccess.getGatePersonnelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGatePersonnel=ruleGatePersonnel();

            state._fsp--;

             current =iv_ruleGatePersonnel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGatePersonnel"


    // $ANTLR start "ruleGatePersonnel"
    // InternalAir.g:1051:1: ruleGatePersonnel returns [EObject current=null] : (otherlv_0= 'GatePersonnel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_gpname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleGatePersonnel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_gpname_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAir.g:1057:2: ( (otherlv_0= 'GatePersonnel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_gpname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalAir.g:1058:2: (otherlv_0= 'GatePersonnel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_gpname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalAir.g:1058:2: (otherlv_0= 'GatePersonnel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_gpname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )
            // InternalAir.g:1059:3: otherlv_0= 'GatePersonnel' ( (lv_name_1_0= RULE_ID ) ) ( (lv_gpname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGatePersonnelAccess().getGatePersonnelKeyword_0());
            		
            // InternalAir.g:1063:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAir.g:1064:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAir.g:1064:4: (lv_name_1_0= RULE_ID )
            // InternalAir.g:1065:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGatePersonnelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGatePersonnelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAir.g:1081:3: ( (lv_gpname_2_0= RULE_STRING ) )
            // InternalAir.g:1082:4: (lv_gpname_2_0= RULE_STRING )
            {
            // InternalAir.g:1082:4: (lv_gpname_2_0= RULE_STRING )
            // InternalAir.g:1083:5: lv_gpname_2_0= RULE_STRING
            {
            lv_gpname_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_gpname_2_0, grammarAccess.getGatePersonnelAccess().getGpnameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGatePersonnelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"gpname",
            						lv_gpname_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getGatePersonnelAccess().getWithKeyword_3());
            		
            // InternalAir.g:1103:3: ( (otherlv_4= RULE_ID ) )
            // InternalAir.g:1104:4: (otherlv_4= RULE_ID )
            {
            // InternalAir.g:1104:4: (otherlv_4= RULE_ID )
            // InternalAir.g:1105:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGatePersonnelRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getGatePersonnelAccess().getAirportAirportCrossReference_4_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGatePersonnel"


    // $ANTLR start "entryRulePassenger"
    // InternalAir.g:1120:1: entryRulePassenger returns [EObject current=null] : iv_rulePassenger= rulePassenger EOF ;
    public final EObject entryRulePassenger() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePassenger = null;


        try {
            // InternalAir.g:1120:50: (iv_rulePassenger= rulePassenger EOF )
            // InternalAir.g:1121:2: iv_rulePassenger= rulePassenger EOF
            {
             newCompositeNode(grammarAccess.getPassengerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePassenger=rulePassenger();

            state._fsp--;

             current =iv_rulePassenger; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePassenger"


    // $ANTLR start "rulePassenger"
    // InternalAir.g:1127:1: rulePassenger returns [EObject current=null] : (otherlv_0= 'Passenger' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_paname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ) ;
    public final EObject rulePassenger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_paname_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalAir.g:1133:2: ( (otherlv_0= 'Passenger' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_paname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ) )
            // InternalAir.g:1134:2: (otherlv_0= 'Passenger' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_paname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )
            {
            // InternalAir.g:1134:2: (otherlv_0= 'Passenger' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_paname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )
            // InternalAir.g:1135:3: otherlv_0= 'Passenger' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_paname_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPassengerAccess().getPassengerKeyword_0());
            		
            // InternalAir.g:1139:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAir.g:1140:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAir.g:1140:4: (lv_name_1_0= RULE_STRING )
            // InternalAir.g:1141:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPassengerAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPassengerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAir.g:1157:3: ( (lv_paname_2_0= RULE_STRING ) )
            // InternalAir.g:1158:4: (lv_paname_2_0= RULE_STRING )
            {
            // InternalAir.g:1158:4: (lv_paname_2_0= RULE_STRING )
            // InternalAir.g:1159:5: lv_paname_2_0= RULE_STRING
            {
            lv_paname_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_paname_2_0, grammarAccess.getPassengerAccess().getPanameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPassengerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"paname",
            						lv_paname_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPassengerAccess().getWithKeyword_3());
            		
            // InternalAir.g:1179:3: ( (otherlv_4= RULE_ID ) )
            // InternalAir.g:1180:4: (otherlv_4= RULE_ID )
            {
            // InternalAir.g:1180:4: (otherlv_4= RULE_ID )
            // InternalAir.g:1181:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPassengerRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_4, grammarAccess.getPassengerAccess().getSpecificFlightSpecificFlightCrossReference_4_0());
            				

            }


            }

            // InternalAir.g:1192:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAir.g:1193:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,25,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getPassengerAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalAir.g:1197:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalAir.g:1198:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalAir.g:1198:5: (otherlv_6= RULE_ID )
            	    // InternalAir.g:1199:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPassengerRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_6, grammarAccess.getPassengerAccess().getSpecificFlightSpecificFlightCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePassenger"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000F8087812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});

}