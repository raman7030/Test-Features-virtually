package p067l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.֫ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D96H */
/* JADX INFO: loaded from: classes2.dex */
public final class C4232 {

    /* JADX INFO: renamed from: ᩳ */
    public static final ThreadLocal f9341 = new ThreadLocal();

    /* JADX INFO: renamed from: ֫ */
    public volatile int f9342 = 0;

    /* JADX INFO: renamed from: ۧ */
    public final int f9343;

    /* JADX INFO: renamed from: ܽ */
    public final C24368 f9344;

    public C4232(C24368 c24368, int i) {
        this.f9344 = c24368;
        this.f9343 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8598(Canvas canvas, float f, float f2, Paint paint) {
        C24368 c24368 = this.f9344;
        Typeface typefaceM53722 = c24368.m53722();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceM53722);
        canvas.drawText(c24368.m53719(), this.f9343 * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: ۢ */
    private C25019 m8595() {
        ThreadLocal threadLocal = f9341;
        C25019 c25019 = (C25019) threadLocal.get();
        if (c25019 == null) {
            c25019 = new C25019();
            threadLocal.set(c25019);
        }
        this.f9344.m53720().m20632(c25019, this.f9343);
        return c25019;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m8605() {
        return m8595().m54933();
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m8602() {
        return m8595().m54930();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m8603() {
        return m8595().m54931();
    }

    /* JADX INFO: renamed from: ܿ */
    public final short m8604() {
        return m8595().m54932();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m8601() {
        return this.f9342 & 3;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m8606() {
        this.f9342 = (this.f9342 & 3) | 4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8599(boolean z) {
        int i = this.f9342 & 4;
        this.f9342 = z ? i | 2 : i | 1;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m8600() {
        return (this.f9342 & 4) > 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m8607() {
        return m8595().m54929();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m8597(int i) {
        return m8595().m54928(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m8596() {
        return m8595().m54927();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(m8605()));
        sb.append(", codepoints:");
        int iM8596 = m8596();
        for (int i = 0; i < iM8596; i++) {
            sb.append(Integer.toHexString(m8597(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
