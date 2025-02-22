package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.POVButton;
import frc.robot.utils.PS4;

public class Buttons {

  //////////////////////////////////////////////////////////////////////////////
  // Driver
  Joystick driverControl = new Joystick(0);
  int swerveForward = PS4.LEFT_STICK_Y;
  int swerveStrafe = PS4.LEFT_STICK_X;
  int swerveRotation = PS4.RIGHT_STICK_X;
  //JoystickButton driverEnableClimber = new JoystickButton(driverControl, PS4.PS4);
  JoystickButton resetOdometry = new JoystickButton(driverControl, PS4.OPTIONS);
  //JoystickButton slowDrive = new JoystickButton(driverControl, PS4.R2);

  int lt = 2;
  int rt = 3;
  Button slowDrive = new Button(() -> driverControl.getRawAxis(lt) > 0.1);

  //////////////////////////////////////////////////////////////////////////////
  //Operator
  Joystick operatorControl = new Joystick(1);

  Button lowShootNew = new Button(() -> operatorControl.getRawAxis(rt) > 0.1); //rt
  Button feedInFireNew = new Button(() -> operatorControl.getRawAxis(lt) > 0.1); //lt

  JoystickButton hubSpinUp = new JoystickButton(operatorControl, PS4.R1);

  //JoystickButton lowShoot = new JoystickButton(operatorControl, PS4.R2);
  JoystickButton toggleElevator = new JoystickButton(operatorControl, PS4.L1);
  JoystickButton feedInFire = new JoystickButton(operatorControl, PS4.L2);
  JoystickButton autoShoot = new JoystickButton(operatorControl, PS4.SQUARE);
  JoystickButton autoShootOne = new JoystickButton(operatorControl, PS4.R_STICK);

  JoystickButton toggleIntake = new JoystickButton(operatorControl, PS4.CIRCLE);
  JoystickButton intake = new JoystickButton(operatorControl, PS4.TRIANGLE);
  JoystickButton outtake = new JoystickButton(operatorControl, PS4.CROSS);

  //JoystickButton operatorEnableClimber = new JoystickButton(operatorControl, PS4.PS4);
  //JoystickButton climbAuto = new JoystickButton(operatorControl, PS4.TRACKPAD);
  //JoystickButton resetClimbStuff = new JoystickButton(operatorControl, PS4.OPTIONS);

  JoystickButton autoClimbStopLeft = new JoystickButton(operatorControl, PS4.L2);
  JoystickButton autoClimbStopRight = new JoystickButton(operatorControl, PS4.R2);

  JoystickButton rgb = new JoystickButton(operatorControl, PS4.SHARE);

  POVButton elevatorRetract = new POVButton(operatorControl, 180); // DPAD down
  POVButton elevatorExtend = new POVButton(operatorControl, 0); // DPAD up
}
