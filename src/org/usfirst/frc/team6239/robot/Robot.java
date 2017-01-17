
package org.usfirst.frc.team6239.robot;

import java.io.IOException;

import org.usfirst.frc.team6239.robot.subsystems.DriveSub;
import org.usfirst.frc.team6239.robot.subsystems.RollerArmPneumatics;
import org.usfirst.frc.team6239.robot.subsystems.ShooterArm;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class Robot extends IterativeRobot {
	
    private BuiltInAccelerometer accel;
    
	public static OI oi;
	public static RobotMap robotmap;
	public static DriveSub DRIVE_SUB;
	public static ShooterArm shooter_arm;
	public static RollerArmPneumatics roller_arm_pneu;
	public static double currentAngleX;
	public static double currentAngleY;
	public SmartDashboard smartDashboard;
	public SendableChooser<Enum> JoyType;
	public SendableChooser<Enum> DriveType;
	public NetworkTable grip = NetworkTable.getTable("grip");
	
	public enum DriveConfig {
		Joysticks,
		Gamepad,
		Tank,
		Arcade
	}
	
	
	public void robotInit() {		
				
		oi = new OI();
		robotmap = new RobotMap();
		DRIVE_SUB = new DriveSub();
		shooter_arm = new ShooterArm();
		roller_arm_pneu = new RollerArmPneumatics();
		 try { 
			   new ProcessBuilder("/home/lvuser/grip").inheritIO().start(); 
			 } catch (IOException e) { 
			  e.printStackTrace(); 
       } 

		
		
		 accel = new BuiltInAccelerometer();
         currentAngleX = 0;
         currentAngleY = 0;
         
 		smartDashboard = new SmartDashboard();
 		JoyType = new SendableChooser<Enum>();
 		DriveType = new SendableChooser<Enum>();
 		DriveType.addDefault( "DriveType", DriveConfig.Tank);
 		DriveType.addObject( "DriveType", DriveConfig.Arcade);
 		JoyType.addDefault( "JoyType", DriveConfig.Gamepad);
 		JoyType.addObject( "JoyType", DriveConfig.Joysticks);
 		smartDashboard.putData("JoyStick_data", JoyType);
 	    smartDashboard.putData("Drive_data", DriveType);
 	    
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
			DetirmineDrive();

	}
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();

	}
	
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		for (double area : grip.getNumberArray("targets/area", new double[0])) { 
			System.out.println("Got contour with area=" + area); 
		}

	}
	
	public void teleopPeriodic() {
		Scheduler.getInstance().run();

	}
	
	
	public static boolean tank,arcade,joystick,gamepad = false;
	
	public void DetirmineDrive(){
		
		if (smartDashboard.getData("JoyStick_data").equals(DriveConfig.Gamepad)){
			gamepad=true;
			
		}
		if (smartDashboard.getData("JoyStick_data").equals(DriveConfig.Joysticks)){
			joystick=true;
		}
		if (smartDashboard.getData("Drive_data").equals(DriveConfig.Tank)){
			tank=true;
		}
		if (smartDashboard.getData("Drive_data").equals(DriveConfig.Arcade)){
			arcade=true;
		}
		
		
	}
	
}
