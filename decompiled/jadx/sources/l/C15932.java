package l;

import android.graphics.Typeface;

/* JADX INFO: renamed from: l.ܺ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28V5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15932 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f49200 = new ThreadLocal();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Typeface f49201;

    public C15932(Typeface typeface) {
        this.f49201 = typeface;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37709(char c, char c2) {
        ThreadLocal threadLocal = f49200;
        C8878 c8878 = (C8878) threadLocal.get();
        Typeface typeface = this.f49201;
        if (c8878 == null || !typeface.equals(c8878.f27023)) {
            c8878 = new C8878(typeface);
            threadLocal.set(c8878);
        }
        return C8878.m22930(c8878, c, c2);
    }
}
