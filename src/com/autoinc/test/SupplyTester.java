package com.autoinc.test;

import com.autoinc.supply.businesscontroler.SupplierControler;
import com.autoinc.supply.businesscontroler.SupplierControlerImpl;
import com.autoinc.util.SupplyServiceException;

public class SupplyTester {

	public static void main(String[] args) {

		SupplierControler control = new SupplierControlerImpl();
		
		try {
			control.confirmTransportation(2);
		} catch (SupplyServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		control.confirmTransportation(orderId)
		
//		control.findCheapestSupplier(AutoIn)
	}

}
