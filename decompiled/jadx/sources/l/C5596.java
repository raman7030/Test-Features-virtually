package l;

/* JADX INFO: renamed from: l.ۚ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7VX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5596 implements InterfaceC0656 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC17965 f17310;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5596 m15880(C22529 c22529, String str, byte[] bArr) throws Throwable {
        AbstractC17965 abstractC17965M41970 = AbstractC17965.m41970(c22529, bArr, (byte[]) null);
        C5596 c5596 = new C5596();
        c5596.f17310 = abstractC17965M41970;
        return c5596;
    }

    @Override // l.InterfaceC0656
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2688(byte[] bArr) {
        return this.f17310.mo7881(bArr);
    }

    @Override // l.InterfaceC0656
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo2690() {
        return this.f17310.mo7886();
    }

    @Override // l.InterfaceC0656
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo2691(byte[] bArr) {
        return this.f17310.mo7884(bArr);
    }

    @Override // l.InterfaceC0656
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo2689(String str, byte[] bArr) {
        return this.f17310.mo7882(str, bArr);
    }

    @Override // l.InterfaceC0656
    /* JADX INFO: renamed from: ֫ */
    public final String mo2687() {
        return C19356.m44588(this.f17310.mo7887());
    }

    @Override // l.InterfaceC0656
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2692() {
        return this.f17310.f56030;
    }

    @Override // l.InterfaceC0656
    public final void clear() {
        this.f17310.mo11611();
        this.f17310 = null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC17965 m15881() {
        return this.f17310;
    }
}
