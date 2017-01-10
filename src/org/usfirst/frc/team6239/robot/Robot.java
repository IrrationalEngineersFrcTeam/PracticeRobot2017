
package org.usfirst.frc.team6239.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team6239.robot.subsystems.DriveSub;
import org.usfirst.frc.team6239.robot.subsystems.ShooterArm;

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

	public void robotInit() {
		
		oi = new OI();
		robotmap = new RobotMap();
		DRIVE_SUB = new DriveSub();
		shooter_arm = new ShooterArm();

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
