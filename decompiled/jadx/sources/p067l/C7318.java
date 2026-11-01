package p067l;

/* JADX INFO: renamed from: l.ۚ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J71Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C7318 {

    /* JADX INFO: renamed from: ֫ */
    public final String f19154;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC2623 f19155;

    /* JADX INFO: renamed from: ܽ */
    public final String f19156;

    public C7318(String str, String str2, InterfaceC2623 interfaceC2623) {
        if (str2.isEmpty() || str2.charAt(0) != '/') {
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }
        if (!str2.endsWith("/")) {
            throw new IllegalArgumentException("Path should end with a slash '/'");
        }
        this.f19154 = str;
        this.f19156 = str2;
        this.f19155 = interfaceC2623;
    }
}
