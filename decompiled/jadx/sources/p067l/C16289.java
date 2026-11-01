package p067l;

/* JADX INFO: renamed from: l.ܳܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8NZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16289 implements InterfaceC10770 {

    /* JADX INFO: renamed from: ֫ */
    public int f47881;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC16716 f47882;

    /* JADX INFO: renamed from: ܳ */
    public C10307 f47883;

    /* JADX INFO: renamed from: ܽ */
    public C5931 f47884;

    /* JADX INFO: renamed from: ܿ */
    public C7638 f47885;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC12878 f47886;

    @Override // p067l.InterfaceC10770
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10770 mo24807() {
        return this;
    }

    @Override // p067l.InterfaceC10770
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10770 mo24808(C11915 c11915) {
        return this;
    }

    @Override // p067l.InterfaceC10770
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10770 mo24810(boolean z) {
        return this;
    }

    @Override // p067l.InterfaceC10770
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC10770 mo24809(InterfaceC12878 interfaceC12878) {
        m37083(interfaceC12878);
        return this;
    }

    public C16289(InterfaceC16716 interfaceC16716, InterfaceC21775 interfaceC21775) {
        C7638 c7638 = new C7638(interfaceC21775);
        C5931 c5931 = new C5931();
        C24356 c24356 = new C24356();
        this.f47882 = interfaceC16716;
        this.f47885 = c7638;
        this.f47884 = c5931;
        this.f47886 = c24356;
        this.f47881 = 1048576;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m37083(InterfaceC12878 interfaceC12878) {
        C23877.m52955(interfaceC12878, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f47886 = interfaceC12878;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37082(C10307 c10307) {
        this.f47883 = c10307;
    }

    @Override // p067l.InterfaceC10770
    /* JADX INFO: renamed from: ֫ */
    public final C25007 mo24806(C13010 c13010) {
        c13010.f36611.getClass();
        return new C25007(c13010, this.f47882, this.f47885, this.f47884.m13313(c13010), this.f47886, this.f47881, this.f47883);
    }
}
