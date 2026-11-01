package p067l;

import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۨ᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L8GV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13816 implements InterfaceC4502 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C15826 f39040;

    /* JADX INFO: renamed from: ᩹ */
    public long f39042 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f39041 = false;

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ֫ܽ */
    public final /* synthetic */ FileChannel mo9518() {
        return null;
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC4502 mo9520(long j, long j2) {
        return C17241.m39006(this, j, j2);
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ܺ */
    public final void mo9521() {
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ InterfaceC4502 mo9522(long j, long j2) {
        return C17241.m39005(this, j, j2);
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ᩻ܽ */
    public final /* synthetic */ boolean mo9523() {
        return false;
    }

    public C13816(C15826 c15826) {
        this.f39040 = c15826;
    }

    @Override // p067l.InterfaceC4502
    public final void seek(long j) throws IOException {
        if (j < 0) {
            throw new IOException(C17588.m40051(j, "offset < 0: "));
        }
        this.f39042 = j;
    }

    @Override // p067l.InterfaceC4502
    public final int read(byte[] bArr, int i, int i2) {
        int iM35922 = this.f39040.m35922(this.f39042, bArr, i, i2);
        if (iM35922 != -1) {
            this.f39042 += (long) iM35922;
        }
        return iM35922;
    }

    @Override // p067l.InterfaceC4502
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        throw new IOException("Unsupported");
    }

    @Override // p067l.InterfaceC4502
    public final long length() {
        return this.f39040.m35924();
    }

    @Override // p067l.InterfaceC4502
    public final void setLength(long j) throws IOException {
        throw new IOException("Unsupported");
    }

    @Override // p067l.InterfaceC4502
    public final long position() {
        return this.f39042;
    }

    @Override // p067l.InterfaceC4502
    public final String getName() {
        return this.f39040.f45828;
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC4502 mo9519() throws IOException {
        throw new IOException("Unsupported");
    }

    @Override // p067l.InterfaceC4502
    public final boolean isClosed() {
        return this.f39041;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f39041) {
            return;
        }
        this.f39041 = true;
        this.f39040.close();
    }
}
