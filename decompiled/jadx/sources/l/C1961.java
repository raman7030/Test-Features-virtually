package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.֫ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D96H */
/* JADX INFO: loaded from: classes2.dex */
public final class C1961 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f6562 = new ThreadLocal();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile int f6563 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f6564;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23148 f6565;

    public C1961(C23148 c23148, int i) {
        this.f6565 = c23148;
        this.f6564 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6457(Canvas canvas, float f, float f2, Paint paint) {
        C23148 c23148 = this.f6565;
        Typeface typefaceM51327 = c23148.m51327();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceM51327);
        canvas.drawText(c23148.m51324(), this.f6564 * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private C23833 m6454() {
        ThreadLocal threadLocal = f6562;
        C23833 c23833 = (C23833) threadLocal.get();
        if (c23833 == null) {
            c23833 = new C23833();
            threadLocal.set(c23833);
        }
        this.f6565.m51325().m18683(c23833, this.f6564);
        return c23833;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m6464() {
        return m6454().m52524();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m6461() {
        return m6454().m52521();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m6462() {
        return m6454().m52522();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final short m6463() {
        return m6454().m52523();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m6460() {
        return this.f6563 & 3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m6465() {
        this.f6563 = (this.f6563 & 3) | 4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6458(boolean z) {
        int i = this.f6563 & 4;
        this.f6563 = z ? i | 2 : i | 1;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m6459() {
        return (this.f6563 & 4) > 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m6466() {
        return m6454().m52520();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m6456(int i) {
        return m6454().m52519(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m6455() {
        return m6454().m52518();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(m6464()));
        sb.append(", codepoints:");
        int iM6455 = m6455();
        for (int i = 0; i < iM6455; i++) {
            sb.append(Integer.toHexString(m6456(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
