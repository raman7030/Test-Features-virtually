package p067l;

/* JADX INFO: renamed from: l.᩹᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBE8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23867 extends AbstractC5289 {

    /* JADX INFO: renamed from: ۗ */
    public byte[] f75796;

    /* JADX INFO: renamed from: ۬ */
    public final C16271 f75797;

    public C23867(C16271 c16271) {
        super(1, -1);
        this.f75797 = c16271;
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5195(C6630 c6630, int i) {
        C19705 c19705 = new C19705();
        new C25129(c6630.m18447(), c19705).m55185((C12920) this.f75797, true);
        byte[] bArrM44779 = c19705.m44779();
        this.f75796 = bArrM44779;
        m11431(bArrM44779.length);
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۢ */
    public final String mo5193() {
        return this.f75797.mo4819();
    }

    public final String toString() {
        return this.f75797.toString();
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5194(C3948 c3948, C19705 c19705) {
        if (c19705.m44765()) {
            c19705.m44760(0, m11433() + " call site");
            new C25129(c3948, c19705).m55185((C12920) this.f75797, true);
            return;
        }
        c19705.m44764(this.f75796);
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_ENCODED_ARRAY_ITEM;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
        C25129.m55181(c3948, this.f75797);
    }
}
