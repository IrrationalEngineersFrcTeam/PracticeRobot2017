package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.commands.Shoot2Command;

import edu.wpi.first.wpilibj.command.Subsystem;


public class ShooterArm extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new Shoot2Command());
	}
}
