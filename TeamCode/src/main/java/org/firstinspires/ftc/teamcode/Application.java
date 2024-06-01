package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Servo;


public class Application extends LinearOpMode {
    DcMotorEx LB, LF, RB, RF;
    Servo flag;
    @Override
    public void runOpMode() throws InterruptedException {
        LB = hardwareMap.get(DcMotorEx.class, "backLeft");
        RB = hardwareMap.get(DcMotorEx.class, "backRight");
        LF = hardwareMap.get(DcMotorEx.class, "frontLeft");
        RF = hardwareMap.get(DcMotorEx.class, "frontRight");
        flag = hardwareMap.get(Servo.class, "-");

        LB.setDirection(DcMotorEx.Direction.REVERSE);
        LF.setDirection(DcMotorEx.Direction.REVERSE);

        while(opModeIsActive()) {

            //forward 500 ticks
            LB.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            LF.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            RB.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            RF.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);

            LB.setTargetPosition(1000);
            LF.setTargetPosition(1000);
            RB.setTargetPosition(1000);
            RF.setTargetPosition(1000);

            LB.setPower(0.5);
            LF.setPower(0.5);
            RB.setPower(0.5);
            RF.setPower(0.5);

            LB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            LF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            RB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            RF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

            while(LB.getCurrentPosition() == LB.setTargetPosition() || RB.getCurrentPosition() == RB.setTargetPosition() || LF.getCurrentPosition() == LF.setTargetPosition() || RF.getCurrentPosition() == RF.setTargetPosition()) {

            }

            LB.setPower(0);
            LF.setPower(0);
            RB.setPower(0);
            RF.setPower(0);


            //Move right 250 ticks

            LB.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            LF.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            RB.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            RF.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);

            LB.setTargetPosition(250);
            LF.setTargetPosition(-250);
            RB.setTargetPosition(-250);
            RF.setTargetPosition(250);

            LB.setPower(0.5);
            LF.setPower(0.5);
            RB.setPower(0.5);
            RF.setPower(0.5);

            LB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            LF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            RB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            RF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

            while(LB.getCurrentPosition() == LB.setTargetPosition() || RB.getCurrentPosition() == RB.setTargetPosition() || LF.getCurrentPosition() == LF.setTargetPosition() || RF.getCurrentPosition() == RF.setTargetPosition()) {

            }

            LB.setPower(0);
            LF.setPower(0);
            RB.setPower(0);
            RF.setPower(0);


            //forward 500 ticks
            LB.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            LF.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            RB.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            RF.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);

            LB.setTargetPosition(1000);
            LF.setTargetPosition(1000);
            RB.setTargetPosition(1000);
            RF.setTargetPosition(1000);

            LB.setPower(0.5);
            LF.setPower(0.5);
            RB.setPower(0.5);
            RF.setPower(0.5);

            LB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            LF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            RB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            RF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

            while(LB.getCurrentPosition() == LB.setTargetPosition() || RB.getCurrentPosition() == RB.setTargetPosition() || LF.getCurrentPosition() == LF.setTargetPosition() || RF.getCurrentPosition() == RF.setTargetPosition()) {

            }

            LB.setPower(0);
            LF.setPower(0);
            RB.setPower(0);
            RF.setPower(0);


            //Move LEFT 250 ticks

            LB.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            LF.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            RB.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            RF.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);

            LB.setTargetPosition(-250);
            LF.setTargetPosition(250);
            RB.setTargetPosition(250);
            RF.setTargetPosition(-250);

            LB.setPower(0.5);
            LF.setPower(0.5);
            RB.setPower(0.5);
            RF.setPower(0.5);

            LB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            LF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            RB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            RF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

            while(LB.getCurrentPosition() == LB.setTargetPosition() || RB.getCurrentPosition() == RB.setTargetPosition() || LF.getCurrentPosition() == LF.setTargetPosition() || RF.getCurrentPosition() == RF.setTargetPosition()) {

            }

            LB.setPower(0);
            LF.setPower(0);
            RB.setPower(0);
            RF.setPower(0);


            //Backward 500 ticks
            LB.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            LF.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            RB.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            RF.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);

            LB.setTargetPosition(-1000);
            LF.setTargetPosition(-1000);
            RB.setTargetPosition(-1000);
            RF.setTargetPosition(-1000);

            LB.setPower(0.5);
            LF.setPower(0.5);
            RB.setPower(0.5);
            RF.setPower(0.5);

            LB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            LF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            RB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            RF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

            while(LB.getCurrentPosition() == LB.setTargetPosition() || RB.getCurrentPosition() == RB.setTargetPosition() || LF.getCurrentPosition() == LF.setTargetPosition() || RF.getCurrentPosition() == RF.setTargetPosition()) {

            }

            LB.setPower(0);
            LF.setPower(0);
            RB.setPower(0);
            RF.setPower(0);


            //Backward2 500 ticks
            LB.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            LF.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            RB.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            RF.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);

            LB.setTargetPosition(-1000);
            LF.setTargetPosition(-1000);
            RB.setTargetPosition(-1000);
            RF.setTargetPosition(-1000);

            LB.setPower(0.5);
            LF.setPower(0.5);
            RB.setPower(0.5);
            RF.setPower(0.5);

            LB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            LF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            RB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            RF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

            while(LB.getCurrentPosition() == LB.setTargetPosition() || RB.getCurrentPosition() == RB.setTargetPosition() || LF.getCurrentPosition() == LF.setTargetPosition() || RF.getCurrentPosition() == RF.setTargetPosition()) {

            }

            LB.setPower(0);
            LF.setPower(0);
            RB.setPower(0);
            RF.setPower(0);


            //Move right 250 ticks

            LB.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            LF.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            RB.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
            RF.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);

            LB.setTargetPosition(250);
            LF.setTargetPosition(-250);
            RB.setTargetPosition(-250);
            RF.setTargetPosition(250);

            LB.setPower(0.5);
            LF.setPower(0.5);
            RB.setPower(0.5);
            RF.setPower(0.5);

            LB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            LF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            RB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            RF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

            while(LB.getCurrentPosition() == LB.setTargetPosition() || RB.getCurrentPosition() == RB.setTargetPosition() || LF.getCurrentPosition() == LF.setTargetPosition() || RF.getCurrentPosition() == RF.setTargetPosition()) {

            }

            LB.setPower(0);
            LF.setPower(0);
            RB.setPower(0);
            RF.setPower(0);


        }

    }
}





