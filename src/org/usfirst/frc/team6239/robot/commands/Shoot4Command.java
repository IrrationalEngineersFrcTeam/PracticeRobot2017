package org.usfirst.frc.team6239.robot.commands;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Shoot4Command extends Command {
	public Shoot4Command() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.shooter_arm);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		Robot.robotmap.Solenoid1.set(true);
		Robot.robotmap.Solenoid2.set(true);
		Robot.robotmap.Solenoid3.set(true);
		Robot.robotmap.Solenoid4.set(true);
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		Robot.robotmap.Solenoid1.set(false);
		Robot.robotmap.Solenoid2.set(false);
		Robot.robotmap.Solenoid3.set(false);
		Robot.robotmap.Solenoid4.set(false);
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}
	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}



