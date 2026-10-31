package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5739 extends AbstractC4328 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f17668;

    @Override // l.AbstractC4328, l.InterfaceC1274
    /* JADX INFO: renamed from: ۧ */
    public final long mo4334(C12521 c12521, long j) throws IOException {
        if (this.f13928) {
            throw new IllegalStateException("closed");
        }
        if (this.f17668) {
            return -1L;
        }
        long jMo4334 = super.mo4334(c12521, 8192L);
        if (jMo4334 != -1) {
            return jMo4334;
        }
        this.f17668 = true;
        m12985(true, null);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f13928) {
            return;
        }
        if (!this.f17668) {
            m12985(false, null);
        }
        this.f13928 = true;
    }
}
