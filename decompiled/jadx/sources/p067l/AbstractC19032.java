package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ܿᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8JY */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19032 extends AbstractC21787 implements InterfaceC15266 {

    /* JADX INFO: renamed from: ۗ */
    public long f56736;

    /* JADX INFO: renamed from: ۬ */
    public InterfaceC15266 f56737;

    /* JADX INFO: renamed from: ֫ */
    public final void m43231(long j, InterfaceC15266 interfaceC15266, long j2) {
        this.f68601 = j;
        this.f56737 = interfaceC15266;
        if (j2 != C14849.FOREVER_NS) {
            j = j2;
        }
        this.f56736 = j;
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ֫ */
    public final int mo6890() {
        InterfaceC15266 interfaceC15266 = this.f56737;
        interfaceC15266.getClass();
        return interfaceC15266.mo6890();
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ֫ */
    public final long mo6892(int i) {
        InterfaceC15266 interfaceC15266 = this.f56737;
        interfaceC15266.getClass();
        return interfaceC15266.mo6892(i) + this.f56736;
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ֫ */
    public final int mo6891(long j) {
        InterfaceC15266 interfaceC15266 = this.f56737;
        interfaceC15266.getClass();
        return interfaceC15266.mo6891(j - this.f56736);
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ܽ */
    public final List mo6893(long j) {
        InterfaceC15266 interfaceC15266 = this.f56737;
        interfaceC15266.getClass();
        return interfaceC15266.mo6893(j - this.f56736);
    }

    @Override // p067l.AbstractC21787, p067l.AbstractC6364
    /* JADX INFO: renamed from: ۧ */
    public final void mo7() {
        super.mo7();
        this.f56737 = null;
    }
}
