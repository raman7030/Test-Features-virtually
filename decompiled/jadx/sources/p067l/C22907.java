package p067l;

/* JADX INFO: renamed from: l.᩸ܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 04J6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22907 extends AbstractC4783 {

    /* JADX INFO: renamed from: ᩶ */
    public final int f72091;

    /* JADX INFO: renamed from: ᩸ */
    public final C14645 f72092;

    /* JADX INFO: renamed from: ᩹ */
    public final int f72093;

    public C22907(C14645 c14645, int i) {
        this.f72092 = c14645;
        this.f72093 = i;
        C3460 c3460M33503 = c14645.m33503(8);
        if (c3460M33503 != null && i < c3460M33503.m6187()) {
            this.f72091 = (i * 8) + c3460M33503.m6188();
            return;
        }
        throw new C6599(null, "Method handle index out of bounds: %d", Integer.valueOf(i));
    }

    @Override // p067l.InterfaceC20980
    /* JADX INFO: renamed from: ֫ۧ */
    public final int mo5178() {
        return this.f72092.m33504().m13856(this.f72091);
    }

    @Override // p067l.InterfaceC20980
    /* JADX INFO: renamed from: ᩻ۧ */
    public final InterfaceC10250 mo5179() {
        C14645 c14645 = this.f72092;
        int iM13856 = c14645.m33504().m13856(this.f72091 + 4);
        switch (mo5178()) {
            case 0:
            case 1:
            case 2:
            case 3:
                return new C16870(c14645, iM13856);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return c14645.m33495(iM13856);
            default:
                throw new C17034(null, "Invalid method handle type: %d", Integer.valueOf(mo5178()));
        }
    }

    @Override // p067l.AbstractC20877, p067l.InterfaceC10250
    /* JADX INFO: renamed from: ܿ */
    public final void mo12051() throws C3544 {
        int i = this.f72093;
        if (i >= 0) {
            C3460 c3460M33503 = this.f72092.m33503(8);
            if (i < (c3460M33503 == null ? 0 : c3460M33503.m6187())) {
                try {
                    mo5179();
                    return;
                } catch (C17034 e) {
                    throw new C3544(C20778.m46922(i, "methodhandle@"), e);
                }
            }
        }
        throw new C3544(C20778.m46922(i, "methodhandle@"));
    }
}
