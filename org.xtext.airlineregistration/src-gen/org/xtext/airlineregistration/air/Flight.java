/**
 * generated by Xtext 2.26.0
 */
package org.xtext.airlineregistration.air;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.airlineregistration.air.Flight#getFname <em>Fname</em>}</li>
 *   <li>{@link org.xtext.airlineregistration.air.Flight#getFrom <em>From</em>}</li>
 *   <li>{@link org.xtext.airlineregistration.air.Flight#getTo <em>To</em>}</li>
 *   <li>{@link org.xtext.airlineregistration.air.Flight#getAirline <em>Airline</em>}</li>
 *   <li>{@link org.xtext.airlineregistration.air.Flight#getTime <em>Time</em>}</li>
 *   <li>{@link org.xtext.airlineregistration.air.Flight#getPilot <em>Pilot</em>}</li>
 *   <li>{@link org.xtext.airlineregistration.air.Flight#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.xtext.airlineregistration.air.Flight#getStaff <em>Staff</em>}</li>
 * </ul>
 *
 * @see org.xtext.airlineregistration.air.AirPackage#getFlight()
 * @model
 * @generated
 */
public interface Flight extends Entity
{
  /**
   * Returns the value of the '<em><b>Fname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fname</em>' attribute.
   * @see #setFname(String)
   * @see org.xtext.airlineregistration.air.AirPackage#getFlight_Fname()
   * @model
   * @generated
   */
  String getFname();

  /**
   * Sets the value of the '{@link org.xtext.airlineregistration.air.Flight#getFname <em>Fname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fname</em>' attribute.
   * @see #getFname()
   * @generated
   */
  void setFname(String value);

  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(Airport)
   * @see org.xtext.airlineregistration.air.AirPackage#getFlight_From()
   * @model
   * @generated
   */
  Airport getFrom();

  /**
   * Sets the value of the '{@link org.xtext.airlineregistration.air.Flight#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Airport value);

  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(Airport)
   * @see org.xtext.airlineregistration.air.AirPackage#getFlight_To()
   * @model
   * @generated
   */
  Airport getTo();

  /**
   * Sets the value of the '{@link org.xtext.airlineregistration.air.Flight#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Airport value);

  /**
   * Returns the value of the '<em><b>Airline</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Airline</em>' reference.
   * @see #setAirline(Airline)
   * @see org.xtext.airlineregistration.air.AirPackage#getFlight_Airline()
   * @model
   * @generated
   */
  Airline getAirline();

  /**
   * Sets the value of the '{@link org.xtext.airlineregistration.air.Flight#getAirline <em>Airline</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Airline</em>' reference.
   * @see #getAirline()
   * @generated
   */
  void setAirline(Airline value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(String)
   * @see org.xtext.airlineregistration.air.AirPackage#getFlight_Time()
   * @model
   * @generated
   */
  String getTime();

  /**
   * Sets the value of the '{@link org.xtext.airlineregistration.air.Flight#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(String value);

  /**
   * Returns the value of the '<em><b>Pilot</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pilot</em>' reference.
   * @see #setPilot(Pilot)
   * @see org.xtext.airlineregistration.air.AirPackage#getFlight_Pilot()
   * @model
   * @generated
   */
  Pilot getPilot();

  /**
   * Sets the value of the '{@link org.xtext.airlineregistration.air.Flight#getPilot <em>Pilot</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pilot</em>' reference.
   * @see #getPilot()
   * @generated
   */
  void setPilot(Pilot value);

  /**
   * Returns the value of the '<em><b>Plane</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plane</em>' reference.
   * @see #setPlane(Airplane)
   * @see org.xtext.airlineregistration.air.AirPackage#getFlight_Plane()
   * @model
   * @generated
   */
  Airplane getPlane();

  /**
   * Sets the value of the '{@link org.xtext.airlineregistration.air.Flight#getPlane <em>Plane</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plane</em>' reference.
   * @see #getPlane()
   * @generated
   */
  void setPlane(Airplane value);

  /**
   * Returns the value of the '<em><b>Staff</b></em>' reference list.
   * The list contents are of type {@link org.xtext.airlineregistration.air.FlightAttendant}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Staff</em>' reference list.
   * @see org.xtext.airlineregistration.air.AirPackage#getFlight_Staff()
   * @model
   * @generated
   */
  EList<FlightAttendant> getStaff();

} // Flight
