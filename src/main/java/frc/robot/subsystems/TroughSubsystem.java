package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.k_troughSpin;

public class TroughSubsystem extends SubsystemBase
{
    private Talon troughMotor;

    public TroughSubsystem() {
        troughMotor = new Talon(1);
        SmartDashboard.putBoolean("test trough spin button", false);
    }

    public void spinCommand() {
        troughMotor.set(k_troughSpin);
        SmartDashboard.putBoolean("test trough spin button", true);
    }

    public void stop() {
        troughMotor.set(0);
        SmartDashboard.putBoolean("test trough spin button", false);
    }

    @Override
    public void periodic() {}

    @Override
    public void simulationPeriodic() {}
}
