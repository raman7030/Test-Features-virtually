package l;

/* JADX INFO: renamed from: l.ܳۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1RO */
/* JADX INFO: loaded from: classes3.dex */
public final class C14350 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34246(InterfaceC12731[] interfaceC12731Arr) throws C9413 {
        for (int i = 0; i < interfaceC12731Arr.length - 1; i++) {
            if (!interfaceC12731Arr[i].mo10843()) {
                throw new C9413("Unsupported XZ filter chain");
            }
        }
        if (!interfaceC12731Arr[interfaceC12731Arr.length - 1].mo10844()) {
            throw new C9413("Unsupported XZ filter chain");
        }
        int i2 = 0;
        for (InterfaceC12731 interfaceC12731 : interfaceC12731Arr) {
            if (interfaceC12731.mo10845()) {
                i2++;
            }
        }
        if (i2 > 3) {
            throw new C9413("Unsupported XZ filter chain");
        }
    }
}
