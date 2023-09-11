package com.amdocs.Doa.impl;

import com.amdocs.mainDao.DoctorDao;
import com.amdocs.mainDao.dbDao;

public class DoctorImpl implements DoctorDao {
	dbDao dbdao = new dbImpl();
	
@Override
  public void viewAll() {
		dbdao.viewAllDoctor();
	}

}
