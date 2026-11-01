package p067l;

/* JADX INFO: renamed from: l.ܳܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77G */
/* JADX INFO: loaded from: classes5.dex */
public final class C16285 extends AbstractC8286 {

    /* JADX INFO: renamed from: ۗ */
    public final C18968 f47867;

    public C16285(C19639 c19639, int i, int i2, int i3, C18968 c18968) {
        super(c19639);
        this.f21936 = i;
        this.f21935 = i2;
        this.f21938 = i3;
        this.f47867 = c18968;
    }

    @Override // p067l.AbstractC8286, p067l.InterfaceC3751
    /* JADX INFO: renamed from: ܿۧ */
    public final InterfaceC5763 mo7251() {
        return this.f47867;
    }

    @Override // p067l.InterfaceC3751
    /* JADX INFO: renamed from: ᩷֫ */
    public final int mo3909() {
        C19639 c19639 = (C19639) getEntry();
        for (int i = 0; i < c19639.f59693.size(); i++) {
            if (c19639.f59693.get(i) == this) {
                return i;
            }
        }
        return -1;
    }
}
