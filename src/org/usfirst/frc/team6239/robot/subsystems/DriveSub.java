package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;
import org.usfirst.frc.team6239.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSub extends Subsystem {
	

	
   public void DriveRobot(double Leftspeed, double Rightspeed) {
	
	   if(joystick = true){
		   
		   if(arcade = true){
		   
			   // ---- Arcade Drive ---- \\
			   if(Rightspeed > 0.0){
				 
				   Robot.robotmap.LeftController1.set(Leftspeed + Rightspeed);
				   Robot.robotmap.LeftController2.set(Leftspeed + Rightspeed);
				   Robot.robotmap.RightController1.set(-(Leftspeed +Rightspeed));
				   Robot.robotmap.RightController2.set(-(Leftspeed + Rightspeed));
			   
			   }else{
			   
			   if(Rightspeed < 0.0){
				
				   Robot.robotmap.LeftController1.set(Rightspeed - Leftspeed);
				   Robot.robotmap.LeftController2.set(Rightspeed - Leftspeed);
				   Robot.robotmap.RightController1.set(Leftspeed + Math.abs(Rightspeed));
				   Robot.robotmap.RightController2.set(Leftspeed + Math.abs(Rightspeed)); 
				   
			   }else{
			   
			   Robot.robotmap.LeftController1.set(Leftspeed);
			   Robot.robotmap.LeftController2.set(Leftspeed);
			   Robot.robotmap.RightController1.set(Leftspeed);
			   Robot.robotmap.RightController2.set(Leftspeed);
			   
			   }
			 }
		     
		   }else{
		   
			  // ---- Tank Drive ---- \\
		   Robot.robotmap.LeftController1.set(Leftspeed);
		   Robot.robotmap.LeftController2.set(Leftspeed);
		   Robot.robotmap.RightController1.set(Rightspeed);
		   Robot.robotmap.RightController2.set(Rightspeed); 
			   
		   }
			   
   }else{
		   
		    if(arcade = true){
		   
		    	// ---- Arcade Drive ---- \\
		 	   if(Rightspeed > 0.0){
		 		 
		 		   Robot.robotmap.LeftController1.set(Leftspeed + Rightspeed);
		 		   Robot.robotmap.LeftController2.set(Leftspeed + Rightspeed);
		 		   Robot.robotmap.RightController1.set(-(Leftspeed + Rightspeed));
		 		   Robot.robotmap.RightController2.set(-(Leftspeed + Rightspeed));
		 	   
		 	   }else{
		 	   
		 	   if(Rightspeed < 0.0){
		 		
		 		   Robot.robotmap.LeftController1.set(Rightspeed - Leftspeed);
		 		   Robot.robotmap.LeftController2.set(Rightspeed - Leftspeed);
		 		   Robot.robotmap.RightController1.set(Leftspeed + Math.abs(Rightspeed));
		 		   Robot.robotmap.RightController2.set(Leftspeed + Math.abs(Rightspeed)); 
		 		   
		 	   }else{
		 	   
		 	   Robot.robotmap.LeftController1.set(Leftspeed);
		 	   Robot.robotmap.LeftController2.set(Leftspeed);
		 	   Robot.robotmap.RightController1.set(Leftspeed);
		 	   Robot.robotmap.RightController2.set(Leftspeed);
		 	   
		 	   }
		 	 }
		  
   }else{   
	
		   // ---- Tank Drive ---- \\
		   Robot.robotmap.LeftController1.set(Leftspeed);
		   Robot.robotmap.LeftController2.set(Leftspeed);
		   Robot.robotmap.RightController1.set(Rightspeed);
		   Robot.robotmap.RightController2.set(Rightspeed);
	   System.out.println("Working");
	   }
	   
	   
		
   }
	   
   }
   
   
   

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveCommand());
    }
}   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  // Test Stuff \\
 
	   
	 //  // ---- Tank Drive ---- \\
	 //  Robot.robotmap.LeftController1.set(Leftspeed);
	 //  Robot.robotmap.LeftController2.set(Leftspeed);
	 //  Robot.robotmap.RightController1.set(Rightspeed);
	 //  Robot.robotmap.RightController2.set(Rightspeed);
	   
	 //  // ---- Arcade Drive ---- \\
	 //  if(Rightspeed > 0.0){
		 
	//	   Robot.robotmap.LeftController1.set(Leftspeed + Rightspeed);
	//	   Robot.robotmap.LeftController2.set(Leftspeed + Rightspeed);
	//	   Robot.robotmap.RightController1.set(-(Leftspeed +Rightspeed));
	//	   Robot.robotmap.RightController2.set(-(Leftspeed + Rightspeed));
	   
	  // }else{
	   
	 //  if(Rightspeed < 0.0){
		
		//   Robot.robotmap.LeftController1.set(Rightspeed - Leftspeed);
		 //  Robot.robotmap.LeftController2.set(Rightspeed - Leftspeed);
		 //  Robot.robotmap.RightController1.set(Leftspeed + Math.abs(Rightspeed));
		  // Robot.robotmap.RightController2.set(Leftspeed + Math.abs(Rightspeed)); 
		   
	   //}else{
	   
	   //Robot.robotmap.LeftController1.set(Leftspeed);
	  // Robot.robotmap.LeftController2.set(Leftspeed);
	   //Robot.robotmap.RightController1.set(Leftspeed);
	   //Robot.robotmap.RightController2.set(Leftspeed);
	   
	  // }
   //}
 

