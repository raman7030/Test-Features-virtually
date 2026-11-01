package p067l;

/* JADX INFO: renamed from: l.ۨۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 47NE */
/* JADX INFO: loaded from: classes4.dex */
public final class C13464 implements InterfaceC20314 {

    /* JADX INFO: renamed from: ֫ */
    public int f37784 = -1;

    /* JADX INFO: renamed from: ۧ */
    public final C19144 f37785;

    /* JADX INFO: renamed from: ܽ */
    public final int f37786;

    public C13464(C19144 c19144, int i) {
        this.f37785 = c19144;
        this.f37786 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30608() {
        C23877.m52957(this.f37784 == -1);
        this.f37784 = this.f37785.m43603(this.f37786);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m30609() {
        if (this.f37784 != -1) {
            this.f37785.m43623(this.f37786);
            this.f37784 = -1;
        }
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8569() {
        if (this.f37784 != -3) {
            return m30607() && this.f37785.m43617(this.f37784);
        }
        return true;
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ֫ */
    public final void mo8568() throws C9086 {
        int i = this.f37784;
        C19144 c19144 = this.f37785;
        if (i == -2) {
            throw new C9086(C6988.m16053("Unable to bind a sample queue to TrackGroup with MIME type ", c19144.m43625().m19034(this.f37786).m34395(0).f28528, "."));
        }
        if (i == -1) {
            c19144.m43619();
        } else if (i != -3) {
            c19144.m43620(i);
        }
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ֫ */
    public final int mo8567(C5221 c5221, C23128 c23128, int i) {
        if (this.f37784 == -3) {
            c23128.m14567(4);
            return -4;
        }
        if (m30607()) {
            return this.f37785.m43605(this.f37784, c5221, c23128, i);
        }
        return -3;
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ֫ */
    public final int mo8566(long j) {
        if (m30607()) {
            return this.f37785.m43604(this.f37784, j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m30607() {
        int i = this.f37784;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }
}
