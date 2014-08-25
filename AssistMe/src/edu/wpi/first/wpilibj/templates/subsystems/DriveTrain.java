/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.DriveCommand;

/**
 *
 * @author kevin
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Victor dMFrontLeft;
    public Victor dMFrontRight;
    public Victor dMBackLeft;
    public Victor dMBackRight;
    
    public DriveTrain() {
        dMFrontLeft = new Victor(RobotMap.DRIVE_MOTOR_FRONT_LEFT); 
        dMFrontRight = new Victor(RobotMap.DRIVE_MOTOR_FRONT_RIGHT);
        dMBackLeft = new Victor(RobotMap.DRIVE_MOTOR_BACK_LEFT);
        dMBackRight = new Victor(RobotMap.DRIVE_MOTOR_BACK_RIGHT);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new DriveCommand());
    }
}