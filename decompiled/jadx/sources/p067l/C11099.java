package p067l;

/* JADX INFO: renamed from: l.ۡ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9E5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11099 extends C18158 {

    /* JADX INFO: renamed from: ܿ */
    public C18139 f30763;

    public C11099(EnumC23366 enumC23366, C18139 c18139, long j) {
        super(9, enumC23366, EnumC24036.SMB2_TREE_CONNECT, j, 0L);
        this.f30763 = c18139;
    }

    @Override // p067l.C18158
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10795(C2460 c2460) {
        c2460.m28111(this.f54223);
        EnumC23366 enumC23366 = EnumC23366.UNKNOWN;
        c2460.m3476();
        c2460.m28111(72);
        String strM41324 = this.f30763.m41324();
        if (strM41324 == null) {
            c2460.m28111(0);
        } else {
            c2460.m28111(strM41324.length() * 2);
        }
        c2460.m28114(strM41324, C10169.f28132);
    }
}
