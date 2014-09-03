/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.OI;

/**
 *
 * @author kevin
 */
public class ShootCommand extends CommandBase {

    public ShootCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //shoot motors
        if (oi.getButton(OI.Id.Button.RB)) {
            shooter.shoot(1);
        } else if (oi.getButton(OI.Id.Button.LB)) {
            shooter.shoot(-1);
        } else {
            shooter.shoot(0);
        }
        
        //trigger 
        if(oi.getButton(OI.Id.Button.A)) {
            shooter.trigger(1);
        } else if(oi.getButton(OI.Id.Button.B)) {
            shooter.trigger(-1);
        } else {
            shooter.trigger(0);
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        shooter.shoot(0);
        shooter.trigger(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        shooter.shoot(0);
        shooter.trigger(0);
    }
}