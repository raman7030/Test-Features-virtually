package p067l;

/* JADX INFO: renamed from: l.ܺ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1UY */
/* JADX INFO: loaded from: classes4.dex */
public final class C17529 implements InterfaceC4790 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4790 f52389;

    /* JADX INFO: renamed from: ۧ */
    public final int f52390;

    /* JADX INFO: renamed from: ܽ */
    public final int f52391 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public final int f52392;

    public C17529(int i, int i2, InterfaceC4790 interfaceC4790) {
        this.f52392 = i2;
        this.f52390 = i & 7;
        this.f52389 = interfaceC4790;
    }

    @Override // p067l.InterfaceC4790
    /* JADX INFO: renamed from: ֫ */
    public final void mo5457(C5187 c5187, C14574 c14574) {
        int iM14971 = c14574.m14971();
        if ((this.f52391 & (~iM14971)) == 0 && (this.f52392 & iM14971) == 0) {
            int i = this.f52390;
            if (i == 0 || (iM14971 & i) != 0) {
                this.f52389.mo5457(c5187, c14574);
            }
        }
    }

    @Override // p067l.InterfaceC4790
    /* JADX INFO: renamed from: ֫ */
    public final void mo5456(C5187 c5187, C11893 c11893) {
        int iM14971 = c11893.m14971();
        if ((this.f52391 & (~iM14971)) == 0 && (this.f52392 & iM14971) == 0) {
            int i = this.f52390;
            if (i == 0 || (iM14971 & i) != 0) {
                this.f52389.mo5456(c5187, c11893);
            }
        }
    }
}
