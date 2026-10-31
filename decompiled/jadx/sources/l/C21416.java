package l;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: renamed from: l.᩸ۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8S0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21416 implements GLSurfaceView.Renderer, InterfaceC4482, InterfaceC15770 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15064 f68971;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final float[] f68972;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float[] f68973;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f68975;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20005 f68976;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float[] f68978;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f68979;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float[] f68977 = new float[16];

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final float[] f68980 = new float[16];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float[] f68974 = new float[16];

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final float[] f68970 = new float[16];

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        C20005.m46138(this.f68976, this.f68971.m35633());
    }

    @Override // l.InterfaceC15770
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo9387(float f, float[] fArr) {
        float[] fArr2 = this.f68978;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.f68979 = f2;
        Matrix.setRotateM(this.f68973, 0, -this.f68975, (float) Math.cos(f2), (float) Math.sin(this.f68979), 0.0f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m48537(PointF pointF) {
        float f = pointF.y;
        this.f68975 = f;
        Matrix.setRotateM(this.f68973, 0, -f, (float) Math.cos(this.f68979), (float) Math.sin(this.f68979), 0.0f);
        Matrix.setRotateM(this.f68972, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
    }

    public C21416(C20005 c20005, C15064 c15064) {
        this.f68976 = c20005;
        float[] fArr = new float[16];
        this.f68978 = fArr;
        float[] fArr2 = new float[16];
        this.f68973 = fArr2;
        float[] fArr3 = new float[16];
        this.f68972 = fArr3;
        this.f68971 = c15064;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f68979 = 3.1415927f;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.f68977, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.f68970, 0, this.f68978, 0, this.f68972, 0);
            Matrix.multiplyMM(this.f68974, 0, this.f68973, 0, this.f68970, 0);
        }
        Matrix.multiplyMM(this.f68980, 0, this.f68977, 0, this.f68974, 0);
        this.f68971.m35634(this.f68980);
    }
}
