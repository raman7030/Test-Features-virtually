package p067l;

/* JADX INFO: renamed from: l.ܿۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84DG */
/* JADX INFO: loaded from: classes5.dex */
public final class C18810 implements InterfaceC3959 {

    /* JADX INFO: renamed from: ֫ */
    public C20152 f56183;

    /* JADX INFO: renamed from: ۧ */
    public long f56184;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C24845 f56185;

    public C18810(C24845 c24845, C20152 c20152, long j) {
        this.f56185 = c24845;
        this.f56183 = c20152;
        this.f56184 = j;
    }

    @Override // p067l.InterfaceC3959
    public final void cancel() {
        C24845 c24845 = this.f56185;
        EnumC23366 enumC23366M49973 = c24845.f79355.m20233().m49973();
        C20152 c20152 = this.f56183;
        C10112 c10112 = new C10112(enumC23366M49973, this.f56184, c20152.m45605(), c20152.m45600());
        try {
            c24845.f79354.m52276(Long.valueOf(this.f56184)).m38535(c10112, c20152.m45608());
        } catch (C4630 unused) {
            C24845.f79352.mo9174(c10112, "Failed to send {}");
        }
    }
}
