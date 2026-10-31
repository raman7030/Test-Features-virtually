package l;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.ۘۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: D5IX */
/* JADX INFO: loaded from: classes2.dex */
public final class TextureViewSurfaceTextureListenerC3851 extends Thread implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long[] f12285;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final WeakReference f12286;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23231 f12287;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public GifInfoHandle f12288;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public TextureViewSurfaceTextureListenerC3851(C18668 c18668) {
        super("GifRenderThread");
        this.f12287 = new C23231();
        this.f12288 = new GifInfoHandle();
        this.f12286 = new WeakReference(c18668);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            C18668 c18668 = (C18668) this.f12286.get();
            if (c18668 == null) {
                return;
            }
            GifInfoHandle gifInfoHandleMo13407 = c18668.f58989.mo13407();
            this.f12288 = gifInfoHandleMo13407;
            gifInfoHandleMo13407.m52908(c18668.isOpaque(), (char) 1);
            if (c18668.f58987.f3758 >= 0) {
                this.f12288.m52905(c18668.f58987.f3758);
            }
            C18668 c18669 = (C18668) this.f12286.get();
            if (c18669 == null) {
                this.f12288.m52899();
                return;
            }
            C18668.m43271(c18669, this);
            boolean zIsAvailable = c18669.isAvailable();
            C23231 c23231 = this.f12287;
            synchronized (c23231) {
                try {
                    if (zIsAvailable) {
                        c23231.m51534();
                    } else {
                        c23231.m51533();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zIsAvailable) {
                c18669.post(new RunnableC2440(this, c18669));
            }
            this.f12288.m52904(c18669.f58986);
            while (!isInterrupted()) {
                try {
                    this.f12287.m51532();
                    C18668 c186610 = (C18668) this.f12286.get();
                    if (c186610 == null) {
                        break;
                    }
                    SurfaceTexture surfaceTexture = c186610.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        Surface surface = new Surface(surfaceTexture);
                        try {
                            this.f12288.m52907(surface, this.f12285);
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
            this.f12288.m52899();
            this.f12288 = new GifInfoHandle();
        } catch (IOException unused2) {
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C18668 c18668 = (C18668) this.f12286.get();
        if (c18668 != null) {
            c18668.m43273(this.f12288);
        }
        this.f12287.m51534();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f12287.m51533();
        this.f12288.m52923();
        interrupt();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11599(C18668 c18668) {
        this.f12287.m51533();
        C18668.m43271(c18668, (TextureView.SurfaceTextureListener) null);
        this.f12288.m52923();
        interrupt();
    }
}
