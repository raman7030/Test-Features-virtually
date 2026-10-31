package l;

/* JADX INFO: renamed from: l.ۢۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L7IW */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9474 implements InterfaceC17940 {
    OVERRIDE_READ_ONLY;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24315(InterfaceC17940[] interfaceC17940Arr) {
        byte[] bArr = C22194.f71991;
        if ((interfaceC17940Arr == null ? 0 : interfaceC17940Arr.length) == 0) {
            return false;
        }
        return C16958.of((Object[]) interfaceC17940Arr).anyMatch(new C20763());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m24317(InterfaceC17940 interfaceC17940) {
        return OVERRIDE_READ_ONLY == interfaceC17940;
    }
}
