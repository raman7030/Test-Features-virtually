package l;

/* JADX INFO: renamed from: l.۫ܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8IT */
/* JADX INFO: loaded from: classes3.dex */
public final class C12468 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8353 f37485;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10352 f37486;

    public C12468(C10352 c10352) {
        this.f37486 = c10352;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30628(final C6404 c6404) {
        C1297 c1297 = new C1297();
        c1297.m4453(c6404.f19815);
        c1297.m4457(c6404.f19813);
        c1297.m4465("video/raw");
        this.f37485 = c1297.m4440();
        this.f37486.f31158.execute(new Runnable() { // from class: l.۬ܳۧ
            @Override // java.lang.Runnable
            public final void run() {
                this.f39403.f37486.f31156.mo25026(c6404);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30627(long j, long j2, boolean z) {
        C10352 c10352 = this.f37486;
        if (z && c10352.f31160 != null) {
            c10352.f31158.execute(new Runnable() { // from class: l.ۙܳۧ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14942.f37486.f31156.mo25028();
                }
            });
        }
        C8353 c8353M4440 = this.f37485;
        if (c8353M4440 == null) {
            c8353M4440 = new C1297().m4440();
        }
        c10352.f31162.mo24148(j2, j, c8353M4440, null);
        ((InterfaceC14359) c10352.f31157.remove()).mo20217(j);
    }
}
