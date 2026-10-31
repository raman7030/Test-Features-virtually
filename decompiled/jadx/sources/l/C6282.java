package l;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P74O */
/* JADX INFO: loaded from: classes2.dex */
public final class C6282 extends MediaDataSource {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile IOException f19443;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC7505 f19444;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f19445;

    public C6282(InterfaceC7505 interfaceC7505) {
        long length = interfaceC7505.length();
        if (length < 0) {
            throw new IllegalArgumentException("Media handle length must be known");
        }
        this.f19444 = interfaceC7505;
        this.f19445 = length;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0 || i2 < 0) {
            return -1;
        }
        long j2 = this.f19445;
        if (j >= j2) {
            return -1;
        }
        int iMin = (int) Math.min(i2, j2 - j);
        try {
            this.f19444.mo8637(j, bArr, i, iMin);
            return iMin;
        } catch (IOException e) {
            synchronized (this) {
                if (this.f19443 == null) {
                    this.f19443 = e;
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17327() throws IOException {
        IOException iOException = this.f19443;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f19445;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f19444.close();
    }
}
