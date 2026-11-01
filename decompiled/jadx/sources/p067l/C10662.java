package p067l;

/* JADX INFO: renamed from: l.ۡ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N4U4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10662 extends AbstractC17366 {

    /* JADX INFO: renamed from: ۧ */
    public final C14645 f29491;

    /* JADX INFO: renamed from: ܳ */
    public final int f29492;

    /* JADX INFO: renamed from: ܽ */
    public int f29493 = 0;

    /* JADX INFO: renamed from: ܿ */
    public int f29494;

    /* JADX INFO: renamed from: ᩳ */
    public final C20168 f29495;

    public C10662(C14645 c14645, int i) {
        this.f29494 = -1;
        this.f29491 = c14645;
        C20168 c20168M13859 = c14645.m33504().m13859(i);
        this.f29495 = c20168M13859;
        int iM45635 = c20168M13859.m45635();
        this.f29492 = iM45635;
        if (this.f29493 >= iM45635) {
            this.f29494 = c20168M13859.m45631();
            c20168M13859.m45626();
        }
    }

    @Override // p067l.AbstractC17366
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC12262 mo24528() {
        int i = this.f29493;
        int i2 = this.f29492;
        if (i >= i2) {
            return null;
        }
        this.f29493 = i + 1;
        C14645 c14645 = this.f29491;
        C20168 c20168 = this.f29495;
        InterfaceC12262 interfaceC12262M28423 = AbstractC12342.m28423(c14645, c20168);
        if (this.f29493 >= i2) {
            this.f29494 = c20168.m45631();
            c20168.m45626();
        }
        return interfaceC12262M28423;
    }

    @Override // p067l.AbstractC17366
    /* JADX INFO: renamed from: ᩳ */
    public final void mo24530() {
        int i = this.f29493;
        int i2 = this.f29492;
        if (i < i2) {
            this.f29493 = i + 1;
            C20168 c20168 = this.f29495;
            AbstractC12342.m28424(c20168);
            if (this.f29493 >= i2) {
                this.f29494 = c20168.m45631();
                c20168.m45626();
            }
        }
    }

    @Override // p067l.AbstractC17366
    /* JADX INFO: renamed from: ܽ */
    public final int mo24529() {
        int i = this.f29494;
        return i == -1 ? this.f29495.m45631() : i;
    }

    @Override // p067l.AbstractC17366
    /* JADX INFO: renamed from: ֫ */
    public final int mo24527() {
        return this.f29492;
    }
}
