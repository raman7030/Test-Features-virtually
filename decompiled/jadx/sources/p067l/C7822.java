package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7822 extends AbstractC6481 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f20513;

    @Override // p067l.AbstractC6481, p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۧ */
    public final long mo6580(C14268 c14268, long j) throws IOException {
        if (this.f16742) {
            throw new IllegalStateException("closed");
        }
        if (this.f20513) {
            return -1L;
        }
        long jMo6580 = super.mo6580(c14268, 8192L);
        if (jMo6580 != -1) {
            return jMo6580;
        }
        this.f20513 = true;
        m14849(true, null);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16742) {
            return;
        }
        if (!this.f20513) {
            m14849(false, null);
        }
        this.f16742 = true;
    }
}
