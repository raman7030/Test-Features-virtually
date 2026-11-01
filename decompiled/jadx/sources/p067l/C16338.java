package p067l;

/* JADX INFO: renamed from: l.ܳᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y96B */
/* JADX INFO: loaded from: classes4.dex */
public final class C16338 {

    /* JADX INFO: renamed from: ۧ */
    public boolean f48007 = false;

    /* JADX INFO: renamed from: ֫ */
    public boolean f48006 = false;

    /* JADX INFO: renamed from: ܽ */
    public boolean f48008 = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: ۧ */
    public final void m37138() {
        InterfaceC14770 interfaceC14770Edit = ApplicationC21448.f67649.edit();
        boolean z = this.f48007;
        ?? r1 = z;
        if (this.f48006) {
            r1 = (z ? 1 : 0) | 2;
        }
        int i = r1;
        if (this.f48008) {
            i = (r1 == true ? 1 : 0) | 4;
        }
        interfaceC14770Edit.mo27874((byte) i, "edfa");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37137() {
        byte bMo20199 = ApplicationC21448.f67649.mo20199((byte) 0, "edfa");
        this.f48007 = (bMo20199 & 1) != 0;
        this.f48006 = (bMo20199 & 2) != 0;
        this.f48008 = (bMo20199 & 4) != 0;
    }
}
