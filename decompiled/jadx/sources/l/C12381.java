package l;

/* JADX INFO: renamed from: l.۫ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9H2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12381 extends C16614 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f37139;

    @Override // l.C16614
    /* JADX INFO: renamed from: ۧ */
    public final void mo7050(C0097 c0097) throws C13146 {
        c0097.m26096(2);
        c0097.m26096(2);
        c0097.m26099();
        c0097.m26087(8, new byte[8]);
        c0097.m26087(8, new byte[8]);
        int iM26099 = c0097.m26099();
        int iM260910 = c0097.m26099();
        int iM260911 = c0097.m26099();
        int iM260912 = c0097.m26099();
        c0097.m26096(4);
        c0097.m26096(4);
        if (iM260910 > 0) {
            c0097.m26097(iM26099);
            c0097.m26094(iM260910);
        }
        if (iM260912 > 0) {
            c0097.m26097(iM260911);
            byte[] bArr = new byte[iM260912];
            c0097.m26087(iM260912, bArr);
            this.f37139 = bArr;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final byte[] m30106() {
        return this.f37139;
    }
}
