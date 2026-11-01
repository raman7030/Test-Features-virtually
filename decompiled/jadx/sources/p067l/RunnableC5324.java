package p067l;

import android.opengl.Matrix;

/* JADX INFO: renamed from: l.ۗ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86WH */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5324 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C8006 f12524;

    public RunnableC5324(C8006 c8006) {
        this.f12524 = c8006;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8006 c8006 = this.f12524;
        float[] fArr = c8006.f21036;
        if (c8006.f21033 && c8006.f21051) {
            c8006.f21044 = System.nanoTime() - c8006.f21059;
            double d = (c8006.f21044 * 1.0E-9d) / 30.0d;
            if (d >= 4.0d) {
                c8006.f21032 = true;
                c8006.m18574();
                System.arraycopy(c8006.f21047, 0, fArr, 0, 16);
                ((RunnableC9941) c8006.f21039).run();
                return;
            }
            float f = (float) ((d % 1.0d) * 360.0d);
            float fSin = (float) Math.sin((d % 4.0d) * 1.5707963267948966d);
            Matrix.setRotateM(c8006.f21042, 0, f, 0.0f, 1.0f, 0.0f);
            Matrix.multiplyMM(c8006.f21045, 0, c8006.f21042, 0, c8006.f21047, 0);
            Matrix.setRotateM(c8006.f21042, 0, 20.0f * fSin, 1.0f, 0.0f, 0.0f);
            Matrix.multiplyMM(fArr, 0, c8006.f21042, 0, c8006.f21045, 0);
            Matrix.setRotateM(c8006.f21042, 0, fSin * 10.0f, 0.0f, 0.0f, 1.0f);
            Matrix.multiplyMM(c8006.f21045, 0, c8006.f21042, 0, fArr, 0);
            System.arraycopy(c8006.f21045, 0, fArr, 0, 16);
            ((RunnableC9941) c8006.f21039).run();
            c8006.f21046.postDelayed(this, 34L);
        }
    }
}
