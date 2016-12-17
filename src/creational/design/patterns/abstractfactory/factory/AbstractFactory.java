package creational.design.patterns.abstractfactory.factory;

import creational.design.patterns.abstractfactory.Interface.Color;
import creational.design.patterns.abstractfactory.Interface.Shape;

/**
 * https://sourcemaking.com/design_patterns/abstract_factory
 * Intent:
 * * Provide an interface for creating families of related or dependent objects without specifying their concrete classes
 * * A hierarchy that encapsulates: Many possible "platforms", and the construction of suite of "products"
 * * The 'new' operator is considered harmful.
 * 
 * Problem:
 * If an application si to be portable, it needs to encapsulate platform dependencies. These "platforms" might include:
 * windowing system, operating system, database, etc. Too often this encapsulation is not negineered in advance,
 * and lots of #ifdef case statements with options for all currently supported platforms begin to procreate like rabbits
 * throughout the code.
 * 
 * @author Thor Bendix
 *
 */
public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
}
