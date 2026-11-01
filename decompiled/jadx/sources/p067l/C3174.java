package p067l;

/* JADX INFO: renamed from: l.֨ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41VB */
/* JADX INFO: loaded from: classes2.dex */
public final class C3174 implements InterfaceC4790 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C4516 f6103;

    @Override // p067l.InterfaceC4790
    /* JADX INFO: renamed from: ֫ */
    public final void mo5457(C5187 c5187, C14574 c14574) {
        String strM26179;
        C7238 c7238 = new C7238(c14574.m14973(), c14574.m14972(), false);
        C4516 c4516 = this.f6103;
        if (c4516.m9550(c7238) || (strM26179 = C11262.m26179(c14574)) == null) {
            return;
        }
        c4516.m9549(c7238, strM26179);
    }

    @Override // p067l.InterfaceC4790
    /* JADX INFO: renamed from: ֫ */
    public final void mo5456(C5187 c5187, C11893 c11893) {
        String strM26179;
        C7238 c7238 = new C7238(c11893.m14973(), c11893.m14972(), true);
        C4516 c4516 = this.f6103;
        if (c4516.m9550(c7238) || (strM26179 = C11262.m26179(c11893)) == null) {
            return;
        }
        c4516.m9549(c7238, strM26179);
    }

    public C3174(C4516 c4516) {
        this.f6103 = c4516;
    }
}
