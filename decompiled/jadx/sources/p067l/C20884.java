package p067l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: l.᩵۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: OA5R */
/* JADX INFO: loaded from: classes4.dex */
public final class C20884 extends OutputStream {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC12257 f65595;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ long f65596;

    /* JADX INFO: renamed from: ᩸ */
    public long f65597;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C2777 f65598;

    public C20884(C2777 c2777, long j, InterfaceC12257 interfaceC12257) {
        this.f65598 = c2777;
        this.f65596 = j;
        this.f65595 = interfaceC12257;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f65598.f4689) {
            throw new IOException("closed");
        }
        long j = this.f65596;
        if (j != -1 && this.f65597 + ((long) i2) > j) {
            StringBuilder sbM33191 = C14536.m33191("expected ", " bytes but received ", j);
            sbM33191.append(this.f65597);
            sbM33191.append(i2);
            throw new ProtocolException(sbM33191.toString());
        }
        this.f65597 += (long) i2;
        try {
            this.f65595.mo28281(i, i2, bArr);
        } catch (InterruptedIOException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        if (this.f65598.f4689) {
            return;
        }
        this.f65595.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws ProtocolException {
        C2777 c2777 = this.f65598;
        if (c2777.f4689) {
            return;
        }
        c2777.f4689 = true;
        this.f65595.close();
        long j = this.f65596;
        if (j == -1 || this.f65597 >= j) {
            return;
        }
        StringBuilder sbM33191 = C14536.m33191("expected ", " bytes but received ", j);
        sbM33191.append(this.f65597);
        throw new ProtocolException(sbM33191.toString());
    }
}
