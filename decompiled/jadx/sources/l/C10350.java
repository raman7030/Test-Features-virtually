package l;

/* JADX INFO: renamed from: l.ۤܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes3.dex */
public final class C10350 implements InterfaceC2155 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7527 f31151;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7527 f31152;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f31148 = true;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C7527 f31150 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f31149 = false;

    public C10350(C7527 c7527, C7527 c7528) {
        this.f31151 = c7527;
        this.f31152 = c7528;
    }

    @Override // l.InterfaceC2155
    /* JADX INFO: renamed from: ֫ */
    public final void mo7113(C7527 c7527) {
        if (this.f31149) {
            return;
        }
        if (this.f31148) {
            C7527 c7528 = this.f31152;
            C7527 c7529 = this.f31151;
            if (c7527 == c7529) {
                this.f31148 = false;
                this.f31150 = c7528;
            } else {
                if (c7527 != c7528) {
                    return;
                }
                this.f31148 = false;
                this.f31150 = c7529;
            }
        }
        if (c7527.m20189()) {
            c7527.m20178();
        }
        if (c7527 == this.f31150) {
            this.f31149 = true;
        }
    }

    @Override // l.InterfaceC2155
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7114() {
        return this.f31150 == null;
    }
}
