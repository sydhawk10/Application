package org.firstinspires.ftc.teamcode;

import android.graphics.Canvas;

import org.firstinspires.ftc.robotcore.internal.camera.calibration.CameraCalibration;
import org.firstinspires.ftc.vision.VisionProcessor;
import org.opencv.core.Mat;
public class TeamPropProcessor implements VisionProcessor{

    React LEFT_RECTANGLE;
    React MIDDLE_RECTANGLE;
    React RIGHT_RECTANGLE;

    @Override
    public void init(int width, int height, CameraCalibration calibration) {
        LEFT_RECTANGLE = new Rect(
                new Point(x: 0, y: 0),
                new Point(x: 0.33 * width, height)

        );

        MIDDLE_RECTANGLE = new Rect(
                new Point(x: 0.33 * width, y: 0),
                new Point(x: 0.66 * width, height)

        );

        RIGHT_RECTANGLE = NEW
    }

    @Override
    public Object processFrame(Mat frame, long captureTimeNanos) {
        return null;
    }

    @Override
    public void init(int i, int i1, CameraCalibration cameraCalibration) {

    }
    @Override
    public void onDrawFrame(Canvas canvas, int i, int i1, float v, float v1, Object o) {

    }
}
