package p067l;

/* JADX INFO: renamed from: l.᩶᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes5.dex */
public final class C21744 implements InterfaceC6321 {

    /* JADX INFO: renamed from: ֫ */
    public final C9578 f68460;

    /* JADX INFO: renamed from: ۧ */
    public final C8653 f68461;

    public C21744(C9578 c9578, C8653 c8653) {
        this.f68460 = c9578;
        this.f68461 = c8653;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m49022() {
        return this.f68460.m22313(this.f68461);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49023() {
        try {
            this.f68461.cancel(true);
        } catch (RuntimeException unused) {
        }
    }
}
