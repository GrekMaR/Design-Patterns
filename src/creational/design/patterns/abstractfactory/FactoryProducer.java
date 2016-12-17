package creational.design.patterns.abstractfactory;

import creational.design.patterns.abstractfactory.factory.AbstractFactory;
import creational.design.patterns.abstractfactory.factory.ColorFactory;
import creational.design.patterns.abstractfactory.factory.ShapeFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
		
		if(choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if(choice.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}
		
		return null;
	}
}
