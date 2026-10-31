package l;

/* JADX INFO: renamed from: l.ۚ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J71Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C5208 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f16313;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0268 f16314;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f16315;

    public C5208(String str, String str2, InterfaceC0268 interfaceC0268) {
        if (str2.isEmpty() || str2.charAt(0) != '/') {
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }
        if (!str2.endsWith("/")) {
            throw new IllegalArgumentException("Path should end with a slash '/'");
        }
        this.f16313 = str;
        this.f16315 = str2;
        this.f16314 = interfaceC0268;
    }
}
