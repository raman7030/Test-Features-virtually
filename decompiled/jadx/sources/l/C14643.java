package l;

/* JADX INFO: renamed from: l.ܳܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77G */
/* JADX INFO: loaded from: classes5.dex */
public final class C14643 extends AbstractC6226 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C17466 f44760;

    public C14643(C18172 c18172, int i, int i2, int i3, C17466 c17466) {
        super(c18172);
        this.f19073 = i;
        this.f19072 = i2;
        this.f19075 = i3;
        this.f44760 = c17466;
    }

    @Override // l.AbstractC6226, l.InterfaceC1454
    /* JADX INFO: renamed from: ܿۧ */
    public final InterfaceC3571 mo5008() {
        return this.f44760;
    }

    @Override // l.InterfaceC1454
    /* JADX INFO: renamed from: ᩷֫ */
    public final int mo1511() {
        C18172 c18172 = (C18172) getEntry();
        for (int i = 0; i < c18172.f56479.size(); i++) {
            if (c18172.f56479.get(i) == this) {
                return i;
            }
        }
        return -1;
    }
}
