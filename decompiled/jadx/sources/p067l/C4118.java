package p067l;

/* JADX INFO: renamed from: l.֫۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 778V */
/* JADX INFO: loaded from: classes2.dex */
public final class C4118 {
    /* JADX INFO: renamed from: ֫ */
    public static C15243 m8323(int i, int i2, int i3, float f) {
        if (i > 0 && i2 > 0) {
            if (f <= 0.0f) {
                f = 1.0f;
            }
            float f2 = i * f;
            boolean z = i3 == 90 || i3 == 270;
            float f3 = z ? i2 : f2;
            if (!z) {
                f2 = i2;
            }
            if (f3 > 0.0f && f2 > 0.0f) {
                return new C15243(f3, f2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m8322(int i, int i2) {
        int i3 = i - i2;
        return Math.max(0, Math.min(i3 / 2, Math.max(0, i3)));
    }
}
