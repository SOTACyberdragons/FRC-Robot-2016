package org.usfirst.frc.team5700.robot.commands;

import org.usfirst.frc.team5700.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TimedDrive extends Command {
	
	double driveTime;

	/**
	 * This command drives the robot forward at 0.5 speed for the given number of seconds.
	 * @param time time in seconds that the drivetrain will drive forward
	 */
    public TimedDrive(double time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetrain);
    	
    	driveTime = time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.drive(0.5, 0.5);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
		return timeSinceInitialized() > driveTime;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
