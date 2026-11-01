package p067l;

/* JADX INFO: renamed from: l.᩺᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J5VJ */
/* JADX INFO: loaded from: classes.dex */
public final class C24426 extends AbstractC17958 {

    /* JADX INFO: renamed from: ᩶ */
    public static final C24426 f77333 = new C24426(true);

    /* JADX INFO: renamed from: ᩹ */
    public static final C24426 f77334 = new C24426(false);

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f77335;

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public final int mo7662(int i) {
        return i + 1;
    }

    public C24426(boolean z) {
        this.f77335 = z;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public final void mo7663(C3838 c3838) {
        c3838.m7529(EnumC5889.VALUE_BOOLEAN.f14502 | ((this.f77335 ? 1 : 0) << 5));
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۧ */
    public final int mo7665(AbstractC17958 abstractC17958) {
        boolean z = ((C24426) abstractC17958).f77335;
        boolean z2 = this.f77335;
        if (z2 == z) {
            return 0;
        }
        return z2 ? 1 : -1;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۖ */
    public final EnumC5889 mo7664() {
        return EnumC5889.VALUE_BOOLEAN;
    }

    public final int hashCode() {
        return this.f77335 ? 1 : 0;
    }
}
