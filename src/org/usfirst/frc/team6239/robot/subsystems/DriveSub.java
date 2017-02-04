package org.usfirst.frc.team6239.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6239.robot.Robot;
import org.usfirst.frc.team6239.robot.commands.DriveCommand;

/**
 *
 */
public class DriveSub extends Subsystem {
	

	
   public void DriveRobot(double Leftspeed, double Rightspeed) {

       if(Robot._robot.getDriveType()== Robot.DriveConfig.Arcade){
           arcade(Leftspeed,Rightspeed);
       }else {
           tank(Leftspeed,Rightspeed);      //should deafult to tank
       }

	   
   }

   public void arcade(double Leftspeed,double Rightspeed){

       if(Rightspeed > 0.0){
           tank((Leftspeed+Rightspeed),(-(Leftspeed+Rightspeed)));          //Using the tank method as to reduce amount of code.
       }else {

           if (Rightspeed < 0.0) {                  //<--- is this if statement needed??
               tank((Rightspeed-Leftspeed),(Leftspeed+Math.abs(Rightspeed)));
           } else {
               tank(Leftspeed,Leftspeed);
           }


       }

   }

   public void tank(double Leftspeed, double Rightspeed){
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
 

