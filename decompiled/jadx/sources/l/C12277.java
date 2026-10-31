package l;

/* JADX INFO: renamed from: l.۫۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X23D */
/* JADX INFO: loaded from: classes3.dex */
public final class C12277 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC0282 f36576;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f36577 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22155 f36578;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15098 f36579;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumC5222 f36580;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22155 m29809() {
        return this.f36578;
    }

    public final String toString() {
        StringBuilder sbM32307 = C13325.m32307(200, "<<\n mode: ");
        sbM32307.append(this.f36580);
        sbM32307.append("\n ecLevel: ");
        sbM32307.append(this.f36576);
        sbM32307.append("\n version: ");
        sbM32307.append(this.f36579);
        sbM32307.append("\n maskPattern: ");
        sbM32307.append(this.f36577);
        if (this.f36578 == null) {
            sbM32307.append("\n matrix: null\n");
        } else {
            sbM32307.append("\n matrix:\n");
            sbM32307.append(this.f36578);
        }
        sbM32307.append(">>\n");
        return sbM32307.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29812(EnumC5222 enumC5222) {
        this.f36580 = enumC5222;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29811(EnumC0282 enumC0282) {
        this.f36576 = enumC0282;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29813(C15098 c15098) {
        this.f36579 = c15098;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29810(int i) {
        this.f36577 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29814(C22155 c22155) {
        this.f36578 = c22155;
    }
}
