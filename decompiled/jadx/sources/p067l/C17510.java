package p067l;

import android.graphics.Typeface;

/* JADX INFO: renamed from: l.ܺ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28V5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17510 {

    /* JADX INFO: renamed from: ۧ */
    public static final ThreadLocal f52347 = new ThreadLocal();

    /* JADX INFO: renamed from: ֫ */
    public final Typeface f52348;

    public C17510(Typeface typeface) {
        this.f52348 = typeface;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m39884(char c, char c2) {
        ThreadLocal threadLocal = f52347;
        C10806 c10806 = (C10806) threadLocal.get();
        Typeface typeface = this.f52348;
        if (c10806 == null || !typeface.equals(c10806.f29947)) {
            c10806 = new C10806(typeface);
            threadLocal.set(c10806);
        }
        return C10806.m24901(c10806, c, c2);
    }
}
