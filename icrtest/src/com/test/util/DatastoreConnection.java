package com.test.util;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;

public class DatastoreConnection {

	//private DatastoreService datastoreService 
	
	public DatastoreService getDataStoreService() {
		return DatastoreServiceFactory.getDatastoreService();
	}
	
	
	
	
}
