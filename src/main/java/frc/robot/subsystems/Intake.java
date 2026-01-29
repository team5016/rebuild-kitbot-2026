package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;


public class Intake extends SubsystemBase{
 private final TalonSRX lower = new TalonSRX(3);
 private final TalonSRX upper = new TalonSRX(6);

 public void spin(double speed){
    lower.set(ControlMode.PercentOutput, speed);
    upper.set(ControlMode.PercentOutput, speed*-1);
 }
}
