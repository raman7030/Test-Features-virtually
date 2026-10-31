package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܰۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MB */
/* JADX INFO: loaded from: classes3.dex */
public final class C13629 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C22097 f40637;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f40638;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C17383 f40639;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C15205 f40640;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final RectF f40641;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC0930 f40642;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Bitmap f40643;

    public C13629(C15205 c15205, Bitmap bitmap, C22097 c22097, C17383 c17383) {
        this.f40640 = c15205;
        this.f40643 = bitmap;
        this.f40637 = c22097;
        this.f40639 = c17383;
        this.f40642 = null;
        this.f40641 = new RectF(0.0f, 0.0f, c15205.f46658, c15205.f46659);
    }

    public C13629(C15205 c15205, InterfaceC0930 interfaceC0930) {
        this.f40640 = c15205;
        this.f40642 = interfaceC0930;
        this.f40643 = null;
        this.f40637 = null;
        this.f40639 = null;
        this.f40641 = new RectF(0.0f, 0.0f, c15205.f46658, c15205.f46659);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m32762() {
        InterfaceC0930 interfaceC0930 = this.f40642;
        if (interfaceC0930 == null) {
            return 0L;
        }
        return interfaceC0930.mo3346();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m32763() {
        InterfaceC0930 interfaceC0930 = this.f40642;
        return interfaceC0930 != null ? interfaceC0930.mo3342() : this.f40637.m49682();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32761() {
        C17383 c17383;
        return (this.f40638 || (c17383 = this.f40639) == null || !c17383.m40732()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m32764() {
        C17383 c17383 = this.f40639;
        if (c17383 == null) {
            return 1;
        }
        return c17383.m40734();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22262 m32757(RectF rectF, float f, C19981 c19981, long j, C16949 c16949) throws IOException {
        C17383 c17383;
        if (this.f40638 || (c17383 = this.f40639) == null || !c17383.m40732()) {
            throw new IOException("No SVG raster document");
        }
        return this.f40639.m40730(rectF, f, c19981, j, c16949);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32758(Canvas canvas, Paint paint) {
        if (this.f40638) {
            return;
        }
        InterfaceC0930 interfaceC0930 = this.f40642;
        if (interfaceC0930 != null) {
            interfaceC0930.mo3343(canvas, this.f40641, paint);
        } else {
            if (this.f40639.m40733(canvas)) {
                return;
            }
            canvas.drawBitmap(this.f40643, (Rect) null, this.f40641, paint);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32760(boolean z, RunnableC8483 runnableC8483) {
        InterfaceC0930 interfaceC0930;
        if (this.f40638 || (interfaceC0930 = this.f40642) == null) {
            return;
        }
        interfaceC0930.mo3345(z, runnableC8483);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m32759(null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32759(C22097 c22097) {
        if (this.f40638) {
            return;
        }
        this.f40638 = true;
        InterfaceC0930 interfaceC0930 = this.f40642;
        if (interfaceC0930 != null) {
            interfaceC0930.mo3344(c22097);
            return;
        }
        this.f40643.recycle();
        this.f40637.close();
        this.f40639.m40731(c22097);
    }
}
