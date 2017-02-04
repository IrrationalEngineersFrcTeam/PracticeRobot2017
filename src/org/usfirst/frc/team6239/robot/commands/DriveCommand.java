
package org.usfirst.frc.team6239.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6239.robot.Robot;

/**
 *
 */
public class DriveCommand extends Command {

    public DriveCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.DRIVE_SUB);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

        double LeftSpeed;
        double RightSpeed;



        if(Robot._robot.getJoyType() == Robot.DriveConfig.Joysticks){

            LeftSpeed =  Robot.oi.joystickList.get("LeftJoy").getRawAxis(Robot._robot.oi.Joystick_Y_Axis_Left);

            if(Robot._robot.getDriveType()== Robot.DriveConfig.Arcade){
                RightSpeed =  Robot.oi.joystickList.get("RightJoy").getRawAxis(Robot._robot.oi.Joystick_X_Axis_Right); //<---This need changed depending on x of gamepad
            }else {
            RightSpeed =  Robot.oi.joystickList.get("RightJoy").getRawAxis(Robot._robot.oi.Joystick_Y_Axis_Right); //<--- Or this needs to be changed figure out which
            }
            Robot.DRIVE_SUB.DriveRobot(LeftSpeed, RightSpeed);
        }else {

            LeftSpeed = Robot.oi.joystickList.get("Gamepad").getRawAxis(Robot._robot.oi.Gamepad_Y_Axis_Left);

            if(Robot._robot.getDriveType()== Robot.DriveConfig.Arcade){
            RightSpeed = Robot._robot.oi.joystickList.get("Gamepad").getRawAxis(Robot._robot.oi.Gamepad_X_Axis_Right); //<--- Same with this
            }else {
                RightSpeed = Robot._robot.oi.joystickList.get("Gamepad").getRawAxis(Robot._robot.oi.Gamepad_Y_Axis_Right);  // <--- and this
            }
            Robot.DRIVE_SUB.DriveRobot(LeftSpeed,RightSpeed);


        }
    	


    	  

    		
    		
    	}
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {


        return DriverStation.getInstance().isDisabled();   //just an added safety measure



    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
