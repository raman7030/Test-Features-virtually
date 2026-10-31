package l;

/* JADX INFO: renamed from: l.ۤۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes3.dex */
public final class C10263 extends AbstractC2792 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f30905;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public StringBuilder f30906;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9184 f30907;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10263(C9184 c9184, boolean z) {
        super(c9184.f27821);
        this.f30907 = c9184;
        this.f30906 = new StringBuilder();
        this.f30905 = z;
    }

    @Override // l.AbstractC2792
    /* JADX INFO: renamed from: ܽ */
    public final void mo8628(AbstractC4308 abstractC4308) {
        if (this.f30905) {
            return;
        }
        super.mo8628(abstractC4308);
        throw null;
    }

    @Override // l.AbstractC2792
    /* JADX INFO: renamed from: ֫ */
    public final void mo8621(char c) {
        this.f30906.append(c);
    }

    @Override // l.AbstractC2792
    /* JADX INFO: renamed from: ֫ */
    public final void mo8626(byte[] bArr) {
        this.f30906.append(this.f30907.f27819.m17058(bArr).toString());
    }

    @Override // l.AbstractC2792
    /* JADX INFO: renamed from: ֫ */
    public final void mo8624(AbstractC10370 abstractC10370) {
        this.f30906.append(abstractC10370.toString());
    }

    public final String toString() {
        return this.f30906.toString();
    }
}
