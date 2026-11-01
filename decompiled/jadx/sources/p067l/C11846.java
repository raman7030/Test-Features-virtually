package p067l;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۤ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11846 extends AbstractC6481 {

    /* JADX INFO: renamed from: ۗ */
    public long f33047;

    public C11846(C13187 c13187, long j) {
        super(c13187);
        this.f33047 = j;
        if (j == 0) {
            m14849(true, null);
        }
    }

    @Override // p067l.AbstractC6481, p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۧ */
    public final long mo6580(C14268 c14268, long j) throws IOException {
        if (this.f16742) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.f33047;
        if (j2 == 0) {
            return -1L;
        }
        long jMo6580 = super.mo6580(c14268, Math.min(j2, 8192L));
        if (jMo6580 == -1) {
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m14849(false, protocolException);
            throw protocolException;
        }
        long j3 = this.f33047 - jMo6580;
        this.f33047 = j3;
        if (j3 == 0) {
            m14849(true, null);
        }
        return jMo6580;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM48500;
        if (this.f16742) {
            return;
        }
        if (this.f33047 != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zM48500 = C21407.m48500(this, 100);
            } catch (IOException unused) {
                zM48500 = false;
            }
            if (!zM48500) {
                m14849(false, null);
            }
        }
        this.f16742 = true;
    }
}
