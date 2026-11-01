package p067l;

/* JADX INFO: renamed from: l.ܿۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K434 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18616 extends AbstractC13884 {

    /* JADX INFO: renamed from: ܽ */
    public final C3311 f55587;

    public C18616(C15933 c15933) {
        super(c15933);
        this.f55587 = new C3311();
    }

    @Override // p067l.InterfaceC4297
    /* JADX INFO: renamed from: ֫ */
    public final void mo8721(AbstractC7257 abstractC7257, int i) {
        int i2 = this.f39206;
        if (i2 > i) {
            i = i2;
        }
        this.f55587.m5770(i, abstractC7257);
    }

    @Override // p067l.AbstractC13884
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC7257 mo31588(AbstractC7257 abstractC7257) {
        mo8721(abstractC7257, this.f39207.f46086.f73356);
        return abstractC7257;
    }

    @Override // p067l.AbstractC13884
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC7257 mo31589(AbstractC7257 abstractC7257) {
        mo8721(abstractC7257, this.f39207.f46090.m9591().f73356);
        return abstractC7257;
    }

    @Override // p067l.InterfaceC4297
    /* JADX INFO: renamed from: ֫ */
    public final int mo8719(AbstractC7257 abstractC7257) {
        int iM5769 = this.f55587.m5769(abstractC7257);
        if (iM5769 == -1) {
            return -1;
        }
        return iM5769;
    }

    @Override // p067l.InterfaceC4297
    /* JADX INFO: renamed from: ֫ */
    public final int mo8720(AbstractC7257 abstractC7257, AbstractC7257 abstractC7258) {
        int iM5771 = this.f55587.m5771(abstractC7257);
        if (iM5771 == -1) {
            return -1;
        }
        mo8721(abstractC7258, iM5771);
        return iM5771;
    }
}
