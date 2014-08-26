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
    public static class Id {

        public static class Axis {

            public static final int LEFT_X = 0x11;
            public static final int LEFT_Y = 0x12;
            public static final int RIGHT_X = 0x21;
            public static final int RIGHT_Y = 0x22;
            public static final int TRIGGERS = 0x31;
            public static final int D_PAD = 0x41;
        }

        public static class Button {

            public static final int A = 0x51;
            public static final int B = 0x52;
            public static final int X = 0x53;
            public static final int Y = 0x54;
            public static final int LB = 0x61;
            public static final int RB = 0x62;
            public static final int BACK = 0x71;
            public static final int START = 0x72;
            public static final int LEFT_STICK = 0x81;
            public static final int RIGHT_STICK = 0x82;
        }
    }
    public Joystick controller;

    public OI() {
        controller = new Joystick(RobotMap.XBOX_CONTROLLER1);
    }

    public Joystick getJoystick() {
        return controller;
    }

    //axes 
    public double getAxis(int id) {
        double value;
        switch (id) {
            case OI.Id.Axis.LEFT_X:
                value = controller.getRawAxis(1);
                break;
            case OI.Id.Axis.LEFT_Y:
                value = controller.getRawAxis(2);
                break;
            case OI.Id.Axis.RIGHT_X:
                value = controller.getRawAxis(4);
                break;
            case OI.Id.Axis.RIGHT_Y:
                value = controller.getRawAxis(5);
                break;
            case OI.Id.Axis.TRIGGERS:
                value = controller.getRawAxis(3);
                break;
            case OI.Id.Axis.D_PAD:
                value = controller.getRawAxis(6);
                break;
            default:
                value = 0.0;
                break;
        }
        return value;
    }
    //buttons 

    public boolean getButton(int id) {
        boolean value;
        switch (id) {
            case OI.Id.Button.A:
                value = controller.getRawButton(1);
                break;
            case OI.Id.Button.B:
                value = controller.getRawButton(2);
                break;
            case OI.Id.Button.X:
                value = controller.getRawButton(3);
                break;
            case OI.Id.Button.Y:
                value = controller.getRawButton(4);
                break;
            case OI.Id.Button.LB:
                value = controller.getRawButton(5);
                break;
            case OI.Id.Button.RB:
                value = controller.getRawButton(6);
                break;
            case OI.Id.Button.BACK:
                value = controller.getRawButton(7);
                break;
            case OI.Id.Button.START:
                value = controller.getRawButton(8);
                break;
            case OI.Id.Button.LEFT_STICK:
                value = controller.getRawButton(9);
                break;
            case OI.Id.Button.RIGHT_STICK:
                value = controller.getRawButton(10);
                break;
            default:
                value = false;
                break;
        }
        return value;
    }

}
