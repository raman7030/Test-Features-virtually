package l;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۤ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9973 extends AbstractC4328 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f30088;

    public C9973(C11384 c11384, long j) {
        super(c11384);
        this.f30088 = j;
        if (j == 0) {
            m12985(true, null);
        }
    }

    @Override // l.AbstractC4328, l.InterfaceC1274
    /* JADX INFO: renamed from: ۧ */
    public final long mo4334(C12521 c12521, long j) throws IOException {
        if (this.f13928) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.f30088;
        if (j2 == 0) {
            return -1L;
        }
        long jMo4334 = super.mo4334(c12521, Math.min(j2, 8192L));
        if (jMo4334 == -1) {
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m12985(false, protocolException);
            throw protocolException;
        }
        long j3 = this.f30088 - jMo4334;
        this.f30088 = j3;
        if (j3 == 0) {
            m12985(true, null);
        }
        return jMo4334;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM46184;
        if (this.f13928) {
            return;
        }
        if (this.f30088 != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zM46184 = C20032.m46184(this, 100);
            } catch (IOException unused) {
                zM46184 = false;
            }
            if (!zM46184) {
                m12985(false, null);
            }
        }
        this.f13928 = true;
    }
}
