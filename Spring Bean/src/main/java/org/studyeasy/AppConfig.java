package org.studyeasy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.studyeasy.cars.Corolla;
import org.studyeasy.cars.Swift;
import org.studyeasy.specs.V6;
import org.studyeasy.specs.V8;

@Configuration
@ComponentScan("org.studyeasy")
public class AppConfig {
	@Bean("myCorolla")
	public Corolla corolla()
	{
		return new Corolla();
	}
	@Bean("mySwift")
	public Swift swift()
	{
		return new Swift();
	}
	@Bean("V8Engine")
	public V8 v8()
	{
		return new V8();
	}
	@Bean("V6Engine")
	public V6 v6()
	{
		return new V6();
	}

}
