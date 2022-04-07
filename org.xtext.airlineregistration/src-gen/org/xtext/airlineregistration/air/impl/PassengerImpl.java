/**
 * generated by Xtext 2.26.0
 */
package org.xtext.airlineregistration.air.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.airlineregistration.air.AirPackage;
import org.xtext.airlineregistration.air.Flight;
import org.xtext.airlineregistration.air.Passenger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passenger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.airlineregistration.air.impl.PassengerImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.xtext.airlineregistration.air.impl.PassengerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.airlineregistration.air.impl.PassengerImpl#getFlight <em>Flight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassengerImpl extends EntityImpl implements Passenger
{
  /**
   * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmail()
   * @generated
   * @ordered
   */
  protected static final String EMAIL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmail()
   * @generated
   * @ordered
   */
  protected String email = EMAIL_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFlight() <em>Flight</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlight()
   * @generated
   * @ordered
   */
  protected EList<Flight> flight;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PassengerImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AirPackage.Literals.PASSENGER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEmail()
  {
    return email;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEmail(String newEmail)
  {
    String oldEmail = email;
    email = newEmail;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AirPackage.PASSENGER__EMAIL, oldEmail, email));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AirPackage.PASSENGER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Flight> getFlight()
  {
    if (flight == null)
    {
      flight = new EObjectResolvingEList<Flight>(Flight.class, this, AirPackage.PASSENGER__FLIGHT);
    }
    return flight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AirPackage.PASSENGER__EMAIL:
        return getEmail();
      case AirPackage.PASSENGER__NAME:
        return getName();
      case AirPackage.PASSENGER__FLIGHT:
        return getFlight();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AirPackage.PASSENGER__EMAIL:
        setEmail((String)newValue);
        return;
      case AirPackage.PASSENGER__NAME:
        setName((String)newValue);
        return;
      case AirPackage.PASSENGER__FLIGHT:
        getFlight().clear();
        getFlight().addAll((Collection<? extends Flight>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AirPackage.PASSENGER__EMAIL:
        setEmail(EMAIL_EDEFAULT);
        return;
      case AirPackage.PASSENGER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AirPackage.PASSENGER__FLIGHT:
        getFlight().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AirPackage.PASSENGER__EMAIL:
        return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
      case AirPackage.PASSENGER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AirPackage.PASSENGER__FLIGHT:
        return flight != null && !flight.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (email: ");
    result.append(email);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PassengerImpl