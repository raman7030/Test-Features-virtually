package p067l;

/* JADX INFO: renamed from: l.ܶ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 13OM */
/* JADX INFO: loaded from: classes5.dex */
public final class C17160 extends AbstractC17358 implements Comparable {

    /* JADX INFO: renamed from: ᩶ */
    public final C24989 f51103;

    /* JADX INFO: renamed from: ᩹ */
    public C23867 f51104 = null;

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ۧ */
    public final int mo5704() {
        return 4;
    }

    public C17160(C24989 c24989) {
        this.f51103 = c24989;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_CALL_SITE_ID_ITEM;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
        C16271 c16271M54887 = this.f51103.m54887();
        C23197 c23197M7854 = c3948.m7854();
        C23867 c23867M51677 = c23197M7854.m51677(c16271M54887);
        if (c23867M51677 == null) {
            C6630 c6630M7844 = c3948.m7844();
            c23867M51677 = new C23867(c16271M54887);
            c6630M7844.m15102((AbstractC5289) c23867M51677);
            c23197M7854.m51678(c16271M54887, c23867M51677);
        }
        this.f51104 = c23867M51677;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5703(C3948 c3948, C19705 c19705) {
        int iM11432 = this.f51104.m11432();
        if (c19705.m44765()) {
            c19705.m44760(0, m39359() + ' ' + this.f51103.toString());
            c19705.m44760(4, "call_site_off: ".concat(C16351.m37155(iM11432)));
        }
        c19705.m44773(iM11432);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f51103.compareTo(((C17160) obj).f51103);
    }
}
