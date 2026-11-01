package p067l;

/* JADX INFO: renamed from: l.ۙ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C6474 {

    /* JADX INFO: renamed from: ֫ */
    public static final boolean f16725;

    static {
        boolean z = false;
        for (int i : C5133.f12067) {
            int upperCase = Character.toUpperCase(i);
            if (upperCase < 65536 || Character.toLowerCase(upperCase) < 65536) {
                z = true;
                break;
            }
        }
        f16725 = z;
    }
}
