package creational.design.patterns.abstractfactory;

import creational.design.patterns.abstractfactory.Interface.Color;
import creational.design.patterns.abstractfactory.Interface.Shape;
import creational.design.patterns.abstractfactory.factory.AbstractFactory;
/**
 * https://sourcemaking.com/design_patterns/abstract_factory
 * Example, drawing a circle:
 * - Get AbstractFactory (ShapeFactory)
 * - Get Shape (Circle)
 * - Call draw (of Circle)
 * @author Thor Bendix
 *
 */
public class AbstractFactoryPetternDemo {
	public static void main(String[] args) {
		//get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		//get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		//call draw method of Shape Circle
		shape1.draw();

		//get an object of Shape Rectangle
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		//call draw method of Shape Rectangle
		shape2.draw();

		//get an object of Shape Square 
		Shape shape3 = shapeFactory.getShape("SQUARE");

		//call draw method of Shape Square
		shape3.draw();

		//get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		//get an object of Color Red
		Color color1 = colorFactory.getColor("RED");

		//call fill method of Red
		color1.fill();

		//get an object of Color Green
		Color color2 = colorFactory.getColor("Green");

		//call fill method of Green
		color2.fill();

		//get an object of Color Blue
		Color color3 = colorFactory.getColor("BLUE");

		//call fill method of Color Blue
		color3.fill();
	}
}
