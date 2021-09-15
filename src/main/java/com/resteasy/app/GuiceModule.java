package com.resteasy.app;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.resteasy.service.RestMaping;

public class GuiceModule implements Module{

	@Override
	public void configure(Binder binder) {
		
		binder.bind(RestMaping.class);
		
	}

}
