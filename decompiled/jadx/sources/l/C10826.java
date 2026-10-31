package l;

/* JADX INFO: renamed from: l.ۧۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q882 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10826 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15387 f32566;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final boolean f32567;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15387 f32568;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15387 f32569;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f32567 = z;
        if (z) {
            f32566 = C10617.f31887;
            f32569 = C12028.f35981;
            f32568 = C14143.f42687;
        } else {
            f32566 = null;
            f32569 = null;
            f32568 = null;
        }
    }
}
