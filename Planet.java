package corejava;

import java.util.Scanner;

/*
 * Planet is enum type that represent planets in solar system and they are defined with constants mass,radius properties
 * Each enum constant is declare with values for the mass and radius
 * The list of enum constants must end with semicolon
 * Calculate and print weight on all planets
 * 
 */
public enum Planet {
	MERCURY(3.303e+23,232.4397e6),
	VENUS(4.869e+24,6.0518e6),
	EARTH(5.976e+24,6.37814e6),
	MARS(6.421e+23,3.3972e6);
	
	private final double mass; // in KG
	private final double radius; //in meters
	
	private Planet(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
	}//Constructor
	
	private double mass() {return mass;}
	private double radius() {return radius;}
	
	//Universal Gravitational constant 
	public static final double G=6.67300E-11;
	
	double surfaceGravity() {return G*mass/(radius*radius);}
	
	double surfaceWeight(double otherMass){return otherMass*surfaceGravity();}
	
	public static void main(String[] ani) {
		Scanner scObj=new Scanner(System.in);
		System.out.println("Enter Your Weight : ");
		double earthWeight=scObj.nextDouble();
		double mass=earthWeight/EARTH.surfaceGravity();
		for(Planet p:Planet.values()) {
			System.out.printf("Your Weight on %s is %f%n",p,p.surfaceWeight(mass));
		}
	}
	
}
