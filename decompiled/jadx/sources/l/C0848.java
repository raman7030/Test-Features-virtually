package l;

/* JADX INFO: renamed from: l.֨ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41VB */
/* JADX INFO: loaded from: classes2.dex */
public final class C0848 implements InterfaceC2548 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2260 f3329;

    @Override // l.InterfaceC2548
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3143(C2966 c2966, C12843 c12843) {
        String strM24169;
        C5124 c5124 = new C5124(c12843.m13109(), c12843.m13108(), false);
        C2260 c2260 = this.f3329;
        if (c2260.m7468(c5124) || (strM24169 = C9358.m24169(c12843)) == null) {
            return;
        }
        c2260.m7467(c5124, strM24169);
    }

    @Override // l.InterfaceC2548
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3142(C2966 c2966, C10022 c10022) {
        String strM24169;
        C5124 c5124 = new C5124(c10022.m13109(), c10022.m13108(), true);
        C2260 c2260 = this.f3329;
        if (c2260.m7468(c5124) || (strM24169 = C9358.m24169(c10022)) == null) {
            return;
        }
        c2260.m7467(c5124, strM24169);
    }

    public C0848(C2260 c2260) {
        this.f3329 = c2260;
    }
}
