
package org.usfirst.frc.team6239.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
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
    public NetworkTable grip = NetworkTable.getTable("grip");
    public SmartDashboard smartDashboard;
	public SendableChooser<Enum> JoyType;
	public SendableChooser<Enum> DriveType;

	public static Robot _robot;

    
    
    
    public enum DriveConfig {
		Joysticks(2),
		Arcade(5),
		Tank(6),
		Gamepad(1);

		private final int value;

		DriveConfig(final int newValue){
			value = newValue;
		}
		public int getValue(){return  value;}
	}
    
    
	public void robotInit() {
    	if(_robot != this){
    		_robot = this;
		}




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

	public void teleopPeriodic(){
		Scheduler.getInstance().run();

		}












	private  DriveConfig _driveType;
	private  DriveConfig _joyType;
	public void setJoyConfig(DriveConfig Joytype){
		 this._joyType = Joytype;
	}
	public void setDriveConfig(DriveConfig DriveType){
		this._driveType = DriveType;
	}
	public  DriveConfig getDriveType(){
		return this._driveType;
	}
	public  DriveConfig getJoyType(){
		return this._joyType;
	}

	public void DetirmineDrive(){
		setJoyConfig((DriveConfig) JoyType.getSelected() );
		setDriveConfig((DriveConfig) DriveType.getSelected());

	}















//    public void GetAccelerometerData() {
//
//
//
//
//    	boolean print_flag = false;
//
//    	double next_x = accel.getX();
//    	double next_y = accel.getY();
//
//    	if (next_x != currentAngleX)
//    	{
//    		currentAngleX = next_x ;
//    		print_flag = true;
//    	}
//
//    	if (next_y != currentAngleY)
//    	{
//    		currentAngleY = next_y ;
//    		print_flag = true;
//    	}
//
//    	if (print_flag)
//    	{
//    		System.out.println("accel: X = " + next_x + ", Y = " + next_y);
//
//    	}
//
//
//
//    }
}
