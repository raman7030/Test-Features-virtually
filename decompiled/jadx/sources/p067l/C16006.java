package p067l;

/* JADX INFO: renamed from: l.ܳۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1RO */
/* JADX INFO: loaded from: classes3.dex */
public final class C16006 {
    /* JADX INFO: renamed from: ֫ */
    public static void m36379(InterfaceC14468[] interfaceC14468Arr) throws C11314 {
        for (int i = 0; i < interfaceC14468Arr.length - 1; i++) {
            if (!interfaceC14468Arr[i].mo12823()) {
                throw new C11314("Unsupported XZ filter chain");
            }
        }
        if (!interfaceC14468Arr[interfaceC14468Arr.length - 1].mo12824()) {
            throw new C11314("Unsupported XZ filter chain");
        }
        int i2 = 0;
        for (InterfaceC14468 interfaceC14468 : interfaceC14468Arr) {
            if (interfaceC14468.mo12825()) {
                i2++;
            }
        }
        if (i2 > 3) {
            throw new C11314("Unsupported XZ filter chain");
        }
    }
}
