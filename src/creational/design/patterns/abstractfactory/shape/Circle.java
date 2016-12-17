package creational.design.patterns.abstractfactory.shape;

import creational.design.patterns.abstractfactory.Interface.Shape;

/**
 * 
 * @author Thor Bendix
 *
 */
public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method");
	}
	
}
