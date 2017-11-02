package hello.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.beans.InputHolder;
import hello.helpers.VehicleDetailBuilder;

@Configuration
public class BeanDefinition 
{
	@Bean
	public VehicleDetailBuilder vehicleBuilde()
	{
		return new VehicleDetailBuilder();
	}
}
