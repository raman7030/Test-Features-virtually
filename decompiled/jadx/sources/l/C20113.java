package l;

/* JADX INFO: renamed from: l.᩶ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAZD */
/* JADX INFO: loaded from: classes5.dex */
public final class C20113 implements InterfaceC10961 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6870 f65137;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f65138;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f65139;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f65140;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C6761 f65141;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f65142;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3179 f65143;

    public C20113(AbstractC3179 abstractC3179) {
        this.f65143 = abstractC3179;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m46370(int i, float f, int i2) {
        C6761 c6761M18556;
        AbstractC3179 abstractC3179 = this.f65143;
        C22686 c22686 = abstractC3179.f10037;
        if (i == i2) {
            return 0.0f;
        }
        if (!this.f65138) {
            if (this.f65141 == null || i < this.f65142 || i2 > this.f65140) {
                C11747 c11747 = abstractC3179.f9998.get(abstractC3179.m9762(i, true));
                this.f65142 = c11747.f35062;
                int iM28750 = c11747.m28750();
                this.f65140 = iM28750;
                C6870 c6870 = this.f65137;
                if (c6870 == null) {
                    c6761M18556 = abstractC3179.f10037.m24476(this.f65139, this.f65142, iM28750, 0.0f, (C18159) null);
                } else {
                    c6761M18556 = c6870.m18556(this.f65139, this.f65142, iM28750, c22686);
                }
                this.f65141 = c6761M18556;
            }
            if (i >= this.f65142 && i2 <= this.f65140) {
                return this.f65141.m18410(Float.POSITIVE_INFINITY, i2) - this.f65141.m18410(Float.POSITIVE_INFINITY, i);
            }
        }
        C6870 c6871 = this.f65137;
        return c6871 == null ? c22686.m24487(this.f65139, i, i2, f) : c6871.m18554(this.f65139, i, i2, f, abstractC3179.f10037);
    }
}
