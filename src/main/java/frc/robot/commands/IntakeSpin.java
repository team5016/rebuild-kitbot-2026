package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Intake;

public class IntakeSpin extends Command{
    @SuppressWarnings("PMD.UnusedPrivateField")
    private final Intake intake;

    public IntakeSpin(Intake I) {
        intake = I;
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(I);
    }

    @Override
    public void execute() {
        intake.spin(.7);
    }

    @Override
    public void end(boolean interrupted) {
        intake.spin(0);
    }

}
