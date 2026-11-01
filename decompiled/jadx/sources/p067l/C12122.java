package p067l;

/* JADX INFO: renamed from: l.ۤۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes3.dex */
public final class C12122 extends AbstractC5022 {

    /* JADX INFO: renamed from: ۧ */
    public boolean f33869;

    /* JADX INFO: renamed from: ܽ */
    public StringBuilder f33870;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C11097 f33871;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12122(C11097 c11097, boolean z) {
        super(c11097.f30760);
        this.f33871 = c11097;
        this.f33870 = new StringBuilder();
        this.f33869 = z;
    }

    @Override // p067l.AbstractC5022
    /* JADX INFO: renamed from: ܽ */
    public final void mo10688(AbstractC6462 abstractC6462) {
        if (this.f33869) {
            return;
        }
        super.mo10688(abstractC6462);
        throw null;
    }

    @Override // p067l.AbstractC5022
    /* JADX INFO: renamed from: ֫ */
    public final void mo10681(char c) {
        this.f33870.append(c);
    }

    @Override // p067l.AbstractC5022
    /* JADX INFO: renamed from: ֫ */
    public final void mo10686(byte[] bArr) {
        this.f33870.append(this.f33871.f30758.m18989(bArr).toString());
    }

    @Override // p067l.AbstractC5022
    /* JADX INFO: renamed from: ֫ */
    public final void mo10684(AbstractC12224 abstractC12224) {
        this.f33870.append(abstractC12224.toString());
    }

    public final String toString() {
        return this.f33870.toString();
    }
}
