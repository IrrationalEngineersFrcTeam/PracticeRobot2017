
package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;
import org.usfirst.frc.team6239.robot.commands.DriveCommand;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSub extends Subsystem {
    
   public void DriveRobot(double Leftspeed, double Rightspeed) {
	   Robot.robotmap.LeftController1.set(Leftspeed);
	   Robot.robotmap.LeftController2.set(Leftspeed);
	   Robot.robotmap.RightController1.set(Rightspeed);
	   Robot.robotmap.RightController2.set(Rightspeed);
	   
   }

   

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveCommand());
    }
}

