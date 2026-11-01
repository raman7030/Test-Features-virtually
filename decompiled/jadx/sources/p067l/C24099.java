package p067l;

import android.content.res.AssetManager;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.Matrix;
import android.view.Surface;

/* JADX INFO: renamed from: l.᩺۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6WH */
/* JADX INFO: loaded from: classes.dex */
public final class C24099 extends Thread {

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f76496;

    /* JADX INFO: renamed from: ۗ */
    public volatile boolean f76497;

    /* JADX INFO: renamed from: ۙ */
    public boolean f76498;

    /* JADX INFO: renamed from: ۛ */
    public boolean f76499;

    /* JADX INFO: renamed from: ۟ */
    public final boolean f76500;

    /* JADX INFO: renamed from: ۤ */
    public boolean f76501;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f76502;

    /* JADX INFO: renamed from: ۨ */
    public final float[] f76503;

    /* JADX INFO: renamed from: ۫ */
    public final C22759 f76504;

    /* JADX INFO: renamed from: ۬ */
    public int f76505;

    /* JADX INFO: renamed from: ܰ */
    public final int f76506;

    /* JADX INFO: renamed from: ᩶ */
    public float f76507;

    /* JADX INFO: renamed from: ᩸ */
    public final AssetManager f76508;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f76509;

    /* JADX INFO: renamed from: ᩺ */
    public final SurfaceTexture f76510;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m53352() {
        if (this.f76499) {
            return;
        }
        this.f76499 = true;
        m53356();
        if (this.f76498) {
            this.f76510.release();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m53353(int i, float f, int i2) {
        this.f76502 = i;
        this.f76505 = i2;
        this.f76507 = f;
        this.f76501 = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m53354(boolean z) {
        boolean z2 = this.f76496;
        if (z2 == z) {
            return;
        }
        if (z && !z2) {
            this.f76501 = true;
        }
        this.f76496 = z;
        notifyAll();
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m53355(float[] fArr) {
        if (this.f76509) {
            return;
        }
        System.arraycopy(fArr, 0, this.f76503, 0, 16);
        this.f76501 = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m53356() {
        this.f76509 = true;
        notifyAll();
    }

    public C24099(AssetManager assetManager, SurfaceTexture surfaceTexture, int i, int i2, float f, int i3, boolean z, C22759 c22759) {
        super("MT-Logo3D");
        float[] fArr = new float[16];
        this.f76503 = fArr;
        this.f76501 = true;
        this.f76496 = true;
        this.f76508 = assetManager;
        this.f76510 = surfaceTexture;
        this.f76502 = i;
        this.f76505 = i2;
        this.f76507 = f;
        this.f76506 = i3;
        this.f76500 = z;
        this.f76504 = c22759;
        Matrix.setIdentityM(fArr, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x013e, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0143, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0148, code lost:
    
        m53351("query width", android.opengl.EGL14.eglQuerySurface(r2, r4, 12375, r7, 0));
        m53351("query height", android.opengl.EGL14.eglQuerySurface(r2, r4, 12374, r7, 1));
        r13.m35055(r7[0], r7[1], r7, r8);
        m53351("swap buffers", android.opengl.EGL14.eglSwapBuffers(r2, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0172, code lost:
    
        if (r20.f76497 != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0174, code lost:
    
        r20.f76497 = true;
        r20.f76504.m50943(r20);
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws Throwable {
        Surface surface;
        Surface surface2;
        boolean z;
        C15381 c15381;
        int[] iArr;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.EGL_NO_DISPLAY;
        EGLContext eGLContextEglCreateContext = EGL14.EGL_NO_CONTEXT;
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.EGL_NO_SURFACE;
        try {
            try {
                eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                int[] iArr2 = new int[2];
                m53351("initialize", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr3 = new int[1];
                m53351("choose config", EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12339, 4, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr3, 0) && iArr3[0] > 0);
                eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                m53351("create context", eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT);
                C15381 c15382 = new C15381();
                int[] iArr4 = new int[2];
                float[] fArr = new float[16];
                int i = 0;
                int i2 = 0;
                Surface surface3 = null;
                boolean z2 = false;
                while (true) {
                    try {
                        try {
                            synchronized (this) {
                                while (true) {
                                    z = this.f76509;
                                    if (z || (this.f76496 && this.f76501 && this.f76502 > 0 && this.f76505 > 0)) {
                                        break;
                                    } else {
                                        wait();
                                    }
                                }
                                if (!z) {
                                    int i3 = this.f76502;
                                    int i4 = this.f76505;
                                    float f = this.f76507;
                                    C15381 c15383 = c15382;
                                    int[] iArr5 = iArr4;
                                    System.arraycopy(this.f76503, 0, fArr, 0, 16);
                                    this.f76501 = false;
                                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                                    if (eGLSurfaceEglCreateWindowSurface == eGLSurface || i != i3 || i2 != i4) {
                                        if (eGLSurfaceEglCreateWindowSurface != eGLSurface) {
                                            EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                                            EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreateWindowSurface);
                                            eGLSurfaceEglCreateWindowSurface = EGL14.EGL_NO_SURFACE;
                                            surface3.release();
                                        }
                                        surface2 = new Surface(this.f76510);
                                        try {
                                            eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplayEglGetDisplay, eGLConfigArr[0], surface2, new int[]{12344}, 0);
                                            m53351("create surface", eGLSurfaceEglCreateWindowSurface != EGL14.EGL_NO_SURFACE);
                                            m53351("make current", EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, eGLContextEglCreateContext));
                                            i2 = i4;
                                            surface3 = surface2;
                                            i = i3;
                                        } catch (Exception | LinkageError | OutOfMemoryError unused) {
                                            final C22759 c22759 = this.f76504;
                                            c22759.f71776.post(new Runnable() { // from class: l.۠۠ۡ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    TextureViewSurfaceTextureListenerC23429 textureViewSurfaceTextureListenerC23429 = c22759.f71776;
                                                    if (textureViewSurfaceTextureListenerC23429.f74639 != this) {
                                                        return;
                                                    }
                                                    textureViewSurfaceTextureListenerC23429.f74642 = true;
                                                    textureViewSurfaceTextureListenerC23429.f74643.setVisibility(0);
                                                    textureViewSurfaceTextureListenerC23429.f74637.setAlpha(0.0f);
                                                    textureViewSurfaceTextureListenerC23429.m52128();
                                                }
                                            });
                                            if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                                                EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                                                EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                                                if (eGLSurfaceEglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                                                    EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreateWindowSurface);
                                                }
                                                if (eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
                                                    EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                                                }
                                                EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                                            }
                                            if (surface2 != null) {
                                                surface2.release();
                                            }
                                            EGL14.eglReleaseThread();
                                            synchronized (this) {
                                                this.f76498 = true;
                                                if (this.f76499) {
                                                    this.f76510.release();
                                                }
                                            }
                                            return;
                                        }
                                    }
                                    if (z2) {
                                        c15381 = c15383;
                                    } else {
                                        c15381 = c15383;
                                        c15381.m35056(this.f76508, this.f76506, this.f76500);
                                        z2 = true;
                                    }
                                    synchronized (this) {
                                        if (!this.f76509) {
                                            if (!this.f76496) {
                                                this.f76501 = true;
                                            }
                                            iArr4 = iArr;
                                            c15382 = c15381;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                        } catch (Exception | LinkageError | OutOfMemoryError unused2) {
                            surface2 = surface3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        surface = surface3;
                        if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                            EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                            EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                            if (eGLSurfaceEglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                                EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreateWindowSurface);
                            }
                            if (eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
                                EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                            }
                            EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                        }
                        if (surface != null) {
                            surface.release();
                        }
                        EGL14.eglReleaseThread();
                        synchronized (this) {
                            this.f76498 = true;
                            if (this.f76499) {
                                this.f76510.release();
                            }
                        }
                        throw th;
                    }
                }
                if (eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    EGLSurface eGLSurface4 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface4, eGLSurface4, EGL14.EGL_NO_CONTEXT);
                    if (eGLSurfaceEglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreateWindowSurface);
                    }
                    if (eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                    }
                    EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                }
                if (surface3 != null) {
                    surface3.release();
                }
                EGL14.eglReleaseThread();
                synchronized (this) {
                    this.f76498 = true;
                    if (this.f76499) {
                        this.f76510.release();
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception | LinkageError | OutOfMemoryError unused3) {
            surface2 = null;
        } catch (Throwable th3) {
            th = th3;
            surface = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53351(String str, boolean z) {
        if (z) {
            return;
        }
        StringBuilder sbM11879 = C5410.m11879("Logo EGL ", str, " failed: ");
        sbM11879.append(EGL14.eglGetError());
        throw new IllegalStateException(sbM11879.toString());
    }
}
