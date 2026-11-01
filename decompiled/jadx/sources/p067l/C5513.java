package p067l;

/* JADX INFO: renamed from: l.ۗܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V742 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5513 implements InterfaceC16716 {

    /* JADX INFO: renamed from: ۗ */
    public InterfaceC3306 f13179;

    /* JADX INFO: renamed from: ۤ */
    public InterfaceC16716 f13181;

    /* JADX INFO: renamed from: ۬ */
    public int f13183;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC22948 f13185;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f13186;

    /* JADX INFO: renamed from: ۙ */
    public C4172 f13180 = new C4172();

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC13560 f13184 = InterfaceC13560.f38140;

    /* JADX INFO: renamed from: ۫ */
    public boolean f13182 = true;

    /* JADX INFO: renamed from: ֫ */
    public final void m12150(C17762 c17762) {
        this.f13185 = c17762;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12151(C21607 c21607) {
        this.f13179 = c21607;
        this.f13186 = c21607 == null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12148(InterfaceC13560 interfaceC13560) {
        this.f13184 = interfaceC13560;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12149(InterfaceC16716 interfaceC16716) {
        this.f13181 = interfaceC16716;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12147(int i) {
        this.f13183 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12152() {
        this.f13182 = false;
    }

    @Override // p067l.InterfaceC16716
    /* JADX INFO: renamed from: ֫ */
    public final C14900 mo8449() {
        InterfaceC16716 interfaceC16716 = this.f13181;
        C6854 c6854M48808 = null;
        InterfaceC22753 interfaceC22753Mo8449 = interfaceC16716 != null ? interfaceC16716.mo8449() : null;
        int i = this.f13183;
        InterfaceC22948 interfaceC22948 = this.f13185;
        interfaceC22948.getClass();
        if (!this.f13186 && interfaceC22753Mo8449 != null) {
            InterfaceC3306 interfaceC3306 = this.f13179;
            if (interfaceC3306 == null) {
                C21607 c21607 = new C21607();
                c21607.m48809(interfaceC22948);
                c6854M48808 = c21607.m48808();
            } else {
                c6854M48808 = ((C21607) interfaceC3306).m48808();
            }
        }
        return new C14900(interfaceC22948, interfaceC22753Mo8449, this.f13180.mo8449(), c6854M48808, this.f13184, i, this.f13182);
    }
}
