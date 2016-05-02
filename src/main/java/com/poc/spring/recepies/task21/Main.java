package com.poc.spring.recepies.task21;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		final Logger logger = Logger.getLogger(Main.class);

		ApplicationContext context = new GenericXmlApplicationContext("beans.xml");
		
		SequenceGenerator generatorUsingSetterInjection = 
				(SequenceGenerator)context.getBean("sequenceGeneratorUsingSetterInjection");
		
		logger.info("sequenceGeneratorUsingSetterInjection started!!");
		
		System.out.println(generatorUsingSetterInjection.getSequence());
		System.out.println(generatorUsingSetterInjection.getSequence());
		System.out.println(generatorUsingSetterInjection.getSequence());
		System.out.println(generatorUsingSetterInjection.getSequence());
		System.out.println(generatorUsingSetterInjection.getSequence());
		System.out.println(generatorUsingSetterInjection.getSequence());
		System.out.println(generatorUsingSetterInjection.getSequence());
		System.out.println(generatorUsingSetterInjection.getSequence());
		
		logger.info("sequenceGeneratorUsingSetterInjection completed!!");
		
		SequenceGenerator generatorUsingConstructorInjection =
				context.getBean("sequenceGeneratorUsingConstructorInjection", SequenceGenerator.class);
		
		logger.info("sequenceGeneratorUsingConstructorInjection started!!");
		
		System.out.println(generatorUsingConstructorInjection.getSequence());
		System.out.println(generatorUsingConstructorInjection.getSequence());
		System.out.println(generatorUsingConstructorInjection.getSequence());
		System.out.println(generatorUsingConstructorInjection.getSequence());
		System.out.println(generatorUsingConstructorInjection.getSequence());
		System.out.println(generatorUsingConstructorInjection.getSequence());
		System.out.println(generatorUsingConstructorInjection.getSequence());
		System.out.println(generatorUsingConstructorInjection.getSequence());
		
		logger.info("sequenceGeneratorUsingConstructorInjection completed!!");
		
	}

}
