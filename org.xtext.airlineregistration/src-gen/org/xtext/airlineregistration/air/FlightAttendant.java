/**
 * generated by Xtext 2.26.0
 */
package org.xtext.airlineregistration.air;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Attendant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.airlineregistration.air.FlightAttendant#getAireline <em>Aireline</em>}</li>
 * </ul>
 *
 * @see org.xtext.airlineregistration.air.AirPackage#getFlightAttendant()
 * @model
 * @generated
 */
public interface FlightAttendant extends Employee
{
  /**
   * Returns the value of the '<em><b>Aireline</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aireline</em>' reference.
   * @see #setAireline(Airline)
   * @see org.xtext.airlineregistration.air.AirPackage#getFlightAttendant_Aireline()
   * @model
   * @generated
   */
  Airline getAireline();

  /**
   * Sets the value of the '{@link org.xtext.airlineregistration.air.FlightAttendant#getAireline <em>Aireline</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aireline</em>' reference.
   * @see #getAireline()
   * @generated
   */
  void setAireline(Airline value);

} // FlightAttendant