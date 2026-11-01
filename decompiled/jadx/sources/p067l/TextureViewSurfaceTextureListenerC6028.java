package p067l;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.ۘۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: D5IX */
/* JADX INFO: loaded from: classes2.dex */
public final class TextureViewSurfaceTextureListenerC6028 extends Thread implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: ۙ */
    public long[] f15092;

    /* JADX INFO: renamed from: ᩶ */
    public final WeakReference f15093;

    /* JADX INFO: renamed from: ᩸ */
    public final C24447 f15094;

    /* JADX INFO: renamed from: ᩹ */
    public GifInfoHandle f15095;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public TextureViewSurfaceTextureListenerC6028(C20110 c20110) {
        super("GifRenderThread");
        this.f15094 = new C24447();
        this.f15095 = new GifInfoHandle();
        this.f15093 = new WeakReference(c20110);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            C20110 c20110 = (C20110) this.f15093.get();
            if (c20110 == null) {
                return;
            }
            GifInfoHandle gifInfoHandleMo15295 = c20110.f62212.mo15295();
            this.f15095 = gifInfoHandleMo15295;
            gifInfoHandleMo15295.m55472(c20110.isOpaque(), (char) 1);
            if (c20110.f62210.f6530 >= 0) {
                this.f15095.m55469(c20110.f62210.f6530);
            }
            C20110 c20111 = (C20110) this.f15093.get();
            if (c20111 == null) {
                this.f15095.m55463();
                return;
            }
            C20110.m45537(c20111, this);
            boolean zIsAvailable = c20111.isAvailable();
            C24447 c24447 = this.f15094;
            synchronized (c24447) {
                try {
                    if (zIsAvailable) {
                        c24447.m53931();
                    } else {
                        c24447.m53930();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zIsAvailable) {
                c20111.post(new RunnableC4687(this, c20111));
            }
            this.f15095.m55468(c20111.f62209);
            while (!isInterrupted()) {
                try {
                    this.f15094.m53929();
                    C20110 c20112 = (C20110) this.f15093.get();
                    if (c20112 == null) {
                        break;
                    }
                    SurfaceTexture surfaceTexture = c20112.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        Surface surface = new Surface(surfaceTexture);
                        try {
                            this.f15095.m55471(surface, this.f15092);
                            surface.release();
                        } catch (Throwable th2) {
                            surface.release();
                            throw th2;
                        }
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            this.f15095.m55463();
            this.f15095 = new GifInfoHandle();
        } catch (IOException unused2) {
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C20110 c20110 = (C20110) this.f15093.get();
        if (c20110 != null) {
            c20110.m45539(this.f15095);
        }
        this.f15094.m53931();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f15094.m53930();
        this.f15095.m55487();
        interrupt();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13535(C20110 c20110) {
        this.f15094.m53930();
        C20110.m45537(c20110, (TextureView.SurfaceTextureListener) null);
        this.f15095.m55487();
        interrupt();
    }
}
