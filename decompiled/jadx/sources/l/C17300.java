package l;

/* JADX INFO: renamed from: l.ܿۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84DG */
/* JADX INFO: loaded from: classes5.dex */
public final class C17300 implements InterfaceC1674 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18712 f53002;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f53003;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23650 f53004;

    public C17300(C23650 c23650, C18712 c18712, long j) {
        this.f53004 = c23650;
        this.f53002 = c18712;
        this.f53003 = j;
    }

    @Override // l.InterfaceC1674
    public final void cancel() {
        C23650 c23650 = this.f53004;
        EnumC22094 enumC22094M47645 = c23650.f76609.m18285().m47645();
        C18712 c18712 = this.f53002;
        C8148 c8148 = new C8148(enumC22094M47645, this.f53003, c18712.m43338(), c18712.m43333());
        try {
            c23650.f76608.m49948(Long.valueOf(this.f53003)).m36377(c8148, c18712.m43341());
        } catch (C2380 unused) {
            C23650.f76606.mo7079(c8148, "Failed to send {}");
        }
    }
}
