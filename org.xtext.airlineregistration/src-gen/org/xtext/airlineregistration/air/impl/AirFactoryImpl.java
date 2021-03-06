/**
 * generated by Xtext 2.26.0
 */
package org.xtext.airlineregistration.air.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.airlineregistration.air.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AirFactoryImpl extends EFactoryImpl implements AirFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AirFactory init()
  {
    try
    {
      AirFactory theAirFactory = (AirFactory)EPackage.Registry.INSTANCE.getEFactory(AirPackage.eNS_URI);
      if (theAirFactory != null)
      {
        return theAirFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AirFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AirFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AirPackage.MODEL: return createModel();
      case AirPackage.ENTITY: return createEntity();
      case AirPackage.AIRPORT: return createAirport();
      case AirPackage.AIRLINE: return createAirline();
      case AirPackage.AIRPLANE: return createAirplane();
      case AirPackage.SCHEDULED_FLIGHT: return createScheduledFlight();
      case AirPackage.SPECIFIC_FLIGHT: return createSpecificFlight();
      case AirPackage.SCHEDULE: return createSchedule();
      case AirPackage.EMPLOYEE: return createEmployee();
      case AirPackage.PILOT: return createPilot();
      case AirPackage.FLIGHT_ATTENDANT: return createFlightAttendant();
      case AirPackage.BAG_HANDLER: return createBagHandler();
      case AirPackage.GATE_PERSONNEL: return createGatePersonnel();
      case AirPackage.PASSENGER: return createPassenger();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Airport createAirport()
  {
    AirportImpl airport = new AirportImpl();
    return airport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Airline createAirline()
  {
    AirlineImpl airline = new AirlineImpl();
    return airline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Airplane createAirplane()
  {
    AirplaneImpl airplane = new AirplaneImpl();
    return airplane;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScheduledFlight createScheduledFlight()
  {
    ScheduledFlightImpl scheduledFlight = new ScheduledFlightImpl();
    return scheduledFlight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpecificFlight createSpecificFlight()
  {
    SpecificFlightImpl specificFlight = new SpecificFlightImpl();
    return specificFlight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Schedule createSchedule()
  {
    ScheduleImpl schedule = new ScheduleImpl();
    return schedule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Employee createEmployee()
  {
    EmployeeImpl employee = new EmployeeImpl();
    return employee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pilot createPilot()
  {
    PilotImpl pilot = new PilotImpl();
    return pilot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FlightAttendant createFlightAttendant()
  {
    FlightAttendantImpl flightAttendant = new FlightAttendantImpl();
    return flightAttendant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BagHandler createBagHandler()
  {
    BagHandlerImpl bagHandler = new BagHandlerImpl();
    return bagHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GatePersonnel createGatePersonnel()
  {
    GatePersonnelImpl gatePersonnel = new GatePersonnelImpl();
    return gatePersonnel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Passenger createPassenger()
  {
    PassengerImpl passenger = new PassengerImpl();
    return passenger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AirPackage getAirPackage()
  {
    return (AirPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AirPackage getPackage()
  {
    return AirPackage.eINSTANCE;
  }

} //AirFactoryImpl
