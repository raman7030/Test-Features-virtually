package p067l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܰۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MB */
/* JADX INFO: loaded from: classes3.dex */
public final class C15321 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final C23369 f43717;

    /* JADX INFO: renamed from: ۙ */
    public volatile boolean f43718;

    /* JADX INFO: renamed from: ۫ */
    public final C18889 f43719;

    /* JADX INFO: renamed from: ۬ */
    public final C16819 f43720;

    /* JADX INFO: renamed from: ᩶ */
    public final RectF f43721;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC3252 f43722;

    /* JADX INFO: renamed from: ᩹ */
    public final Bitmap f43723;

    public C15321(C16819 c16819, Bitmap bitmap, C23369 c23369, C18889 c18889) {
        this.f43720 = c16819;
        this.f43723 = bitmap;
        this.f43717 = c23369;
        this.f43719 = c18889;
        this.f43722 = null;
        this.f43721 = new RectF(0.0f, 0.0f, c16819.f49783, c16819.f49784);
    }

    public C15321(C16819 c16819, InterfaceC3252 interfaceC3252) {
        this.f43720 = c16819;
        this.f43722 = interfaceC3252;
        this.f43723 = null;
        this.f43717 = null;
        this.f43719 = null;
        this.f43721 = new RectF(0.0f, 0.0f, c16819.f49783, c16819.f49784);
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m34877() {
        InterfaceC3252 interfaceC3252 = this.f43722;
        if (interfaceC3252 == null) {
            return 0L;
        }
        return interfaceC3252.mo5665();
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m34878() {
        InterfaceC3252 interfaceC3252 = this.f43722;
        return interfaceC3252 != null ? interfaceC3252.mo5661() : this.f43717.m52020();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m34876() {
        C18889 c18889;
        return (this.f43718 || (c18889 = this.f43719) == null || !c18889.m42985()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m34879() {
        C18889 c18889 = this.f43719;
        if (c18889 == null) {
            return 1;
        }
        return c18889.m42987();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23526 m34872(RectF rectF, float f, C21358 c21358, long j, C18477 c18477) throws IOException {
        C18889 c18889;
        if (this.f43718 || (c18889 = this.f43719) == null || !c18889.m42985()) {
            throw new IOException("No SVG raster document");
        }
        return this.f43719.m42983(rectF, f, c21358, j, c18477);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34873(Canvas canvas, Paint paint) {
        if (this.f43718) {
            return;
        }
        InterfaceC3252 interfaceC3252 = this.f43722;
        if (interfaceC3252 != null) {
            interfaceC3252.mo5662(canvas, this.f43721, paint);
        } else {
            if (this.f43719.m42986(canvas)) {
                return;
            }
            canvas.drawBitmap(this.f43723, (Rect) null, this.f43721, paint);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34875(boolean z, RunnableC10431 runnableC10431) {
        InterfaceC3252 interfaceC3252;
        if (this.f43718 || (interfaceC3252 = this.f43722) == null) {
            return;
        }
        interfaceC3252.mo5664(z, runnableC10431);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m34874(null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34874(C23369 c23369) {
        if (this.f43718) {
            return;
        }
        this.f43718 = true;
        InterfaceC3252 interfaceC3252 = this.f43722;
        if (interfaceC3252 != null) {
            interfaceC3252.mo5663(c23369);
            return;
        }
        this.f43723.recycle();
        this.f43717.close();
        this.f43719.m42984(c23369);
    }
}
