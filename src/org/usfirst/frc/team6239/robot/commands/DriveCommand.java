
package org.usfirst.frc.team6239.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6239.robot.Robot;

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
    	
    	double Leftspeed = Robot.oi.gamepad.getRawAxis(1);
    	double Rightspeed = Robot.oi.gamepad.getRawAxis(5);
    	
    	Robot.DRIVE_SUB.DriveRobot(Leftspeed, Rightspeed);
    	System.out.println(Leftspeed + " " + Rightspeed);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}