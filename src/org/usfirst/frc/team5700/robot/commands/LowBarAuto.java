package org.usfirst.frc.team5700.robot.commands;

import org.usfirst.frc.team5700.robot.Robot;
import org.usfirst.frc.team5700.robot.commands.TimedDrive;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Drives the Robot forward for 4 seconds at 0.5 speed
 * Works for crossing the Low Bar during auto
 */
public class LowBarAuto extends CommandGroup {
	
	
	private final int DRIVE_TIME = 4;
	
    public  LowBarAuto() {
    	
    	requires(Robot.drivetrain);
    	addSequential(new TimedDrive(DRIVE_TIME));
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
