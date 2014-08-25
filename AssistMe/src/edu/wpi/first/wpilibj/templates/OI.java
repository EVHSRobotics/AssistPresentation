package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    public Joystick controller;
    
    public OI() {
        controller = new Joystick(RobotMap.XBOX_CONTROLLER1);
    }
    
    public Joystick getJoystick() {
        return controller;
    }
    
    //axes 
    public double getLeftX(){
        return controller.getRawAxis(1);
    }
    public double getLeftY(){
        return controller.getRawAxis(2);
    }
    public double getRightX(){
        return controller.getRawAxis(4);
    }
    public double getRightY(){
        return controller.getRawAxis(5);
    }
    public double getTriggers() {
        return controller.getRawAxis(3);
    }
    public double getDPad() {
        return controller.getRawAxis(6);
    }
    
    //buttons 
     public boolean getA(){
        return controller.getRawButton(1);
    }
    public boolean getB() {
        return controller.getRawButton(2);
    }
    public boolean getX() {
        return controller.getRawButton(3);
    }
    public boolean getY() {
        return controller.getRawButton(4);
    }
    public boolean getLB() {
        return controller.getRawButton(5);
    }
    public boolean getRB() {
        return controller.getRawButton(6);
    }
    public boolean getBack() {
        return controller.getRawButton(7);
    }
    public boolean getStart() {
        return controller.getRawButton(8);
    }
    public boolean getLeftStickPress() {
        return controller.getRawButton(9);
    }
    public boolean getRightStickPress() {
        return controller.getRawButton(10);
    }
    
}
