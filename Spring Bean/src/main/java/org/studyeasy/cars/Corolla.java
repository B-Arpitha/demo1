package org.studyeasy.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.studyeasy.interfaces.Car;
import org.studyeasy.interfaces.Engine;


public class Corolla implements Car {
	
	@Autowired
	@Qualifier("V8Engine") 			// this is used to avoid ambigious situation
	Engine e;
	@Autowired
	@Qualifier("V6Engine")
	Engine e1;
	

	public String specs() {
				
		String spec = "Sedan from Toyota engine type as "+e.type()+" "+e1.type();
		return spec;
	}

}
