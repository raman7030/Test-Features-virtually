package p067l;

/* JADX INFO: renamed from: l.᩵ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04RH */
/* JADX INFO: loaded from: classes5.dex */
public final class C21020 extends AbstractC11632 implements InterfaceC6486, InterfaceC3132 {

    /* JADX INFO: renamed from: ᩶ */
    public C9384 f65986;

    /* JADX INFO: renamed from: ᩹ */
    public final String f65987;

    @Override // p067l.InterfaceC9838
    /* JADX INFO: renamed from: ܽ */
    public final int mo10470() {
        return 9;
    }

    public C21020(int i, String str) {
        super(i);
        this.f65987 = str;
    }

    @Override // p067l.InterfaceC6486
    /* JADX INFO: renamed from: ۜ */
    public final String mo11944() {
        return this.f65987;
    }

    @Override // p067l.InterfaceC6486
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC16954 mo11945() {
        C9384 c9384 = this.f65986;
        if (c9384 != null) {
            return c9384;
        }
        if (this.f65987 == null) {
            return null;
        }
        return new C20349(this);
    }

    @Override // p067l.InterfaceC3132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5343(C20765 c20765) {
        this.f65986 = c20765.m46902(this.f65987);
    }
}
