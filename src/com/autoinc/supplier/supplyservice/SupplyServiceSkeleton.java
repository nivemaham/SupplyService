/**
 * SupplyServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.autoinc.supplier.supplyservice;

import com.autoinc.dao.TransportationStatusDAO;
import com.autoinc.supply.businesscontroler.SupplierControler;
import com.autoinc.supply.businesscontroler.SupplierControlerImpl;
import com.autoinc.util.SupplyServiceException;

/**
 * SupplyServiceSkeleton java skeleton for the axisService
 */
public class SupplyServiceSkeleton {
	SupplierControler controler = new SupplierControlerImpl();

	/**
	 * Auto generated method signature
	 * 
	 * @param cancelTransportation
	 * @return cancelTransportationResponse
	 * @throws CancelTransportationFaultException
	 */

	public com.autoinc.supplier.supplyservice.CancelTransportationResponse cancelTransportation(
			com.autoinc.supplier.supplyservice.CancelTransportation cancelTransportation)
			throws CancelTransportationFaultException {
		CancelTransportationResponse response = new CancelTransportationResponse();

		try {
			response.setIsCanceled(controler
					.cancleTransportation(cancelTransportation.getOrderId()));
		} catch (SupplyServiceException e) {
			throw new CancelTransportationFaultException(
					"Error while getting canceling supply " + e.getMessage(), e);
		}
		response.setOrdertoken(cancelTransportation.getOrderToken());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param confirmTransportation
	 * @return confirmTransportationResponse
	 * @throws ConfirmTransportationFaultException
	 */

	public com.autoinc.supplier.supplyservice.ConfirmTransportationResponse confirmTransportation(
			com.autoinc.supplier.supplyservice.ConfirmTransportation confirmTransportation)
			throws ConfirmTransportationFaultException {
		ConfirmTransportationResponse response = new ConfirmTransportationResponse();

		try {
			response.setIsTransportationAvailable(controler
					.confirmTransportation(confirmTransportation.getOrderId()));
		} catch (SupplyServiceException e) {
			ConfirmTransportationFaultException ex = new ConfirmTransportationFaultException();
			SupplyExcption fault = new SupplyExcption();
			SupplyExceptionType fau = new SupplyExceptionType();
			fau.localMessage="Cannot confirm transportation";
			fault.localSupplyExcption= fau;
			ex.setFaultMessage(fault);
			throw ex;
		}
		response.setOrderId(confirmTransportation.getOrderToken());
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param updateTransportationStatus
	 * @return updateTransportationStatusResponse
	 * @throws UpdateTransportationStatusFaultException
	 */

	public com.autoinc.supplier.supplyservice.UpdateTransportationStatusResponse updateTransportationStatus(
			com.autoinc.supplier.supplyservice.UpdateTransportationStatus updateTransportationStatus)
			throws UpdateTransportationStatusFaultException {

		UpdateTransportationStatusResponse response = new UpdateTransportationStatusResponse();
		TransportationStatusDAO res;
		try {
			res = controler.updateTransportationStatus(
					updateTransportationStatus.getOrderId(),
					updateTransportationStatus.getTransportationStatus());
			response.setStatus(res.getShippingStatus());
			response.setTranporationId(res.getId());
		} catch (SupplyServiceException e) {
			throw new UpdateTransportationStatusFaultException(
					"Error while updating transportation status. "
							+ e.getMessage(), e);
		}
		response.setOrderId(updateTransportationStatus.getOrderId());

		return response;
	}

}
