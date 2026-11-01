package p067l;

/* JADX INFO: renamed from: l.᩶ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAZD */
/* JADX INFO: loaded from: classes5.dex */
public final class C21484 implements InterfaceC12786 {

    /* JADX INFO: renamed from: ֫ */
    public C8898 f67776;

    /* JADX INFO: renamed from: ۧ */
    public boolean f67777;

    /* JADX INFO: renamed from: ܳ */
    public CharSequence f67778;

    /* JADX INFO: renamed from: ܽ */
    public int f67779;

    /* JADX INFO: renamed from: ܿ */
    public C8794 f67780;

    /* JADX INFO: renamed from: ᩳ */
    public int f67781;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractC5390 f67782;

    public C21484(AbstractC5390 abstractC5390) {
        this.f67782 = abstractC5390;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m48686(int i, float f, int i2) {
        C8794 c8794M20505;
        AbstractC5390 abstractC5390 = this.f67782;
        C23929 c23929 = abstractC5390.f12837;
        if (i == i2) {
            return 0.0f;
        }
        if (!this.f67777) {
            if (this.f67780 == null || i < this.f67781 || i2 > this.f67779) {
                C13533 c13533 = abstractC5390.f12798.get(abstractC5390.m11806(i, true));
                this.f67781 = c13533.f38061;
                int iM30798 = c13533.m30798();
                this.f67779 = iM30798;
                C8898 c8898 = this.f67776;
                if (c8898 == null) {
                    c8794M20505 = abstractC5390.f12837.m26488(this.f67778, this.f67781, iM30798, 0.0f, (C19627) null);
                } else {
                    c8794M20505 = c8898.m20505(this.f67778, this.f67781, iM30798, c23929);
                }
                this.f67780 = c8794M20505;
            }
            if (i >= this.f67781 && i2 <= this.f67779) {
                return this.f67780.m20358(Float.POSITIVE_INFINITY, i2) - this.f67780.m20358(Float.POSITIVE_INFINITY, i);
            }
        }
        C8898 c8899 = this.f67776;
        return c8899 == null ? c23929.m26499(this.f67778, i, i2, f) : c8899.m20503(this.f67778, i, i2, f, abstractC5390.f12837);
    }
}
