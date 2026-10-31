package l;

/* JADX INFO: renamed from: l.᩺᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J5VJ */
/* JADX INFO: loaded from: classes.dex */
public final class C23209 extends AbstractC16404 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C23209 f74590 = new C23209(true);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C23209 f74591 = new C23209(false);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f74592;

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final int mo5433(int i) {
        return i + 1;
    }

    public C23209(boolean z) {
        this.f74592 = z;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ֫ */
    public final void mo5434(C1547 c1547) {
        c1547.m5300(EnumC3705.VALUE_BOOLEAN.f11701 | ((this.f74592 ? 1 : 0) << 5));
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۧ */
    public final int mo5436(AbstractC16404 abstractC16404) {
        boolean z = ((C23209) abstractC16404).f74592;
        boolean z2 = this.f74592;
        if (z2 == z) {
            return 0;
        }
        return z2 ? 1 : -1;
    }

    @Override // l.AbstractC16404
    /* JADX INFO: renamed from: ۖ */
    public final EnumC3705 mo5435() {
        return EnumC3705.VALUE_BOOLEAN;
    }

    public final int hashCode() {
        return this.f74592 ? 1 : 0;
    }
}
