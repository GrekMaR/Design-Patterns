package creational.design.patterns.abstractfactory.color;

import creational.design.patterns.abstractfactory.Interface.Color;

/**
 * 
 * @author Thor Bendix
 *
 */
public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("inside Blue::fill() method.");
	}

}
