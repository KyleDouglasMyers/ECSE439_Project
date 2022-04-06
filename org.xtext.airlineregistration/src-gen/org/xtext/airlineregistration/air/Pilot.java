/**
 * generated by Xtext 2.26.0
 */
package org.xtext.airlineregistration.air;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pilot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.airlineregistration.air.Pilot#getAireline <em>Aireline</em>}</li>
 * </ul>
 *
 * @see org.xtext.airlineregistration.air.AirPackage#getPilot()
 * @model
 * @generated
 */
public interface Pilot extends Employee
{
  /**
   * Returns the value of the '<em><b>Aireline</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aireline</em>' reference.
   * @see #setAireline(Airline)
   * @see org.xtext.airlineregistration.air.AirPackage#getPilot_Aireline()
   * @model
   * @generated
   */
  Airline getAireline();

  /**
   * Sets the value of the '{@link org.xtext.airlineregistration.air.Pilot#getAireline <em>Aireline</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aireline</em>' reference.
   * @see #getAireline()
   * @generated
   */
  void setAireline(Airline value);

} // Pilot
