package creational.design.patterns.abstractfactory.factory;

import creational.design.patterns.abstractfactory.Interface.Color;
import creational.design.patterns.abstractfactory.Interface.Shape;
import creational.design.patterns.abstractfactory.shape.Circle;
import creational.design.patterns.abstractfactory.shape.Rectangle;
import creational.design.patterns.abstractfactory.shape.Square;

/**
 * 
 * @author Thor Bendix
 *
 */
public class ShapeFactory extends AbstractFactory{

	@Override
	public Color getColor(String color) {	
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		if (shape == null) {
			return null;
		}

		if (shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if(shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if(shape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}

}
