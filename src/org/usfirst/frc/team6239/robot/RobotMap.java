package org.usfirst.frc.team6239.robot;

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
	
	public Solenoid Solenoid1;
	public Solenoid Solenoid2;
	public Solenoid Solenoid3;
	public Solenoid Solenoid4;
	
	public RobotMap() {
		LeftController1 = new Talon(leftTalon1);
		LeftController2 = new Talon(leftTalon2);
		RightController1 = new Talon(rightTalon1);
		RightController2 = new Talon(rightTalon2);
		Solenoid1 = new Solenoid(solenoid1);
		Solenoid2 = new Solenoid(solenoid2);
		Solenoid3 = new Solenoid(solenoid3);
		Solenoid4 = new Solenoid(solenoid4);
	}
}
