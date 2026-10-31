package l;

/* JADX INFO: renamed from: l.ۙ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C4320 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final boolean f13910;

    static {
        boolean z = false;
        for (int i : C2909.f9269) {
            int upperCase = Character.toUpperCase(i);
            if (upperCase < 65536 || Character.toLowerCase(upperCase) < 65536) {
                z = true;
                break;
            }
        }
        f13910 = z;
    }
}
