package l;

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
public final class C22865 extends Thread {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f73765;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile boolean f73766;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f73767;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f73768;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f73769;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f73770;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f73771;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float[] f73772;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21455 f73773;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f73774;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f73775;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f73776;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AssetManager f73777;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f73778;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final SurfaceTexture f73779;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m50962() {
        if (this.f73768) {
            return;
        }
        this.f73768 = true;
        m50966();
        if (this.f73767) {
            this.f73779.release();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m50963(int i, float f, int i2) {
        this.f73771 = i;
        this.f73774 = i2;
        this.f73776 = f;
        this.f73770 = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m50964(boolean z) {
        boolean z2 = this.f73765;
        if (z2 == z) {
            return;
        }
        if (z && !z2) {
            this.f73770 = true;
        }
        this.f73765 = z;
        notifyAll();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m50965(float[] fArr) {
        if (this.f73778) {
            return;
        }
        System.arraycopy(fArr, 0, this.f73772, 0, 16);
        this.f73770 = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m50966() {
        this.f73778 = true;
        notifyAll();
    }

    public C22865(AssetManager assetManager, SurfaceTexture surfaceTexture, int i, int i2, float f, int i3, boolean z, C21455 c21455) {
        super("MT-Logo3D");
        float[] fArr = new float[16];
        this.f73772 = fArr;
        this.f73770 = true;
        this.f73765 = true;
        this.f73777 = assetManager;
        this.f73779 = surfaceTexture;
        this.f73771 = i;
        this.f73774 = i2;
        this.f73776 = f;
        this.f73775 = i3;
        this.f73769 = z;
        this.f73773 = c21455;
        Matrix.setIdentityM(fArr, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x013e, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0143, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0148, code lost:
    
        m50961("query width", android.opengl.EGL14.eglQuerySurface(r2, r4, 12375, r7, 0));
        m50961("query height", android.opengl.EGL14.eglQuerySurface(r2, r4, 12374, r7, 1));
        r13.m32940(r7[0], r7[1], r7, r8);
        m50961("swap buffers", android.opengl.EGL14.eglSwapBuffers(r2, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0172, code lost:
    
        if (r20.f73766 != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0174, code lost:
    
        r20.f73766 = true;
        r20.f73773.m48606(r20);
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws Throwable {
        Surface surface;
        Surface surface2;
        boolean z;
        C13692 c13692;
        int[] iArr;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.EGL_NO_DISPLAY;
        EGLContext eGLContextEglCreateContext = EGL14.EGL_NO_CONTEXT;
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.EGL_NO_SURFACE;
        try {
            try {
                eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                int[] iArr2 = new int[2];
                m50961("initialize", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr3 = new int[1];
                m50961("choose config", EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12339, 4, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr3, 0) && iArr3[0] > 0);
                eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                m50961("create context", eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT);
                C13692 c13693 = new C13692();
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
                                    z = this.f73778;
                                    if (z || (this.f73765 && this.f73770 && this.f73771 > 0 && this.f73774 > 0)) {
                                        break;
                                    } else {
                                        wait();
                                    }
                                }
                                if (!z) {
                                    int i3 = this.f73771;
                                    int i4 = this.f73774;
                                    float f = this.f73776;
                                    C13692 c13694 = c13693;
                                    int[] iArr5 = iArr4;
                                    System.arraycopy(this.f73772, 0, fArr, 0, 16);
                                    this.f73770 = false;
                                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                                    if (eGLSurfaceEglCreateWindowSurface == eGLSurface || i != i3 || i2 != i4) {
                                        if (eGLSurfaceEglCreateWindowSurface != eGLSurface) {
                                            EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                                            EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreateWindowSurface);
                                            eGLSurfaceEglCreateWindowSurface = EGL14.EGL_NO_SURFACE;
                                            surface3.release();
                                        }
                                        surface2 = new Surface(this.f73779);
                                        try {
                                            eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplayEglGetDisplay, eGLConfigArr[0], surface2, new int[]{12344}, 0);
                                            m50961("create surface", eGLSurfaceEglCreateWindowSurface != EGL14.EGL_NO_SURFACE);
                                            m50961("make current", EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, eGLContextEglCreateContext));
                                            i2 = i4;
                                            surface3 = surface2;
                                            i = i3;
                                        } catch (Exception | LinkageError | OutOfMemoryError unused) {
                                            final C21455 c21455 = this.f73773;
                                            c21455.f69078.post(new Runnable() { // from class: l.۠۠ۡ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    TextureViewSurfaceTextureListenerC22160 textureViewSurfaceTextureListenerC22160 = c21455.f69078;
                                                    if (textureViewSurfaceTextureListenerC22160.f71917 != this) {
                                                        return;
                                                    }
                                                    textureViewSurfaceTextureListenerC22160.f71920 = true;
                                                    textureViewSurfaceTextureListenerC22160.f71921.setVisibility(0);
                                                    textureViewSurfaceTextureListenerC22160.f71915.setAlpha(0.0f);
                                                    textureViewSurfaceTextureListenerC22160.m49790();
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
                                                this.f73767 = true;
                                                if (this.f73768) {
                                                    this.f73779.release();
                                                }
                                            }
                                            return;
                                        }
                                    }
                                    if (z2) {
                                        c13692 = c13694;
                                    } else {
                                        c13692 = c13694;
                                        c13692.m32941(this.f73777, this.f73775, this.f73769);
                                        z2 = true;
                                    }
                                    synchronized (this) {
                                        if (!this.f73778) {
                                            if (!this.f73765) {
                                                this.f73770 = true;
                                            }
                                            iArr4 = iArr;
                                            c13693 = c13692;
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
                            this.f73767 = true;
                            if (this.f73768) {
                                this.f73779.release();
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
                    this.f73767 = true;
                    if (this.f73768) {
                        this.f73779.release();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50961(String str, boolean z) {
        if (z) {
            return;
        }
        StringBuilder sbM9834 = C3200.m9834("Logo EGL ", str, " failed: ");
        sbM9834.append(EGL14.eglGetError());
        throw new IllegalStateException(sbM9834.toString());
    }
}
