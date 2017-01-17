
package org.usfirst.frc.team6239.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;


public class ShooterArm extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
	}
	
	public void Shoot4Forward() {
		Robot.robotmap.Solenoid2.set(DoubleSolenoid.Value.kReverse);
		Robot.robotmap.Solenoid3.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void Shoot2Forward() {
		Robot.robotmap.Solenoid2.set(DoubleSolenoid.Value.kReverse);

	}
			
}