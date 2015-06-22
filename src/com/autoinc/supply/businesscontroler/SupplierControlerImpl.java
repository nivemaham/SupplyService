package com.autoinc.supply.businesscontroler;

import org.hibernate.Query;
import org.hibernate.Session;

import com.autoinc.dao.PurchaseDAO;
import com.autoinc.dao.TransportationStatusDAO;
import com.autoinc.util.HibernateUtil;
import com.autoinc.util.HibernateUtilImpl;
import com.autoinc.util.SupplyServiceException;

public class SupplierControlerImpl implements SupplierControler{

	private HibernateUtil hibernateUtil = new HibernateUtilImpl();

	@Override
	public boolean confirmTransportation(int orderId) throws SupplyServiceException{
		
		TransportationStatusDAO newTransportation =null;
		Session session = hibernateUtil.getSession();
		session.beginTransaction();
		
		String hql = "SELECT TS FROM TransportationStatusDAO TS WHERE TS.orderDAO.id = :orderId";
		Query query = session.createQuery(hql);
		query.setParameter("orderId", orderId);
		newTransportation = (TransportationStatusDAO) query.uniqueResult();
		
		if(newTransportation==null)
		{
			PurchaseDAO order = (PurchaseDAO) session.get(PurchaseDAO.class, orderId);
			newTransportation = new TransportationStatusDAO();
			newTransportation.setOrderDAO(order);
		}
		newTransportation.setShippingStatus(SupplierControler.TRANSPORTATION_STATUS.CONFIRM_PICKUP.toString());
		session.saveOrUpdate(newTransportation);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public TransportationStatusDAO updateTransportationStatus(int orderId,
			String currentstatus)  throws SupplyServiceException{
		Session session = hibernateUtil.getSession();
		session.beginTransaction();
		String hql = "SELECT TS FROM TransportationStatusDAO TS WHERE TS.orderDAO.id = :orderId";
		Query query = session.createQuery(hql);
		query.setParameter("orderId", orderId);
		TransportationStatusDAO results = (TransportationStatusDAO) query.uniqueResult();
		
		results.setShippingStatus(currentstatus);
		session.update(results);
		session.getTransaction().commit();
		session.close();
		return results;
	}

	@Override
	public boolean cancleTransportation(int orderId)  throws SupplyServiceException{
		TransportationStatusDAO newTransportation =null;
		Session session = hibernateUtil.getSession();
		session.beginTransaction();
		String hql = "SELECT TS FROM TransportationStatusDAO TS WHERE TS.orderDAO.id = :orderId";
		Query query = session.createQuery(hql);
		query.setParameter("orderId", orderId);
		newTransportation = (TransportationStatusDAO) query.uniqueResult();
		newTransportation.setShippingStatus(SupplierControler.TRANSPORTATION_STATUS.CANCELED.toString());
		session.saveOrUpdate(newTransportation);
		session.getTransaction().commit();
		session.close();
		return true;
	}


}
