package model.dao;

import model.dao.mpl.SellerDaomplJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaomplJDBC();
	}
}
