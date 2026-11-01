package p067l;

/* JADX INFO: renamed from: l.ۧۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q882 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12657 {

    /* JADX INFO: renamed from: ֫ */
    public static final InterfaceC16992 f35542;

    /* JADX INFO: renamed from: ۧ */
    public static final boolean f35543;

    /* JADX INFO: renamed from: ܽ */
    public static final InterfaceC16992 f35544;

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC16992 f35545;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f35543 = z;
        if (z) {
            f35542 = C12459.f34859;
            f35545 = C13800.f38992;
            f35544 = C15810.f45776;
        } else {
            f35542 = null;
            f35545 = null;
            f35544 = null;
        }
    }
}
