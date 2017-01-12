
package org.usfirst.frc.team6239.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import jdk.nashorn.internal.scripts.JO;
import org.usfirst.frc.team6239.robot.subsystems.DriveSub;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team6239.robot.subsystems.ShooterArm;


public class Robot extends IterativeRobot {

	public  OI oi;
	public  RobotMap robotmap;
	public static DriveSub DRIVE_SUB;
	public ShooterArm shooter_arm;
	public  SendableChooser<Enum> JoyType;
    public SendableChooser<Enum>DriveType;
    public SmartDashboard smartDashboard;


    public enum DriveConfig {
    	Joysticks,
		Gamepad,
		TankDrive,
		ArcadeDrive
	}

	public void robotInit() {
        JoyType = new SendableChooser<Enum>();
        JoyType.addDefault("JoySticks",DriveConfig.Gamepad);
        JoyType.addObject("Gamepad",DriveConfig.Joysticks);
        DriveType = new SendableChooser<Enum>();
        DriveType.addDefault("TankDrive",DriveConfig.TankDrive);
        DriveType.addObject("ArcadeDrive",DriveConfig.ArcadeDrive);
		smartDashboard.putData("Choose Joystick type",JoyType);
		smartDashboard.putData("Choose Drivetype",DriveType);



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
		DetirmineDrive();

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

	public void DetirmineDrive(){

        boolean tank , arcade , joystick , gamepad = false;

        if(smartDashboard.getData("Choose Joystick type").equals(DriveConfig.Joysticks)){

        }
    	if(smartDashboard.getData("Choose Drivetype").equals(DriveConfig.ArcadeDrive)){


        }
        if(smartDashboard.getData("Choose Joystick type").equals(DriveConfig.Gamepad)){

        }
        if(smartDashboard.getData("Choose Drivetype").equals(DriveConfig.TankDrive)){


        }



	}
	
}
