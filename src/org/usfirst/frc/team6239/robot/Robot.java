
package org.usfirst.frc.team6239.robot;

import org.usfirst.frc.team6239.robot.subsystems.DriveSub; 
import org.usfirst.frc.team6239.robot.subsystems.ShooterArm;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {
	
    private BuiltInAccelerometer accel;
    
	public static OI oi;
	public static RobotMap robotmap;
	public static DriveSub DRIVE_SUB;
	public static ShooterArm shooter_arm;
	public static double currentAngleX;
	public static double currentAngleY;
	public SmartDashboard smartDashboard;
	public SendableChooser<Enum> JoyType;
	public SendableChooser<Enum> DriveType;
	
	public enum DriveConfig{
		Joysticks,
		Gamepad,
		Tank,
		Arcade
	}
	
	
	public void robotInit() {
		JoyType = new SendableChooser<Enum>();
		DriveType = new SendableChooser<Enum>();
		DriveType.addDefault( "DriveType",DriveConfig.Tank);
		DriveType.addObject( "DriveType",DriveConfig.Arcade);
		JoyType.addDefault( "JoyType",DriveConfig.Gamepad);
		JoyType.addObject( "JoyType",DriveConfig.Joysticks);
		oi = new OI();
		robotmap = new RobotMap();
		DRIVE_SUB = new DriveSub();
		shooter_arm = new ShooterArm();
		
		
		 accel = new BuiltInAccelerometer();
         currentAngleX = 0;
         currentAngleY = 0;
	}
   
	
    public void teleopPeriodic1() {
    	
    	boolean print_flag = false;
    	
    	double next_x = accel.getX();
    	double next_y = accel.getY();
    	
    	if (next_x != currentAngleX) 
    	{	
    		currentAngleX = next_x ;
    		print_flag = true;
    	}
    	
    	if (next_y != currentAngleY) 
    	{	
    		currentAngleY = next_y ;
    		print_flag = true;
    	}
    	
    	if (print_flag)
    	{
    		System.out.println("accel: X = " + next_x + ", Y = " + next_y);
    		
    	}

    }

	
	public void disabledInit() {
		

	}
	
	public void autonomousInit() {
		

	}
	
	public void teleopInit() {
		

	}
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();

	}
	
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();

	}
	
	public void teleopPeriodic() {
		Scheduler.getInstance().run();

	}

	
}
