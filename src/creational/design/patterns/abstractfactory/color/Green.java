package creational.design.patterns.abstractfactory.color;

import creational.design.patterns.abstractfactory.Interface.Color;

/**
 * 
 * @author Thor Bendix
 *
 */
public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("inside Green::fill() method.");
	}

}
