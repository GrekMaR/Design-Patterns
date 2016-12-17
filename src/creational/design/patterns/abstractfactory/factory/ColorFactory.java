package creational.design.patterns.abstractfactory.factory;

import creational.design.patterns.abstractfactory.Interface.Color;
import creational.design.patterns.abstractfactory.Interface.Shape;
import creational.design.patterns.abstractfactory.color.Blue;
import creational.design.patterns.abstractfactory.color.Green;
import creational.design.patterns.abstractfactory.color.Red;

/**
 * 
 * @author Thor Bendix
 *
 */
public class ColorFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType){
		return null;
	}

	@Override
	public Color getColor(String color) {
		if(color == null){
			return null;
		}		

		if(color.equalsIgnoreCase("RED")){
			return new Red();

		}else if(color.equalsIgnoreCase("GREEN")){
			return new Green();

		}else if(color.equalsIgnoreCase("BLUE")){
			return new Blue();
		}

		return null;
	}

}
