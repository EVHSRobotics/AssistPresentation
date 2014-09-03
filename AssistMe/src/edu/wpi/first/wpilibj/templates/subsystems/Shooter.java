/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.ShootCommand;

/**
 *
 * @author kevin
 */
public class Shooter extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Jaguar shootMLeft;
    public Jaguar shootMRight;
    public Jaguar triggerM;
    
    public Shooter() {
        shootMLeft = new Jaguar(RobotMap.SHOOT_MOTOR_LEFT); 
        shootMRight = new Jaguar(RobotMap.SHOOT_MOTOR_RIGHT); //flip wires
        triggerM = new Jaguar(RobotMap.TRIGGER_MOTOR);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new ShootCommand());
    }
    
    public void shoot(double speed) {
        shootMLeft.set(speed);
        shootMRight.set(speed); //cause wires flipped
    }
    
    public void trigger(double speed) {
        triggerM.set(speed);
    }
}