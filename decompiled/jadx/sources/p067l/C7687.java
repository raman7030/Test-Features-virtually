package p067l;

/* JADX INFO: renamed from: l.ۚ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7VX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7687 implements InterfaceC2992 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC19442 f20154;

    /* JADX INFO: renamed from: ֫ */
    public static C7687 m17801(C23780 c23780, String str, byte[] bArr) throws Throwable {
        AbstractC19442 abstractC19442M44219 = AbstractC19442.m44219(c23780, bArr, (byte[]) null);
        C7687 c7687 = new C7687();
        c7687.f20154 = abstractC19442M44219;
        return c7687;
    }

    @Override // p067l.InterfaceC2992
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5027(byte[] bArr) {
        return this.f20154.mo9929(bArr);
    }

    @Override // p067l.InterfaceC2992
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo5029() {
        return this.f20154.mo9934();
    }

    @Override // p067l.InterfaceC2992
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo5030(byte[] bArr) {
        return this.f20154.mo9932(bArr);
    }

    @Override // p067l.InterfaceC2992
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo5028(String str, byte[] bArr) {
        return this.f20154.mo9930(str, bArr);
    }

    @Override // p067l.InterfaceC2992
    /* JADX INFO: renamed from: ֫ */
    public final String mo5026() {
        return C20764.m46882(this.f20154.mo9935());
    }

    @Override // p067l.InterfaceC2992
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo5031() {
        return this.f20154.f59227;
    }

    @Override // p067l.InterfaceC2992
    public final void clear() {
        this.f20154.mo13547();
        this.f20154 = null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC19442 m17802() {
        return this.f20154;
    }
}
