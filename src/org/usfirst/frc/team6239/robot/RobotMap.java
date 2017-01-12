package org.usfirst.frc.team6239.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public static int leftTalon1 = 0;
	public static int leftTalon2 = 1;
	public static int rightTalon1 = 2;
	public static int rightTalon2 = 3;
 	
	public Talon LeftController1;
	public Talon LeftController2;
	public Talon RightController1;
	public Talon RightController2;
	
	public static int solenoid1 = 0;
	public static int solenoid2 = 1;
	public static int solenoid3 = 2;
	public static int solenoid4 = 3;
	public static int solenoid5 = 4;
	public static int solenoid6 = 5;
	public static int solenoid7 = 6;
	public static int solenoid8 = 7;
	
	public DoubleSolenoid Solenoid1;
	public DoubleSolenoid Solenoid2;
	public DoubleSolenoid Solenoid3;
	public DoubleSolenoid Solenoid4;
	
	public RobotMap() {
		LeftController1 = new Talon(leftTalon1);
		LeftController2 = new Talon(leftTalon2);
		RightController1 = new Talon(rightTalon1);
		RightController2 = new Talon(rightTalon2);
		Solenoid1 = new DoubleSolenoid(solenoid1, solenoid2);
		Solenoid2 = new DoubleSolenoid(solenoid3, solenoid4);
		Solenoid3 = new DoubleSolenoid(solenoid5, solenoid6);
		Solenoid4 = new DoubleSolenoid(solenoid7, solenoid8);
	}
}
