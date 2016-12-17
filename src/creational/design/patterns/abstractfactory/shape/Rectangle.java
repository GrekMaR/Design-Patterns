package creational.design.patterns.abstractfactory.shape;

import creational.design.patterns.abstractfactory.Interface.Shape;

/**
 * 
 * @author Thor Bendix
 *
 */
public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("inside Rectangle::draw() method");
	}

}
