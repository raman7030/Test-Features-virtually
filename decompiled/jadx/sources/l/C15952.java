package l;

/* JADX INFO: renamed from: l.ܺ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1UY */
/* JADX INFO: loaded from: classes4.dex */
public final class C15952 implements InterfaceC2548 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2548 f49242;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f49243;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f49244 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f49245;

    public C15952(int i, int i2, InterfaceC2548 interfaceC2548) {
        this.f49245 = i2;
        this.f49243 = i & 7;
        this.f49242 = interfaceC2548;
    }

    @Override // l.InterfaceC2548
    /* JADX INFO: renamed from: ֫ */
    public final void mo3143(C2966 c2966, C12843 c12843) {
        int iM13107 = c12843.m13107();
        if ((this.f49244 & (~iM13107)) == 0 && (this.f49245 & iM13107) == 0) {
            int i = this.f49243;
            if (i == 0 || (iM13107 & i) != 0) {
                this.f49242.mo3143(c2966, c12843);
            }
        }
    }

    @Override // l.InterfaceC2548
    /* JADX INFO: renamed from: ֫ */
    public final void mo3142(C2966 c2966, C10022 c10022) {
        int iM13107 = c10022.m13107();
        if ((this.f49244 & (~iM13107)) == 0 && (this.f49245 & iM13107) == 0) {
            int i = this.f49243;
            if (i == 0 || (iM13107 & i) != 0) {
                this.f49242.mo3142(c2966, c10022);
            }
        }
    }
}
