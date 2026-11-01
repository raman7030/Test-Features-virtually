package p067l;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: renamed from: l.᩸ۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8S0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22722 implements GLSurfaceView.Renderer, InterfaceC6628, InterfaceC17356 {

    /* JADX INFO: renamed from: ۙ */
    public final C16685 f71669;

    /* JADX INFO: renamed from: ۛ */
    public final float[] f71670;

    /* JADX INFO: renamed from: ۤ */
    public final float[] f71671;

    /* JADX INFO: renamed from: ۫ */
    public float f71673;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C21381 f71674;

    /* JADX INFO: renamed from: ᩸ */
    public final float[] f71676;

    /* JADX INFO: renamed from: ᩹ */
    public float f71677;

    /* JADX INFO: renamed from: ᩶ */
    public final float[] f71675 = new float[16];

    /* JADX INFO: renamed from: ᩺ */
    public final float[] f71678 = new float[16];

    /* JADX INFO: renamed from: ۨ */
    public final float[] f71672 = new float[16];

    /* JADX INFO: renamed from: ۗ */
    public final float[] f71668 = new float[16];

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        C21381.m48453(this.f71674, this.f71669.m37791());
    }

    @Override // p067l.InterfaceC17356
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo11429(float f, float[] fArr) {
        float[] fArr2 = this.f71676;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.f71677 = f2;
        Matrix.setRotateM(this.f71671, 0, -this.f71673, (float) Math.cos(f2), (float) Math.sin(this.f71677), 0.0f);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m50873(PointF pointF) {
        float f = pointF.y;
        this.f71673 = f;
        Matrix.setRotateM(this.f71671, 0, -f, (float) Math.cos(this.f71677), (float) Math.sin(this.f71677), 0.0f);
        Matrix.setRotateM(this.f71670, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
    }

    public C22722(C21381 c21381, C16685 c16685) {
        this.f71674 = c21381;
        float[] fArr = new float[16];
        this.f71676 = fArr;
        float[] fArr2 = new float[16];
        this.f71671 = fArr2;
        float[] fArr3 = new float[16];
        this.f71670 = fArr3;
        this.f71669 = c16685;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f71677 = 3.1415927f;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.f71675, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.f71668, 0, this.f71676, 0, this.f71670, 0);
            Matrix.multiplyMM(this.f71672, 0, this.f71671, 0, this.f71668, 0);
        }
        Matrix.multiplyMM(this.f71678, 0, this.f71675, 0, this.f71672, 0);
        this.f71669.m37792(this.f71678);
    }
}
