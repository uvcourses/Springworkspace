package com.corona.week.SpringLearning.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDiBusiness {
	@Inject
	SomeCDIDAO someCDIDAO;

	public SomeCDIDAO getSomeCDIDAO() {
		return someCDIDAO;
	}

	public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}
}
