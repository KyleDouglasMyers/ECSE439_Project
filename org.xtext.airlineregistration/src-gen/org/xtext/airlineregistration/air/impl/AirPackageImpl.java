/**
 * generated by Xtext 2.26.0
 */
package org.xtext.airlineregistration.air.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.airlineregistration.air.AirFactory;
import org.xtext.airlineregistration.air.AirPackage;
import org.xtext.airlineregistration.air.Airline;
import org.xtext.airlineregistration.air.Airplane;
import org.xtext.airlineregistration.air.Airport;
import org.xtext.airlineregistration.air.BagHandler;
import org.xtext.airlineregistration.air.Employee;
import org.xtext.airlineregistration.air.Entity;
import org.xtext.airlineregistration.air.FlightAttendant;
import org.xtext.airlineregistration.air.GatePersonnel;
import org.xtext.airlineregistration.air.Model;
import org.xtext.airlineregistration.air.Passenger;
import org.xtext.airlineregistration.air.Pilot;
import org.xtext.airlineregistration.air.Schedule;
import org.xtext.airlineregistration.air.ScheduledFlight;
import org.xtext.airlineregistration.air.SpecificFlight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AirPackageImpl extends EPackageImpl implements AirPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass airportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass airlineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass airplaneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scheduledFlightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specificFlightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scheduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass employeeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pilotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flightAttendantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bagHandlerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gatePersonnelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass passengerEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.airlineregistration.air.AirPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AirPackageImpl()
  {
    super(eNS_URI, AirFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link AirPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AirPackage init()
  {
    if (isInited) return (AirPackage)EPackage.Registry.INSTANCE.getEPackage(AirPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredAirPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    AirPackageImpl theAirPackage = registeredAirPackage instanceof AirPackageImpl ? (AirPackageImpl)registeredAirPackage : new AirPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theAirPackage.createPackageContents();

    // Initialize created meta-data
    theAirPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAirPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AirPackage.eNS_URI, theAirPackage);
    return theAirPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Entities()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEntity_Name()
  {
    return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAirport()
  {
    return airportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAirport_Aname()
  {
    return (EAttribute)airportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAirport_Location()
  {
    return (EAttribute)airportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAirline()
  {
    return airlineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAirline_Description()
  {
    return (EAttribute)airlineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAirplane()
  {
    return airplaneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAirplane_Type()
  {
    return (EAttribute)airplaneEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAirplane_Seats()
  {
    return (EAttribute)airplaneEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getScheduledFlight()
  {
    return scheduledFlightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getScheduledFlight_From()
  {
    return (EReference)scheduledFlightEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getScheduledFlight_To()
  {
    return (EReference)scheduledFlightEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getScheduledFlight_Airline()
  {
    return (EReference)scheduledFlightEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getScheduledFlight_Time()
  {
    return (EAttribute)scheduledFlightEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSpecificFlight()
  {
    return specificFlightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpecificFlight_Fname()
  {
    return (EAttribute)specificFlightEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSpecificFlight_ScheduledFlight()
  {
    return (EReference)specificFlightEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpecificFlight_Date()
  {
    return (EAttribute)specificFlightEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSpecificFlight_Pilot()
  {
    return (EReference)specificFlightEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSpecificFlight_Plane()
  {
    return (EReference)specificFlightEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSpecificFlight_Staff()
  {
    return (EReference)specificFlightEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSchedule()
  {
    return scheduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSchedule_SpecificFlights()
  {
    return (EReference)scheduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEmployee()
  {
    return employeeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPilot()
  {
    return pilotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPilot_Piname()
  {
    return (EAttribute)pilotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPilot_Airline()
  {
    return (EReference)pilotEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFlightAttendant()
  {
    return flightAttendantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFlightAttendant_Faname()
  {
    return (EAttribute)flightAttendantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFlightAttendant_Airline()
  {
    return (EReference)flightAttendantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBagHandler()
  {
    return bagHandlerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBagHandler_Bhname()
  {
    return (EAttribute)bagHandlerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getBagHandler_Airport()
  {
    return (EReference)bagHandlerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGatePersonnel()
  {
    return gatePersonnelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGatePersonnel_Gpname()
  {
    return (EAttribute)gatePersonnelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGatePersonnel_Airport()
  {
    return (EReference)gatePersonnelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPassenger()
  {
    return passengerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPassenger_Paname()
  {
    return (EAttribute)passengerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPassenger_SpecificFlight()
  {
    return (EReference)passengerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AirFactory getAirFactory()
  {
    return (AirFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ENTITIES);

    entityEClass = createEClass(ENTITY);
    createEAttribute(entityEClass, ENTITY__NAME);

    airportEClass = createEClass(AIRPORT);
    createEAttribute(airportEClass, AIRPORT__ANAME);
    createEAttribute(airportEClass, AIRPORT__LOCATION);

    airlineEClass = createEClass(AIRLINE);
    createEAttribute(airlineEClass, AIRLINE__DESCRIPTION);

    airplaneEClass = createEClass(AIRPLANE);
    createEAttribute(airplaneEClass, AIRPLANE__TYPE);
    createEAttribute(airplaneEClass, AIRPLANE__SEATS);

    scheduledFlightEClass = createEClass(SCHEDULED_FLIGHT);
    createEReference(scheduledFlightEClass, SCHEDULED_FLIGHT__FROM);
    createEReference(scheduledFlightEClass, SCHEDULED_FLIGHT__TO);
    createEReference(scheduledFlightEClass, SCHEDULED_FLIGHT__AIRLINE);
    createEAttribute(scheduledFlightEClass, SCHEDULED_FLIGHT__TIME);

    specificFlightEClass = createEClass(SPECIFIC_FLIGHT);
    createEAttribute(specificFlightEClass, SPECIFIC_FLIGHT__FNAME);
    createEReference(specificFlightEClass, SPECIFIC_FLIGHT__SCHEDULED_FLIGHT);
    createEAttribute(specificFlightEClass, SPECIFIC_FLIGHT__DATE);
    createEReference(specificFlightEClass, SPECIFIC_FLIGHT__PILOT);
    createEReference(specificFlightEClass, SPECIFIC_FLIGHT__PLANE);
    createEReference(specificFlightEClass, SPECIFIC_FLIGHT__STAFF);

    scheduleEClass = createEClass(SCHEDULE);
    createEReference(scheduleEClass, SCHEDULE__SPECIFIC_FLIGHTS);

    employeeEClass = createEClass(EMPLOYEE);

    pilotEClass = createEClass(PILOT);
    createEAttribute(pilotEClass, PILOT__PINAME);
    createEReference(pilotEClass, PILOT__AIRLINE);

    flightAttendantEClass = createEClass(FLIGHT_ATTENDANT);
    createEAttribute(flightAttendantEClass, FLIGHT_ATTENDANT__FANAME);
    createEReference(flightAttendantEClass, FLIGHT_ATTENDANT__AIRLINE);

    bagHandlerEClass = createEClass(BAG_HANDLER);
    createEAttribute(bagHandlerEClass, BAG_HANDLER__BHNAME);
    createEReference(bagHandlerEClass, BAG_HANDLER__AIRPORT);

    gatePersonnelEClass = createEClass(GATE_PERSONNEL);
    createEAttribute(gatePersonnelEClass, GATE_PERSONNEL__GPNAME);
    createEReference(gatePersonnelEClass, GATE_PERSONNEL__AIRPORT);

    passengerEClass = createEClass(PASSENGER);
    createEAttribute(passengerEClass, PASSENGER__PANAME);
    createEReference(passengerEClass, PASSENGER__SPECIFIC_FLIGHT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    airportEClass.getESuperTypes().add(this.getEntity());
    airlineEClass.getESuperTypes().add(this.getEntity());
    airplaneEClass.getESuperTypes().add(this.getEntity());
    scheduledFlightEClass.getESuperTypes().add(this.getEntity());
    specificFlightEClass.getESuperTypes().add(this.getEntity());
    scheduleEClass.getESuperTypes().add(this.getEntity());
    employeeEClass.getESuperTypes().add(this.getEntity());
    pilotEClass.getESuperTypes().add(this.getEmployee());
    flightAttendantEClass.getESuperTypes().add(this.getEmployee());
    bagHandlerEClass.getESuperTypes().add(this.getEmployee());
    gatePersonnelEClass.getESuperTypes().add(this.getEmployee());
    passengerEClass.getESuperTypes().add(this.getEntity());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Entities(), this.getEntity(), null, "entities", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(airportEClass, Airport.class, "Airport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAirport_Aname(), ecorePackage.getEString(), "aname", null, 0, 1, Airport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAirport_Location(), ecorePackage.getEString(), "location", null, 0, 1, Airport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(airlineEClass, Airline.class, "Airline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAirline_Description(), ecorePackage.getEString(), "description", null, 0, 1, Airline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(airplaneEClass, Airplane.class, "Airplane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAirplane_Type(), ecorePackage.getEString(), "type", null, 0, 1, Airplane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAirplane_Seats(), ecorePackage.getEInt(), "seats", null, 0, 1, Airplane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scheduledFlightEClass, ScheduledFlight.class, "ScheduledFlight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScheduledFlight_From(), this.getAirport(), null, "from", null, 0, 1, ScheduledFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScheduledFlight_To(), this.getAirport(), null, "to", null, 0, 1, ScheduledFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScheduledFlight_Airline(), this.getAirline(), null, "airline", null, 0, 1, ScheduledFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScheduledFlight_Time(), ecorePackage.getEString(), "time", null, 0, 1, ScheduledFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(specificFlightEClass, SpecificFlight.class, "SpecificFlight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpecificFlight_Fname(), ecorePackage.getEString(), "fname", null, 0, 1, SpecificFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecificFlight_ScheduledFlight(), this.getScheduledFlight(), null, "scheduledFlight", null, 0, 1, SpecificFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpecificFlight_Date(), ecorePackage.getEString(), "date", null, 0, 1, SpecificFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecificFlight_Pilot(), this.getPilot(), null, "pilot", null, 0, 1, SpecificFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecificFlight_Plane(), this.getAirplane(), null, "plane", null, 0, 1, SpecificFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecificFlight_Staff(), this.getFlightAttendant(), null, "staff", null, 0, -1, SpecificFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSchedule_SpecificFlights(), this.getSpecificFlight(), null, "specificFlights", null, 0, -1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pilotEClass, Pilot.class, "Pilot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPilot_Piname(), ecorePackage.getEString(), "piname", null, 0, 1, Pilot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPilot_Airline(), this.getAirline(), null, "airline", null, 0, 1, Pilot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flightAttendantEClass, FlightAttendant.class, "FlightAttendant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFlightAttendant_Faname(), ecorePackage.getEString(), "faname", null, 0, 1, FlightAttendant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFlightAttendant_Airline(), this.getAirline(), null, "airline", null, 0, 1, FlightAttendant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bagHandlerEClass, BagHandler.class, "BagHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBagHandler_Bhname(), ecorePackage.getEString(), "bhname", null, 0, 1, BagHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBagHandler_Airport(), this.getAirport(), null, "airport", null, 0, 1, BagHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gatePersonnelEClass, GatePersonnel.class, "GatePersonnel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGatePersonnel_Gpname(), ecorePackage.getEString(), "gpname", null, 0, 1, GatePersonnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGatePersonnel_Airport(), this.getAirport(), null, "airport", null, 0, 1, GatePersonnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(passengerEClass, Passenger.class, "Passenger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPassenger_Paname(), ecorePackage.getEString(), "paname", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPassenger_SpecificFlight(), this.getSpecificFlight(), null, "specificFlight", null, 0, -1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //AirPackageImpl
