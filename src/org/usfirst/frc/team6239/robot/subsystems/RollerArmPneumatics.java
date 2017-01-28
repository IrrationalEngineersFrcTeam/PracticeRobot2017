
package org.usfirst.frc.team6239.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;


public class RollerArmPneumatics extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
	}
	
	public void RetractRlrArm() {
		Robot.robotmap.Solenoid1.set(DoubleSolenoid.Value.kReverse);
		Robot.robotmap.Solenoid4.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void ExtendRlrArm() {
		Robot.robotmap.Solenoid1.set(DoubleSolenoid.Value.kForward);
		Robot.robotmap.Solenoid4.set(DoubleSolenoid.Value.kForward);
		
	}
			
}