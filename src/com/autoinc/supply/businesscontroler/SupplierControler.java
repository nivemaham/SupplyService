package com.autoinc.supply.businesscontroler;

import com.autoinc.dao.TransportationStatusDAO;
import com.autoinc.util.SupplyServiceException;

public interface SupplierControler {
	
	enum TRANSPORTATION_STATUS{CONFIRM_PICKUP, DISPATCHED, DELIVERED, CANCELED}
	
	boolean confirmTransportation(int orderId) throws SupplyServiceException;
	
	boolean cancleTransportation(int orderId) throws SupplyServiceException;
	
	TransportationStatusDAO updateTransportationStatus(int transporatationOrderId, String currentstatus) throws SupplyServiceException;
	

}
