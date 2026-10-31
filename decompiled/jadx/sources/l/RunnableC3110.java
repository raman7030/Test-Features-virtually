package l;

import android.opengl.Matrix;

/* JADX INFO: renamed from: l.ۗ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86WH */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3110 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5932 f9721;

    public RunnableC3110(C5932 c5932) {
        this.f9721 = c5932;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5932 c5932 = this.f9721;
        float[] fArr = c5932.f18182;
        if (c5932.f18179 && c5932.f18197) {
            c5932.f18190 = System.nanoTime() - c5932.f18205;
            double d = (c5932.f18190 * 1.0E-9d) / 30.0d;
            if (d >= 4.0d) {
                c5932.f18178 = true;
                c5932.m16648();
                System.arraycopy(c5932.f18193, 0, fArr, 0, 16);
                ((RunnableC7968) c5932.f18185).run();
                return;
            }
            float f = (float) ((d % 1.0d) * 360.0d);
            float fSin = (float) Math.sin((d % 4.0d) * 1.5707963267948966d);
            Matrix.setRotateM(c5932.f18188, 0, f, 0.0f, 1.0f, 0.0f);
            Matrix.multiplyMM(c5932.f18191, 0, c5932.f18188, 0, c5932.f18193, 0);
            Matrix.setRotateM(c5932.f18188, 0, 20.0f * fSin, 1.0f, 0.0f, 0.0f);
            Matrix.multiplyMM(fArr, 0, c5932.f18188, 0, c5932.f18191, 0);
            Matrix.setRotateM(c5932.f18188, 0, fSin * 10.0f, 0.0f, 0.0f, 1.0f);
            Matrix.multiplyMM(c5932.f18191, 0, c5932.f18188, 0, fArr, 0);
            System.arraycopy(c5932.f18191, 0, fArr, 0, 16);
            ((RunnableC7968) c5932.f18185).run();
            c5932.f18192.postDelayed(this, 34L);
        }
    }
}
