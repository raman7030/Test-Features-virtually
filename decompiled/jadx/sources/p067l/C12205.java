package p067l;

/* JADX INFO: renamed from: l.ۤܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes3.dex */
public final class C12205 implements InterfaceC4417 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C9522 f34113;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C9522 f34114;

    /* JADX INFO: renamed from: ֫ */
    public boolean f34110 = true;

    /* JADX INFO: renamed from: ܽ */
    public C9522 f34112 = null;

    /* JADX INFO: renamed from: ۧ */
    public boolean f34111 = false;

    public C12205(C9522 c9522, C9522 c9523) {
        this.f34113 = c9522;
        this.f34114 = c9523;
    }

    @Override // p067l.InterfaceC4417
    /* JADX INFO: renamed from: ֫ */
    public final void mo9208(C9522 c9522) {
        if (this.f34111) {
            return;
        }
        if (this.f34110) {
            C9522 c9523 = this.f34114;
            C9522 c9524 = this.f34113;
            if (c9522 == c9524) {
                this.f34110 = false;
                this.f34112 = c9523;
            } else {
                if (c9522 != c9523) {
                    return;
                }
                this.f34110 = false;
                this.f34112 = c9524;
            }
        }
        if (c9522.m22165()) {
            c9522.m22154();
        }
        if (c9522 == this.f34112) {
            this.f34111 = true;
        }
    }

    @Override // p067l.InterfaceC4417
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9209() {
        return this.f34112 == null;
    }
}
