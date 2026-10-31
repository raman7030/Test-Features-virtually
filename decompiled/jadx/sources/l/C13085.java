package l;

/* JADX INFO: renamed from: l.۬ۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E7M5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13085 implements InterfaceC11302 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12380 f39181;

    public C13085(C12380 c12380) {
        this.f39181 = c12380;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31721() {
        C12380 c12380 = this.f39181;
        int i = c12380.f37130 - 1;
        c12380.f37130 = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (C17651 c17651 : c12380.f37138) {
            i2 += c17651.m41379().f18978;
        }
        C13312[] c13312Arr = new C13312[i2];
        int i3 = 0;
        for (C17651 c17652 : c12380.f37138) {
            int i4 = c17652.m41379().f18978;
            int i5 = 0;
            while (i5 < i4) {
                c13312Arr[i3] = c17652.m41379().m17102(i5);
                i5++;
                i3++;
            }
        }
        c12380.f37122 = new C6181(c13312Arr);
        c12380.f37121.mo11120((InterfaceC9546) c12380);
    }

    @Override // l.InterfaceC19588
    /* JADX INFO: renamed from: ֫ */
    public final void mo11119(InterfaceC0536 interfaceC0536) {
        C12380 c12380 = this.f39181;
        c12380.f37121.mo11119((InterfaceC0536) c12380);
    }
}
