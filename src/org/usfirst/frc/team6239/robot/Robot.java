
package org.usfirst.frc.team6239.robot;

import java.io.IOException;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team6239.robot.subsystems.DriveSub;
import org.usfirst.frc.team6239.robot.subsystems.ShooterArm;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;
	public static RobotMap robotmap;
	public static DriveSub DRIVE_SUB;
	public static ShooterArm shooter_arm;
    public NetworkTable grip = NetworkTable.getTable("grip");
    public SmartDashboard smartDashboard;
	public SendableChooser<Enum> JoyType;
	public SendableChooser<Enum> DriveType;
    
    
    
    
    public enum DriveConfig {
		Joysticks,
		Arcade,
	}
    
    
	public void robotInit() {
		




		oi = new OI();
		robotmap = new RobotMap();
		DRIVE_SUB = new DriveSub();
		shooter_arm = new ShooterArm();
		
		smartDashboard = new SmartDashboard();
 		JoyType = new SendableChooser<Enum>();
 		DriveType = new SendableChooser<Enum>();
 		DriveType.addObject( "DriveType", DriveConfig.Arcade);
 		JoyType.addObject( "JoyType", DriveConfig.Joysticks);
 		smartDashboard.putData("JoyStick_data", JoyType);
 	    smartDashboard.putData("Drive_data", DriveType);
		
		
		
		
		
		// try {
	      //      new ProcessBuilder("/home/lvuser/grip").inheritIO().start();
	      //  } catch (IOException e) {
	       //     e.printStackTrace();
	    //    }

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
		 /* Get published values from GRIP using NetworkTables */
        for (double area : grip.getNumberArray("targets/area", new double[0])) {
            System.out.println("Got contour with area=" + area);
        }

	}
	
	public void teleopPeriodic(){
		Scheduler.getInstance().run();
		
		public static boolean arcade , oystick = false;
		
		public void DetirmineDrive(){
				
			
			if (smartDashboard.getData("JoyStick_data").equals(DriveConfig.Joysticks)){
				joystick=true;
			}
			
			
			if (smartDashboard.getData("Drive_data").equals(DriveConfig.Arcade)){
				arcade=true;
			}   
		   
	
		}
	
	


	}

	
}
