package p067l;

/* JADX INFO: renamed from: l.ۚ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LBD2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7774 extends AbstractC5289 {

    /* JADX INFO: renamed from: ۗ */
    public C3079 f20391;

    public C7774(C3079 c3079) {
        super(4, 4);
        this.f20391 = c3079;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_ANNOTATION_SET_REF_ITEM;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
        this.f20391 = (C3079) c3948.m7850().m15105(this.f20391);
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۢ */
    public final String mo5193() {
        return this.f20391.mo5193();
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5194(C3948 c3948, C19705 c19705) {
        int iM11432 = this.f20391.m11432();
        if (c19705.m44765()) {
            c19705.m44760(4, "  annotations_off: ".concat(C16351.m37155(iM11432)));
        }
        c19705.m44773(iM11432);
    }
}
