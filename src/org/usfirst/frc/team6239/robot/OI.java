package org.usfirst.frc.team6239.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

import java.util.HashMap;
import java.util.Map;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public int Gamepad_Y_Axis_Right =5;
    public int Gamepad_Y_Axis_Left = 1;
    public int Gamepad_X_Axis_Right = 3; //<---- check this
    public int Joystick_Y_Axis_Left=1;
    public int Joystick_Y_Axis_Right =1;
    public int Joystick_X_Axis_Right =2; //<-- check this.
	
   private int JoyTotal = 3;
	Button shoot2;
	Button shoot4;
	public Map<String,Joystick> joystickList;
	public OI() {
		
        joystickList = getJoystickList();




		//shoot2 = new JoystickButton(gamepad, 0);
		//shoot4 = new JoystickButton(gamepad, 1);
	}

    private Map<String,Joystick> getJoystickList(){

        Map<String,Joystick> joysticks = new HashMap<String,Joystick>();

        for (int i=0;i<JoyTotal-1;i++){
            if (DriverStation.getInstance().getJoystickName(i).contains("gamepad")){  // need to change name
                joysticks.put("Gamepad",new Joystick(i));
            }
            if(DriverStation.getInstance().getJoystickName(i).contains("Axis") && !joysticks.containsKey("LeftJoy")){ // check name
                joysticks.put("LeftJoy",new Joystick(i));
            }else if (DriverStation.getInstance().getJoystickName(i).contains("Axis")){ // check name
                joysticks.put("RightJoy", new Joystick(i));
            }



        }

        return joysticks;



    }
}

