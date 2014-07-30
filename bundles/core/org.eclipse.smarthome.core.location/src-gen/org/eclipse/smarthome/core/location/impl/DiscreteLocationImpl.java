/**
 */
package org.eclipse.smarthome.core.location.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.smarthome.core.location.DiscreteLocation;
import org.eclipse.smarthome.core.location.LocationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.smarthome.core.location.impl.DiscreteLocationImpl#getAdjacentLocations <em>Adjacent Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscreteLocationImpl extends LocationImpl implements DiscreteLocation {
	/**
	 * The cached value of the '{@link #getAdjacentLocations() <em>Adjacent Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjacentLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscreteLocation> adjacentLocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteLocationImpl() {
		super();
		createAdjacentLocationsUpdater();
	}
	
	private void createAdjacentLocationsUpdater() {
		Adapter adapter = new AdapterImpl(){
			@SuppressWarnings("unchecked")
			@Override
			public void notifyChanged(Notification msg) {
				super.notifyChanged(msg);
				if (msg.getFeature().equals(LocationPackage.eINSTANCE.getDiscreteLocation_AdjacentLocations())){
					switch (msg.getEventType()) {
					
					case Notification.ADD:{
						DiscreteLocation newLocation = (DiscreteLocation) msg.getNewValue();
						updateNewLocation(newLocation);
						break;
					}
					case Notification.REMOVE:{
						DiscreteLocation oldLocation = (DiscreteLocation) msg.getOldValue();
						updateOldLocation(oldLocation);
						break;
					}
					case Notification.ADD_MANY:{
						Object newValue = msg.getNewValue();
						for (DiscreteLocation newLocation : (Iterable<DiscreteLocation>)newValue) {
							updateNewLocation(newLocation);
						}
						break;
					}
					case Notification.REMOVE_MANY:{
						for (DiscreteLocation oldLocation : (Iterable<DiscreteLocation>)msg.getOldValue()) {
							updateOldLocation(oldLocation);
						}
						break;
					}
					default:
						break;
					}
				}
			}
		};
		this.eAdapters().add(adapter);
	}
	
	/**
	 * 
	 * @generated NOT
	 */
	protected void updateOldLocation(DiscreteLocation oldLocation) {
		EList<DiscreteLocation> oldLocationAdjacents = oldLocation.getAdjacentLocations();
		if (oldLocationAdjacents.contains(this))
		oldLocationAdjacents.remove(this);
	}

	/**
	 * 
	 * @generated NOT
	 */
	private void updateNewLocation(DiscreteLocation newLocation) {
		EList<DiscreteLocation> newLocationAdjacents = newLocation.getAdjacentLocations();
		if (!newLocationAdjacents.contains(this))
		newLocationAdjacents.add(this);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocationPackage.Literals.DISCRETE_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscreteLocation> getAdjacentLocations() {
		if (adjacentLocations == null) {
			adjacentLocations = new EObjectResolvingEList<DiscreteLocation>(DiscreteLocation.class, this, LocationPackage.DISCRETE_LOCATION__ADJACENT_LOCATIONS);
		}
		return adjacentLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LocationPackage.DISCRETE_LOCATION__ADJACENT_LOCATIONS:
				return getAdjacentLocations();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LocationPackage.DISCRETE_LOCATION__ADJACENT_LOCATIONS:
				getAdjacentLocations().clear();
				getAdjacentLocations().addAll((Collection<? extends DiscreteLocation>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case LocationPackage.DISCRETE_LOCATION__ADJACENT_LOCATIONS:
				getAdjacentLocations().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LocationPackage.DISCRETE_LOCATION__ADJACENT_LOCATIONS:
				return adjacentLocations != null && !adjacentLocations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String format(String pattern) {
		return String.format(pattern, name);
	}

} //DiscreteLocationImpl
