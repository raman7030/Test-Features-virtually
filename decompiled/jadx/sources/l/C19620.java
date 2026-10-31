package l;

/* JADX INFO: renamed from: l.᩵ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4EU */
/* JADX INFO: loaded from: classes4.dex */
public final class C19620 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long f63346;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C18914 f63347;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18914 m45063() {
        synchronized (C19620.class) {
            C18914 c18914 = f63347;
            if (c18914 != null) {
                f63347 = c18914.f59599;
                c18914.f59599 = null;
                f63346 -= 8192;
                return c18914;
            }
            return new C18914();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45064(C18914 c18914) {
        if (c18914.f59599 != null || c18914.f59598 != null) {
            throw new IllegalArgumentException();
        }
        if (c18914.f59602) {
            return;
        }
        synchronized (C19620.class) {
            long j = f63346 + 8192;
            if (j > 65536) {
                return;
            }
            f63346 = j;
            c18914.f59599 = f63347;
            c18914.f59597 = 0;
            c18914.f59600 = 0;
            f63347 = c18914;
        }
    }
}
