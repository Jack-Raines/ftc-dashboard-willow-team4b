package org.firstinspires.ftc.teamcode.PrimitveTypes;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

    @TeleOp()
public class GamepadsJR extends OpMode {
@Override
public void init() {
    }

    @Override
public void loop(){
        telemetry.addData("left stick x", gamepad1.left_stick_x);
        telemetry.addData("Left Stick y", gamepad1.left_stick_y);
        telemetry.addData("A button", gamepad1.a);
        telemetry.addData("B button", gamepad1.b);
        telemetry.addData("right stick", gamepad1.right_stick_x);
        FtcDashboard dashboard = FtcDashboard.getInstance();
        telemetry = new MultipleTelemetry(telemetry, dashboard.getTelemetry());
        if ("A button", gamepad1.a) notify();
    }
}
