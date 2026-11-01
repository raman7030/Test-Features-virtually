package p067l;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: renamed from: l.ۖۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8JK */
/* JADX INFO: loaded from: classes2.dex */
public final class C4617 implements SensorEventListener {

    /* JADX INFO: renamed from: ܳ */
    public boolean f10351;

    /* JADX INFO: renamed from: ܽ */
    public final Display f10352;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC17356[] f10354;

    /* JADX INFO: renamed from: ۧ */
    public final float[] f10350 = new float[16];

    /* JADX INFO: renamed from: ᩻ */
    public final float[] f10355 = new float[16];

    /* JADX INFO: renamed from: ܿ */
    public final float[] f10353 = new float[16];

    /* JADX INFO: renamed from: ֫ */
    public final float[] f10349 = new float[3];

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C4617(Display display, InterfaceC17356... interfaceC17356Arr) {
        this.f10352 = display;
        this.f10354 = interfaceC17356Arr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f10350;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f10352.getRotation();
        float[] fArr3 = this.f10355;
        if (rotation != 0) {
            int i2 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i2 = 130;
                    i = 1;
                }
            } else {
                i2 = 2;
                i = 129;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i2, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f10349;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z = this.f10351;
        float[] fArr5 = this.f10353;
        if (!z) {
            C10652.m24486(fArr5, fArr2);
            this.f10351 = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (int i3 = 0; i3 < 2; i3++) {
            this.f10354[i3].mo11429(f, fArr2);
        }
    }
}
