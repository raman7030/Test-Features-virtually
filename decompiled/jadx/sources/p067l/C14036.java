package p067l;

/* JADX INFO: renamed from: l.۫۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X23D */
/* JADX INFO: loaded from: classes3.dex */
public final class C14036 {

    /* JADX INFO: renamed from: ֫ */
    public EnumC2636 f39592;

    /* JADX INFO: renamed from: ۧ */
    public int f39593 = -1;

    /* JADX INFO: renamed from: ܽ */
    public C23424 f39594;

    /* JADX INFO: renamed from: ܿ */
    public C16717 f39595;

    /* JADX INFO: renamed from: ᩳ */
    public EnumC7331 f39596;

    /* JADX INFO: renamed from: ֫ */
    public final C23424 m31871() {
        return this.f39594;
    }

    public final String toString() {
        StringBuilder sbM34407 = C15033.m34407(200, "<<\n mode: ");
        sbM34407.append(this.f39596);
        sbM34407.append("\n ecLevel: ");
        sbM34407.append(this.f39592);
        sbM34407.append("\n version: ");
        sbM34407.append(this.f39595);
        sbM34407.append("\n maskPattern: ");
        sbM34407.append(this.f39593);
        if (this.f39594 == null) {
            sbM34407.append("\n matrix: null\n");
        } else {
            sbM34407.append("\n matrix:\n");
            sbM34407.append(this.f39594);
        }
        sbM34407.append(">>\n");
        return sbM34407.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31874(EnumC7331 enumC7331) {
        this.f39596 = enumC7331;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31873(EnumC2636 enumC2636) {
        this.f39592 = enumC2636;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31875(C16717 c16717) {
        this.f39595 = c16717;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31872(int i) {
        this.f39593 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31876(C23424 c23424) {
        this.f39594 = c23424;
    }
}
