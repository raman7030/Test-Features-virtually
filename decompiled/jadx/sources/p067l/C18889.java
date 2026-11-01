package p067l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ܿܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6MH */
/* JADX INFO: loaded from: classes4.dex */
public final class C18889 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public Picture f56390;

    /* JADX INFO: renamed from: ۙ */
    public C23369 f56391;

    /* JADX INFO: renamed from: ۛ */
    public final C23369 f56392;

    /* JADX INFO: renamed from: ۤ */
    public boolean f56393;

    /* JADX INFO: renamed from: ۨ */
    public final int f56394;

    /* JADX INFO: renamed from: ۫ */
    public final int f56395;

    /* JADX INFO: renamed from: ۬ */
    public final boolean f56396;

    /* JADX INFO: renamed from: ᩶ */
    public final int f56397;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f56398;

    /* JADX INFO: renamed from: ᩹ */
    public C17871 f56399;

    public C18889(C17871 c17871, Picture picture, int i, int i2, int i3, C23369 c23369) {
        this.f56399 = c17871;
        this.f56396 = c17871 != null;
        this.f56390 = picture;
        this.f56394 = i;
        this.f56397 = i2;
        this.f56395 = i3;
        this.f56392 = c23369;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m42985() {
        return this.f56396;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m42987() {
        return this.f56395;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m42986(Canvas canvas) {
        Picture picture = this.f56390;
        if (picture == null || this.f56398) {
            return false;
        }
        canvas.drawPicture(picture);
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m42984((C23369) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42984(C23369 c23369) {
        synchronized (this) {
            if (this.f56398) {
                return;
            }
            this.f56398 = true;
            this.f56391 = c23369;
            Picture picture = this.f56390;
            this.f56390 = null;
            if (!this.f56393 && picture == null) {
                m42982();
            }
            if (picture != null) {
                try {
                    picture.beginRecording(1, 1);
                    picture.endRecording();
                    synchronized (this) {
                        m42982();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        m42982();
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m42982() {
        this.f56399 = null;
        this.f56392.close();
        C23369 c23369 = this.f56391;
        if (c23369 != null) {
            c23369.close();
            this.f56391 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23526 m42983(RectF rectF, float f, C21358 c21358, long j, C18477 c18477) throws Throwable {
        C17871 c17871;
        C23369 c23369M48382;
        C23369 c23369M48383;
        if (c18477.mo3924()) {
            throw new InterruptedIOException("SVG raster cancelled");
        }
        if (rectF == null || rectF.width() <= 0.0f || rectF.height() <= 0.0f || f <= 0.0f || !m42981(rectF.left) || !m42981(rectF.top) || !m42981(rectF.right) || !m42981(rectF.bottom) || !m42981(f)) {
            throw new IOException("Invalid SVG raster region");
        }
        double d = f;
        double dCeil = Math.ceil(((double) rectF.width()) * d);
        double dCeil2 = Math.ceil(((double) rectF.height()) * d);
        if (dCeil > 2.147483647E9d || dCeil2 > 2.147483647E9d) {
            throw new IOException("SVG raster dimensions exceed limit");
        }
        int iMax = Math.max(1, (int) dCeil);
        int iMax2 = Math.max(1, (int) dCeil2);
        long j2 = ((long) iMax) * ((long) iMax2);
        if (j2 > 2305843009213693951L) {
            throw new IOException("SVG raster dimensions overflow");
        }
        long j3 = j2 * 4;
        if (j3 <= 0 || j3 > j / ((long) this.f56395)) {
            throw new C3409("SVG raster workspace exceeds budget");
        }
        synchronized (this) {
            if (this.f56398 || (c17871 = this.f56399) == null) {
                throw new InterruptedIOException("SVG document is closed");
            }
            if (this.f56393) {
                throw new IOException("SVG raster requests must be serialized");
            }
            this.f56393 = true;
        }
        Bitmap bitmap = null;
        try {
            c23369M48383 = c21358.m48382(j3);
            if (c23369M48383 == null) {
                throw new C3409("SVG raster reservation exceeds budget");
            }
            try {
                c23369M48382 = c21358.m48382(((long) (this.f56395 - 1)) * j3);
                if (c23369M48382 == null) {
                    throw new C3409("SVG raster reservation exceeds budget");
                }
                try {
                    if (c18477.mo3924()) {
                        throw new InterruptedIOException("SVG raster cancelled");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        canvas.scale(iMax / rectF.width(), iMax2 / rectF.height());
                        canvas.translate(-rectF.left, -rectF.top);
                        c17871.m40617(canvas, new RectF(0.0f, 0.0f, this.f56394, this.f56397));
                        if (c18477.mo3924()) {
                            throw new InterruptedIOException("SVG raster cancelled");
                        }
                        synchronized (this) {
                            if (this.f56398) {
                                throw new InterruptedIOException("SVG document was closed while rendering");
                            }
                            if (bitmapCreateBitmap.getAllocationByteCount() > j3 || !c23369M48383.m52021(bitmapCreateBitmap.getAllocationByteCount())) {
                                throw new C3409("SVG raster allocation exceeds estimate");
                            }
                            C23526 c23526 = new C23526(bitmapCreateBitmap, c23369M48383, 1);
                            c23369M48382.close();
                            synchronized (this) {
                                this.f56393 = false;
                                if (this.f56398) {
                                    m42982();
                                }
                            }
                            return c23526;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bitmap = bitmapCreateBitmap;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                c23369M48382 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            c23369M48382 = null;
            c23369M48383 = null;
        }
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (c23369M48383 != null) {
            c23369M48383.close();
        }
        if (c23369M48382 != null) {
            c23369M48382.close();
        }
        synchronized (this) {
            this.f56393 = false;
            if (this.f56398) {
                m42982();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m42981(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }
}
