package p067l;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩷ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: I8LX */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC22005 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: ۫ */
    public static final int[] f69216 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: ۗ */
    public SurfaceTexture f69217;

    /* JADX INFO: renamed from: ۙ */
    public EGLSurface f69218;

    /* JADX INFO: renamed from: ۬ */
    public final int[] f69219 = new int[1];

    /* JADX INFO: renamed from: ᩶ */
    public final Handler f69220;

    /* JADX INFO: renamed from: ᩸ */
    public EGLContext f69221;

    /* JADX INFO: renamed from: ᩹ */
    public EGLDisplay f69222;

    public RunnableC22005(Handler handler) {
        this.f69220 = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ */
    public final void m49605() {
        this.f69220.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f69217;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f69219, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f69222;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f69222;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f69218;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f69222, this.f69218);
            }
            EGLContext eGLContext = this.f69221;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f69222, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f69222;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f69222);
            }
            this.f69222 = null;
            this.f69221 = null;
            this.f69218 = null;
            this.f69217 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final SurfaceTexture m49603() {
        SurfaceTexture surfaceTexture = this.f69217;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f69220.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f69217;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49604(int i) throws C4570 {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        C5911.m13289("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr = new int[2];
        C5911.m13289("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
        this.f69222 = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f69216, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z = zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        String str = C5792.f14228;
        C5911.m13289(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f69222, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        C5911.m13289("eglCreateContext failed", eGLContextEglCreateContext != null);
        this.f69221 = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = this.f69222;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            C5911.m13289("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        C5911.m13289("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        this.f69218 = eGLSurfaceEglCreatePbufferSurface;
        int[] iArr3 = this.f69219;
        GLES20.glGenTextures(1, iArr3, 0);
        C5911.m13287();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        this.f69217 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }
}
