package creational.design.patterns.abstractfactory.color;

import creational.design.patterns.abstractfactory.Interface.Color;

/**
 * 
 * @author Thor Bendix
 *
 */
public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("inside Red::fill() method.");
	}

}
